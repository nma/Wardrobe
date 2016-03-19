// require files in Node.js environment
var $, Shelf;
if (typeof module === 'object' && module.exports) {
  $ = require('jquery');
  Shelf = require('../model/Shelf.js');
}

// export module for AMD
if ( typeof define === "function" && define.amd ) {     
	define(['jquery', 'Shelf'], function($, Shelf) {
        return DefaultApi;
	 });
}

var DefaultApi = function DefaultApi() {
	var self = this;
  
  
  /**
   * 
   * 
   * @param {Shelf}  body Shelf object that needs to be added to the wardrobe
   * @param {function} callback the callback function
   * @return void
   */
  self.addShelf = function(body, callback) {
    var postBody = JSON.stringify(body);
    var postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        //throw new ApiException(400, "Missing the required parameter 'body' when calling addShelf");
        var errorRequiredMsg = "Missing the required parameter 'body' when calling addShelf";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'http://localhost/v1';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/shelf", "\\{format\\}","json"));

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
  module.exports = DefaultApi;
}
