package com.nma.wardrobe.client.api

import java.io.{FileInputStream, InputStream}

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport

import scala.xml.XML

/**
  * Created by nickma on 2016-03-19.
  */
class ReactTutorialAPI extends ScalatraServlet
  with JacksonJsonSupport {
  override protected implicit def jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }

  post("/") {
    println("post")
    println(request.body)
  }

  get("/") {
    val stream : InputStream = getClass.getResourceAsStream("/comments.json")
    readJsonFromStream(stream)
  }
}
