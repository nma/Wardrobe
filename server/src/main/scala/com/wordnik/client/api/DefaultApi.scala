package com.wordnik.client.api

import com.wordnik.client.model.Shelf

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class DefaultApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "DefaultApi"
  override protected val applicationName: Option[String] = Some("Default")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val addShelfOperation = (apiOperation[Unit]("addShelf")
      summary ""
      parameters(bodyParam[Shelf]("body").description(""))
  )

  post("/shelf",operation(addShelfOperation)) {
    
    
    
                
bodyParam[Shelf]("body").description("")
    
    println("body: " + body)
  
  }

}