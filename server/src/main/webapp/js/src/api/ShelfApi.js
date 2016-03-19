// require files in Node.js environment
var $, Drawer, Promoter, Shelf;
if (typeof module === 'object' && module.exports) {
  $ = require('jquery');
  Drawer = require('../model/Drawer.js');
  Promoter = require('../model/Promoter.js');
  Shelf = require('../model/Shelf.js');
}

// export module for AMD
if ( typeof define === "function" && define.amd ) {     
	define(['jquery', 'Drawer', 'Promoter', 'Shelf'], function($, Drawer, Promoter, Shelf) {
        return ShelfApi;
	 });
}

var ShelfApi = function ShelfApi() {
	var self = this;
  
  
  /**
   * Create drawer
   * .
   * @param {Drawer}  body Drawer object that needs to be added to a shelf
   * @param {function} callback the callback function
   * @return void
   */
  self.createDrawer = function(body, callback) {
    var postBody = JSON.stringify(body);
    var postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        //throw new ApiException(400, "Missing the required parameter 'body' when calling createDrawer");
        var errorRequiredMsg = "Missing the required parameter 'body' when calling createDrawer";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/drawer/", "\\{format\\}","json"));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "POST", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * 
   * 
   * @param {Integer}  drawerId ID of shelf to return
   * @param {function} callback the callback function
   * @return Drawer
   */
  self.drawerDrawerIdGet = function(drawerId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'drawerId' is set
     if (drawerId == null) {
        //throw new ApiException(400, "Missing the required parameter 'drawerId' when calling drawerDrawerIdGet");
        var errorRequiredMsg = "Missing the required parameter 'drawerId' when calling drawerDrawerIdGet";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/drawer/{drawerId}", "\\{format\\}","json")
, "\\{" + "drawerId" + "\\}", encodeURIComponent(drawerId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "GET", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      /**
        * @returns Drawer
        */
      
      var myResponse = new Drawer();
      myResponse.constructFromObject(response);
      if (callback) {
        callback(myResponse, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * 
   * 
   * @param {Integer}  drawerId ID of shelf to return
   * @param {function} callback the callback function
   * @return void
   */
  self.drawerDrawerIdPut = function(drawerId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'drawerId' is set
     if (drawerId == null) {
        //throw new ApiException(400, "Missing the required parameter 'drawerId' when calling drawerDrawerIdPut");
        var errorRequiredMsg = "Missing the required parameter 'drawerId' when calling drawerDrawerIdPut";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/drawer/{drawerId}", "\\{format\\}","json")
, "\\{" + "drawerId" + "\\}", encodeURIComponent(drawerId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "PUT", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * 
   * 
   * @param {Integer}  drawerId ID of shelf to return
   * @param {function} callback the callback function
   * @return void
   */
  self.drawerDrawerIdDelete = function(drawerId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'drawerId' is set
     if (drawerId == null) {
        //throw new ApiException(400, "Missing the required parameter 'drawerId' when calling drawerDrawerIdDelete");
        var errorRequiredMsg = "Missing the required parameter 'drawerId' when calling drawerDrawerIdDelete";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/drawer/{drawerId}", "\\{format\\}","json")
, "\\{" + "drawerId" + "\\}", encodeURIComponent(drawerId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "DELETE", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * Promote a URI to a shelf
   * Promotes a url to a shelf, creates a promoter if url does not exist
   * @param {String}  wardrobeUrl location of shelf to promote to
   * @param {String}  promoteUrl uri to promote
   * @param {function} callback the callback function
   * @return void
   */
  self.promoteShelf = function(wardrobeUrl, promoteUrl, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'wardrobeUrl' is set
     if (wardrobeUrl == null) {
        //throw new ApiException(400, "Missing the required parameter 'wardrobeUrl' when calling promoteShelf");
        var errorRequiredMsg = "Missing the required parameter 'wardrobeUrl' when calling promoteShelf";
        throw errorRequiredMsg;
     }
     
     // verify the required parameter 'promoteUrl' is set
     if (promoteUrl == null) {
        //throw new ApiException(400, "Missing the required parameter 'promoteUrl' when calling promoteShelf");
        var errorRequiredMsg = "Missing the required parameter 'promoteUrl' when calling promoteShelf";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/promote", "\\{format\\}","json"));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    queryParams.wardrobeUrl = wardrobeUrl;
    
    queryParams.promoteUrl = promoteUrl;
    
    
    

    path += createQueryString(queryParams);

    var options = {type: "POST", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * Create drawer
   * .
   * @param {Drawer}  body Drawer object that needs to be added to a shelf
   * @param {function} callback the callback function
   * @return void
   */
  self.createPromoter = function(body, callback) {
    var postBody = JSON.stringify(body);
    var postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        //throw new ApiException(400, "Missing the required parameter 'body' when calling createPromoter");
        var errorRequiredMsg = "Missing the required parameter 'body' when calling createPromoter";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/promoter", "\\{format\\}","json"));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "POST", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * 
   * 
   * @param {Integer}  promoterId ID of promoter to return
   * @param {function} callback the callback function
   * @return Promoter
   */
  self.promoterPromoterIdGet = function(promoterId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'promoterId' is set
     if (promoterId == null) {
        //throw new ApiException(400, "Missing the required parameter 'promoterId' when calling promoterPromoterIdGet");
        var errorRequiredMsg = "Missing the required parameter 'promoterId' when calling promoterPromoterIdGet";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/promoter/{promoterId}", "\\{format\\}","json")
, "\\{" + "promoterId" + "\\}", encodeURIComponent(promoterId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "GET", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      /**
        * @returns Promoter
        */
      
      var myResponse = new Promoter();
      myResponse.constructFromObject(response);
      if (callback) {
        callback(myResponse, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * 
   * 
   * @param {Integer}  promoterId ID of promoter to update
   * @param {function} callback the callback function
   * @return void
   */
  self.promoterPromoterIdPut = function(promoterId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'promoterId' is set
     if (promoterId == null) {
        //throw new ApiException(400, "Missing the required parameter 'promoterId' when calling promoterPromoterIdPut");
        var errorRequiredMsg = "Missing the required parameter 'promoterId' when calling promoterPromoterIdPut";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/promoter/{promoterId}", "\\{format\\}","json")
, "\\{" + "promoterId" + "\\}", encodeURIComponent(promoterId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "PUT", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * 
   * 
   * @param {Integer}  promoterId ID of promoter to delete
   * @param {function} callback the callback function
   * @return void
   */
  self.promoterPromoterIdDelete = function(promoterId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'promoterId' is set
     if (promoterId == null) {
        //throw new ApiException(400, "Missing the required parameter 'promoterId' when calling promoterPromoterIdDelete");
        var errorRequiredMsg = "Missing the required parameter 'promoterId' when calling promoterPromoterIdDelete";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/promoter/{promoterId}", "\\{format\\}","json")
, "\\{" + "promoterId" + "\\}", encodeURIComponent(promoterId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "DELETE", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * rollback a single item
   * rollback one version previous
   * @param {String}  wardrobeUrl location of shelf to rollback
   * @param {function} callback the callback function
   * @return void
   */
  self.rollbackShelf = function(wardrobeUrl, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'wardrobeUrl' is set
     if (wardrobeUrl == null) {
        //throw new ApiException(400, "Missing the required parameter 'wardrobeUrl' when calling rollbackShelf");
        var errorRequiredMsg = "Missing the required parameter 'wardrobeUrl' when calling rollbackShelf";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/rollback", "\\{format\\}","json"));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    queryParams.wardrobeUrl = wardrobeUrl;
    
    
    

    path += createQueryString(queryParams);

    var options = {type: "POST", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * Find shelf by ID
   * Returns a single shelf
   * @param {Integer}  shelfId ID of shelf to return
   * @param {function} callback the callback function
   * @return Shelf
   */
  self.getShelfById = function(shelfId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'shelfId' is set
     if (shelfId == null) {
        //throw new ApiException(400, "Missing the required parameter 'shelfId' when calling getShelfById");
        var errorRequiredMsg = "Missing the required parameter 'shelfId' when calling getShelfById";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/shelf/{shelfId}", "\\{format\\}","json")
, "\\{" + "shelfId" + "\\}", encodeURIComponent(shelfId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "GET", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      /**
        * @returns Shelf
        */
      
      var myResponse = new Shelf();
      myResponse.constructFromObject(response);
      if (callback) {
        callback(myResponse, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * Update an existing shelf
   * 
   * @param {Integer}  shelfId ID of shelf to return
   * @param {function} callback the callback function
   * @return void
   */
  self.updateShelf = function(shelfId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'shelfId' is set
     if (shelfId == null) {
        //throw new ApiException(400, "Missing the required parameter 'shelfId' when calling updateShelf");
        var errorRequiredMsg = "Missing the required parameter 'shelfId' when calling updateShelf";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/shelf/{shelfId}", "\\{format\\}","json")
, "\\{" + "shelfId" + "\\}", encodeURIComponent(shelfId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "PUT", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * Update an existing shelf
   * 
   * @param {Integer}  shelfId ID of shelf to return
   * @param {function} callback the callback function
   * @return void
   */
  self.deleteShelf = function(shelfId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'shelfId' is set
     if (shelfId == null) {
        //throw new ApiException(400, "Missing the required parameter 'shelfId' when calling deleteShelf");
        var errorRequiredMsg = "Missing the required parameter 'shelfId' when calling deleteShelf";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/shelf/{shelfId}", "\\{format\\}","json")
, "\\{" + "shelfId" + "\\}", encodeURIComponent(shelfId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "DELETE", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * Find shelf by ID
   * Returns a single shelf
   * @param {Integer}  shelfId ID of shelf to promote
   * @param {Integer}  promoterId ID of promoter to promote from
   * @param {function} callback the callback function
   * @return void
   */
  self.promoteDrawerId = function(shelfId, promoterId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'shelfId' is set
     if (shelfId == null) {
        //throw new ApiException(400, "Missing the required parameter 'shelfId' when calling promoteDrawerId");
        var errorRequiredMsg = "Missing the required parameter 'shelfId' when calling promoteDrawerId";
        throw errorRequiredMsg;
     }
     
     // verify the required parameter 'promoterId' is set
     if (promoterId == null) {
        //throw new ApiException(400, "Missing the required parameter 'promoterId' when calling promoteDrawerId");
        var errorRequiredMsg = "Missing the required parameter 'promoterId' when calling promoteDrawerId";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/shelf/{shelfId}/promote/{promoterId}", "\\{format\\}","json")
, "\\{" + "shelfId" + "\\}", encodeURIComponent(shelfId.toString())
, "\\{" + "promoterId" + "\\}", encodeURIComponent(promoterId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "GET", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * Find shelf by ID
   * Returns a single shelf
   * @param {Integer}  shelfId ID of shelf to rollback
   * @param {Integer}  drawerId ID of drawer to rollback to
   * @param {function} callback the callback function
   * @return void
   */
  self.rollbackToDrawerId = function(shelfId, drawerId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'shelfId' is set
     if (shelfId == null) {
        //throw new ApiException(400, "Missing the required parameter 'shelfId' when calling rollbackToDrawerId");
        var errorRequiredMsg = "Missing the required parameter 'shelfId' when calling rollbackToDrawerId";
        throw errorRequiredMsg;
     }
     
     // verify the required parameter 'drawerId' is set
     if (drawerId == null) {
        //throw new ApiException(400, "Missing the required parameter 'drawerId' when calling rollbackToDrawerId");
        var errorRequiredMsg = "Missing the required parameter 'drawerId' when calling rollbackToDrawerId";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/shelf/{shelfId}/rollback/{drawerId}", "\\{format\\}","json")
, "\\{" + "shelfId" + "\\}", encodeURIComponent(shelfId.toString())
, "\\{" + "drawerId" + "\\}", encodeURIComponent(drawerId.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "GET", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  

 	function replaceAll (haystack, needle, replace) {
		var result= haystack;
		if (needle !=null && replace!=null) {
			result= haystack.replace(new RegExp(needle, 'g'), replace);
		}
		return result;
	}

 	function createQueryString (queryParams) {
		var queryString ='';
		var i = 0;
		for (var queryParamName in queryParams) {
			if (i==0) {
				queryString += '?' ;
			} else {
				queryString += '&' ;
			}
			
			queryString +=  queryParamName + '=' + encodeURIComponent(queryParams[queryParamName]);
			i++;
		}
		
		return queryString;
	}
}

// export module for Node.js
if (typeof module === 'object' && module.exports) {
  module.exports = ShelfApi;
}
