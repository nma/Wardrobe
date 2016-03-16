// require files in Node.js environment
var Drawer;var Promoter;
if (typeof module === 'object' && module.exports) {
  
  Drawer = require('./Drawer.js');
  Promoter = require('./Promoter.js');
}




//export module
if ( typeof define === "function" && define.amd ) {
  define('Shelf', ['jquery', 'Array', 'Array''Drawer'],
    function($, Array, ArrayDrawer) {
      return Shelf;
   });
}


var Shelf = function Shelf() { 
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
  self.url = null;
  
  /**
   * datatype: Array
   **/
  self.promoters = [];
  
  /**
   * datatype: Array
   **/
  self.drawers = [];
  
  /**
   * datatype: Drawer
   **/
  self.latest = new Drawer();
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.id = data.id;
    
    self.name = data.name;
    
    self.url = data.url;
    
    self.promoters = new Array();
    
    self.drawers = new Array();
    
    self.latest.constructFromObject(data.latest);
    
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
  self.getUrl = function() {
    return self.url;
  }

  /**
   * @param {String} url
   **/
  self.setUrl = function (url) {
    self.url = url;
  }
  
  /**
   * @return {Array}
   **/
  self.getPromoters = function() {
    return self.promoters;
  }

  /**
   * @param {Array} promoters
   **/
  self.setPromoters = function (promoters) {
    self.promoters = promoters;
  }
  
  /**
   * @return {Array}
   **/
  self.getDrawers = function() {
    return self.drawers;
  }

  /**
   * @param {Array} drawers
   **/
  self.setDrawers = function (drawers) {
    self.drawers = drawers;
  }
  
  /**
   * @return {Drawer}
   **/
  self.getLatest = function() {
    return self.latest;
  }

  /**
   * @param {Drawer} latest
   **/
  self.setLatest = function (latest) {
    self.latest = latest;
  }
  

  self.toJson = function () {
    return JSON.stringify(self);
  }
}

if (typeof module === 'object' && module.exports) {
  module.exports = Shelf;
}
