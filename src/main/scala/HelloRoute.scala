import io.xtech.babel.camel.builder.RouteBuilder
import io.xtech.babel.camel.mock._
import org.apache.camel.impl.DefaultCamelContext

import scala.collection.immutable


class HelloRoute extends RouteBuilder with Mock {

  from("direct:hello").log("Hello ${body}")
}

object HelloRoute {
  private val vowel = immutable.Set('a', 'e', 'i', 'o', 'u', 'y')
  
  def vowelAndConsonant(str: String): (Array[Char],Array[Char]) = str.toCharArray.partition(vowel.contains)
}

object Main extends App {
  val context = new DefaultCamelContext
  new HelloRoute().addRoutesToCamelContext(context)
  context.start

  //sends "World" to the route
  context.createProducerTemplate().sendBody("direct:hello", "World")

}

