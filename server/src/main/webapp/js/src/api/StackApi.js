// require files in Node.js environment
var $, Stack;
if (typeof module === 'object' && module.exports) {
  $ = require('jquery');
  Stack = require('../model/Stack.js');
}

// export module for AMD
if ( typeof define === "function" && define.amd ) {     
	define(['jquery', 'Stack'], function($, Stack) {
        return StackApi;
	 });
}

var StackApi = function StackApi() {
	var self = this;
  
  
  /**
   * Create stack
   * .
   * @param {Stack}  body Stack object that needs to be added to a shelf
   * @param {function} callback the callback function
   * @return void
   */
  self.createStack = function(body, callback) {
    var postBody = JSON.stringify(body);
    var postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        //throw new ApiException(400, "Missing the required parameter 'body' when calling createStack");
        var errorRequiredMsg = "Missing the required parameter 'body' when calling createStack";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/stack/", "\\{format\\}","json"));

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
   * @param {Integer}  stackId ID of stack to return
   * @param {function} callback the callback function
   * @return Stack
   */
  self.stackStackIdGet = function(stackId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'stackId' is set
     if (stackId == null) {
        //throw new ApiException(400, "Missing the required parameter 'stackId' when calling stackStackIdGet");
        var errorRequiredMsg = "Missing the required parameter 'stackId' when calling stackStackIdGet";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/stack/{stackId}", "\\{format\\}","json")
, "\\{" + "stackId" + "\\}", encodeURIComponent(stackId.toString()));

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
        * @returns Stack
        */
      
      var myResponse = new Stack();
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
   * @param {Integer}  stackId ID of shelf to update
   * @param {function} callback the callback function
   * @return void
   */
  self.stackStackIdPut = function(stackId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'stackId' is set
     if (stackId == null) {
        //throw new ApiException(400, "Missing the required parameter 'stackId' when calling stackStackIdPut");
        var errorRequiredMsg = "Missing the required parameter 'stackId' when calling stackStackIdPut";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/stack/{stackId}", "\\{format\\}","json")
, "\\{" + "stackId" + "\\}", encodeURIComponent(stackId.toString()));

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
   * @param {Integer}  stackId ID of stack to delete
   * @param {function} callback the callback function
   * @return void
   */
  self.stackStackIdDelete = function(stackId, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'stackId' is set
     if (stackId == null) {
        //throw new ApiException(400, "Missing the required parameter 'stackId' when calling stackStackIdDelete");
        var errorRequiredMsg = "Missing the required parameter 'stackId' when calling stackStackIdDelete";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/stack/{stackId}", "\\{format\\}","json")
, "\\{" + "stackId" + "\\}", encodeURIComponent(stackId.toString()));

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
  module.exports = StackApi;
}
