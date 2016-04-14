package com.nma.wardrobe.app.api

import com.nma.wardrobe.app.model.Drawer
import com.nma.wardrobe.app.model.Promoter
import com.nma.wardrobe.app.model.Shelf
import java.io.File

import org.scalatra.{NotImplemented, ScalatraServlet, TypedParamSupport}
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{JValueResult, JacksonJsonSupport}
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ShelfApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ShelfApi"
  override protected val applicationName: Option[String] = Some("Shelf")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }

  val addShelfOperation = (apiOperation[Unit]("addShelf")
    summary ""
    parameters(bodyParam[Shelf]("body").description(""))
    )

  post("/shelf",operation(addShelfOperation)) {


    val body = bodyParam[Shelf]("body").description("")

    println("body: " + body)
    NotImplemented
  }
  

  val createDrawerOperation = (apiOperation[Unit]("createDrawer")
      summary "Create drawer"
      parameters(bodyParam[Drawer]("body").description(""))
  )

  post("/drawer/",operation(createDrawerOperation)) {




    val body = bodyParam[Drawer]("body").description("")
    
    println("body: " + body)
  
  }

  

  val drawerDrawerIdGetOperation = (apiOperation[Drawer]("drawerDrawerIdGet")
      summary ""
      parameters(pathParam[Long]("drawerId").description(""))
  )

  get("/drawer/{drawerId}",operation(drawerDrawerIdGetOperation)) {
    
    
    
      val drawerId = params.getOrElse("drawerId", halt(400))
                

    
    println("drawerId: " + drawerId)
  
  }

  

  val drawerDrawerIdPutOperation = (apiOperation[Unit]("drawerDrawerIdPut")
      summary ""
      parameters(pathParam[Long]("drawerId").description(""))
  )

  put("/drawer/{drawerId}",operation(drawerDrawerIdPutOperation)) {
    
    
    
      val drawerId = params.getOrElse("drawerId", halt(400))
                

    
    println("drawerId: " + drawerId)
  
  }

  

  val drawerDrawerIdDeleteOperation = (apiOperation[Unit]("drawerDrawerIdDelete")
      summary ""
      parameters(pathParam[Long]("drawerId").description(""))
  )

  delete("/drawer/{drawerId}",operation(drawerDrawerIdDeleteOperation)) {
    
    
    
      val drawerId = params.getOrElse("drawerId", halt(400))
                

    
    println("drawerId: " + drawerId)
  
  }

  

  val promoteShelfOperation = (apiOperation[Unit]("promoteShelf")
      summary "Promote a URI to a shelf"
      parameters(queryParam[String]("wardrobeUrl").description(""),
        queryParam[String]("promoteUrl").description(""))
  )

  post("/promote",operation(promoteShelfOperation)) {
    
    
    
        
      
      val wardrobeUrl = params.getAs[String]("wardrobeUrl")
            

    
    println("wardrobeUrl: " + wardrobeUrl)
  
    
    
        
      
      val promoteUrl = params.getAs[String]("promoteUrl")
            

    
    println("promoteUrl: " + promoteUrl)
  
  }

  

  val createPromoterOperation = (apiOperation[Unit]("createPromoter")
      summary "Create drawer"
      parameters(bodyParam[Drawer]("body").description(""))
  )

  post("/promoter",operation(createPromoterOperation)) {




    val body = bodyParam[Drawer]("body").description("")
    
    println("body: " + body)
  
  }

  

  val promoterPromoterIdGetOperation = (apiOperation[Promoter]("promoterPromoterIdGet")
      summary ""
      parameters(pathParam[Long]("promoterId").description(""))
  )

  get("/promoter/{promoterId}",operation(promoterPromoterIdGetOperation)) {
    
    
    
      val promoterId = params.getOrElse("promoterId", halt(400))
                

    
    println("promoterId: " + promoterId)
  
  }

  

  val promoterPromoterIdPutOperation = (apiOperation[Unit]("promoterPromoterIdPut")
      summary ""
      parameters(pathParam[Long]("promoterId").description(""))
  )

  put("/promoter/{promoterId}",operation(promoterPromoterIdPutOperation)) {
    
    
    
      val promoterId = params.getOrElse("promoterId", halt(400))
                

    
    println("promoterId: " + promoterId)
  
  }

  

  val promoterPromoterIdDeleteOperation = (apiOperation[Unit]("promoterPromoterIdDelete")
      summary ""
      parameters(pathParam[Long]("promoterId").description(""))
  )

  delete("/promoter/{promoterId}",operation(promoterPromoterIdDeleteOperation)) {
    
    
    
      val promoterId = params.getOrElse("promoterId", halt(400))
                

    
    println("promoterId: " + promoterId)
  
  }

  

  val rollbackShelfOperation = (apiOperation[Unit]("rollbackShelf")
      summary "rollback a single item"
      parameters(queryParam[String]("wardrobeUrl").description(""))
  )

  post("/rollback",operation(rollbackShelfOperation)) {
    
    
    
        
      
      val wardrobeUrl = params.getAs[String]("wardrobeUrl")
            

    
    println("wardrobeUrl: " + wardrobeUrl)
  
  }

  

  val getShelfByIdOperation = (apiOperation[Shelf]("getShelfById")
      summary "Find shelf by ID"
      parameters(pathParam[Long]("shelfId").description(""))
  )

  get("/shelf/{shelfId}",operation(getShelfByIdOperation)) {
    
    
    
      val shelfId = params.getOrElse("shelfId", halt(400))
                

    
    println("shelfId: " + shelfId)
  
  }

  

  val updateShelfOperation = (apiOperation[Unit]("updateShelf")
      summary "Update an existing shelf"
      parameters(pathParam[Long]("shelfId").description(""))
  )

  put("/shelf/{shelfId}",operation(updateShelfOperation)) {
    
    
    
      val shelfId = params.getOrElse("shelfId", halt(400))
                

    
    println("shelfId: " + shelfId)
  
  }

  

  val deleteShelfOperation = (apiOperation[Unit]("deleteShelf")
      summary "Update an existing shelf"
      parameters(pathParam[Long]("shelfId").description(""))
  )

  delete("/shelf/{shelfId}",operation(deleteShelfOperation)) {
    
    
    
      val shelfId = params.getOrElse("shelfId", halt(400))
                

    
    println("shelfId: " + shelfId)
  
  }

  

  val promoteDrawerIdOperation = (apiOperation[Unit]("promoteDrawerId")
      summary "Find shelf by ID"
      parameters(pathParam[Long]("shelfId").description(""),
        pathParam[Long]("promoterId").description(""))
  )

  get("/shelf/{shelfId}/promote/{promoterId}",operation(promoteDrawerIdOperation)) {
    
    
    
      val shelfId = params.getOrElse("shelfId", halt(400))
                

    
    println("shelfId: " + shelfId)
  
    
    
      val promoterId = params.getOrElse("promoterId", halt(400))
                

    
    println("promoterId: " + promoterId)
  
  }

  

  val rollbackToDrawerIdOperation = (apiOperation[Unit]("rollbackToDrawerId")
      summary "Find shelf by ID"
      parameters(pathParam[Long]("shelfId").description(""),
        pathParam[Long]("drawerId").description(""))
  )

  get("/shelf/{shelfId}/rollback/{drawerId}",operation(rollbackToDrawerIdOperation)) {
    
    
    
      val shelfId = params.getOrElse("shelfId", halt(400))
                

    
    println("shelfId: " + shelfId)
  
    
    
      val drawerId = params.getOrElse("drawerId", halt(400))
                

    
    println("drawerId: " + drawerId)
  
  }

}