package com.nma.wardrobe.app.web

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport

/**
  * Created by nickma on 2016-03-19.
  */
class IndexServlet extends ScalatraServlet
with ScalateSupport {

  get("/")
  {
    contentType = "text/html"

    layoutTemplate("/index.ssp")
  }

}
