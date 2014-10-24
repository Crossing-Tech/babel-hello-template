import io.xtech.babel.camel.mock._
import org.apache.camel.impl.DefaultCamelContext
import org.specs2.mutable.SpecificationWithJUnit

class HelloRouteSpec extends SpecificationWithJUnit {

  "Hello route" in {

    val camelContext = new DefaultCamelContext()

    new HelloRoute().addRoutesToCamelContext(camelContext)
    camelContext.start()

    camelContext.createProducerTemplate().sendBody("direct:hello", "World")

    success
  }
}
