// require files in Node.js environment

if (typeof module === 'object' && module.exports) {
  
}




//export module
if ( typeof define === "function" && define.amd ) {
  define('Promoter', ['jquery'],
    function($) {
      return Promoter;
   });
}


var Promoter = function Promoter() { 
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
  self.address = null;
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.id = data.id;
    
    self.name = data.name;
    
    self.address = data.address;
    
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
  self.getAddress = function() {
    return self.address;
  }

  /**
   * @param {String} address
   **/
  self.setAddress = function (address) {
    self.address = address;
  }
  

  self.toJson = function () {
    return JSON.stringify(self);
  }
}

if (typeof module === 'object' && module.exports) {
  module.exports = Promoter;
}
