package com.nma.wardrobe.app.api

import java.io._

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport


/**
  * Created by nickma on 2016-03-19.
  */
class ReactTutorialAPI extends ScalatraServlet with JacksonJsonSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  before() {

    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }

  case class Comment(id: Int, author: String, text: String)

  post("/") {
    println("routed to post method")

    val stream : InputStream = getClass.getResourceAsStream("/comments.json")
    val comments = parse(stream).extract[List[Comment]]
    println("streamed stuff")

    comments :+ Comment(System.currentTimeMillis.asInstanceOf[Int], params("author"), params("text"))

    println(comments.length)
    println(comments.toString())

    val file = new File(getClass.getResource("/comments.json").getFile())
//    val bw = new BufferedWriter(new FileWriter(file))
//    bw.write("")
//    bw.close()

    redirect("/")
  }

  get("/") {
    val stream : InputStream = getClass.getResourceAsStream("/comments.json")
    readJsonFromStream(stream)
  }
}
