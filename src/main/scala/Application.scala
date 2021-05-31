import akka.actor.ActorSystem
import akka.http.scaladsl.Http

object Application extends App with Routes {
    private implicit val system = ActorSystem()
    Http().newServerAt("localhost", 8888).bind(routes)
}
