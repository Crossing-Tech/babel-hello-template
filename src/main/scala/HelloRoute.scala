import io.xtech.babel.camel.builder.RouteBuilder
import io.xtech.babel.camel.model.Aggregation.{CompletionSize, FoldBody}
import io.xtech.babel.fish.model.Message
import io.xtech.babel.camel.mock._

class HelloRoute extends RouteBuilder with Mock {

    from("direct:hello").processBody(x => "Hello " + x).log("${body}")
}
