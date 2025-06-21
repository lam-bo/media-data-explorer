package com.lamboapps.mediadataexplorer

import spray.json.RootJsonFormat
import spray.json.DefaultJsonProtocol
import com.lamboapps.mediadataexplorer.UserRegistry.ActionPerformed

object JsonFormats  {
  // import the default encoders for primitive types (Int, String, Lists etc)
  import DefaultJsonProtocol._

  implicit val userJsonFormat: RootJsonFormat[User] = jsonFormat3(User.apply)
  implicit val usersJsonFormat: RootJsonFormat[Users] = jsonFormat1(Users.apply)

  implicit val actionPerformedJsonFormat: RootJsonFormat[ActionPerformed]  = jsonFormat1(ActionPerformed.apply)
}
