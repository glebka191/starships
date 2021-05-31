package mappings

import model.{Ship, WorkShop}
import spray.json.DefaultJsonProtocol

trait JsonMappings extends DefaultJsonProtocol {
  implicit val workShopFormat = jsonFormat1(WorkShop)
  implicit val shipFormat = jsonFormat2(Ship)
}