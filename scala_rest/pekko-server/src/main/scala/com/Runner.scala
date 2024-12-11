package com

import org.apache.pekko
import pekko.actor.typed.ActorSystem
import pekko.actor.typed.scaladsl.Behaviors
import pekko.http.scaladsl.Http
import pekko.http.scaladsl.model._
import pekko.http.scaladsl.server.Directives._
import scala.io.StdIn


object Runner extends App{
    println("ok")
    implicit val system = ActorSystem(Behaviors.empty, "my-system")
    implicit val executionContext = system.executionContext

    val route =
        path("hello") {
            get {
                complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to Pekko HTTP</h1>"))
            }
        }

    val bindingFuture = Http().newServerAt("localhost", 8080).bind(route)
    println(s"Server now online. Please navigate to http://localhost:8080/hello\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
}
