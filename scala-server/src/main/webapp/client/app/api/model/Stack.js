// require files in Node.js environment
var Shelf;
if (typeof module === 'object' && module.exports) {
  
  Shelf = require('./Shelf.js');
}




//export module
if ( typeof define === "function" && define.amd ) {
  define('Stack', ['jquery''Array'],
    function($Array) {
      return Stack;
   });
}


var Stack = function Stack() { 
  var self = this;
  
  /**
   * datatype: Integer
   **/
  self.id = null;
  
  /**
   * datatype: String
   **/
  self.name = null;
  
  /**
   * datatype: String
   **/
  self.authGroup = null;
  
  /**
   * datatype: Array
   **/
  self.shelves = [];
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.id = data.id;
    
    self.name = data.name;
    
    self.authGroup = data.authGroup;
    
    self.shelves = new Array();
    
  }

  
  /**
   * @return {Integer}
   **/
  self.getId = function() {
    return self.id;
  }

  /**
   * @param {Integer} id
   **/
  self.setId = function (id) {
    self.id = id;
  }
  
  /**
   * @return {String}
   **/
  self.getName = function() {
    return self.name;
  }

  /**
   * @param {String} name
   **/
  self.setName = function (name) {
    self.name = name;
  }
  
  /**
   * @return {String}
   **/
  self.getAuthGroup = function() {
    return self.authGroup;
  }

  /**
   * @param {String} authGroup
   **/
  self.setAuthGroup = function (authGroup) {
    self.authGroup = authGroup;
  }
  
  /**
   * @return {Array}
   **/
  self.getShelves = function() {
    return self.shelves;
  }

  /**
   * @param {Array} shelves
   **/
  self.setShelves = function (shelves) {
    self.shelves = shelves;
  }
  

  self.toJson = function () {
    return JSON.stringify(self);
  }
}

if (typeof module === 'object' && module.exports) {
  module.exports = Stack;
}
