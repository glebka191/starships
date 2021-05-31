package api

import akka.http.scaladsl.server.Directives._
import mappings.JsonMappings

trait Rest extends JsonMappings {
  val api =
      (path("next") & get) {
      complete()
      } ~
      (path("numberOfPlaces") & post) {
        entity(as[]) { ? =>
          complete()
        }
      } ~
      (path("ship") & post) {
        entity(as[]) { ? =>
          complete()
        }
      }
}
