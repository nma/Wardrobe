// require files in Node.js environment
var Promoter;
if (typeof module === 'object' && module.exports) {
  
  Promoter = require('./Promoter.js');
}




//export module
if ( typeof define === "function" && define.amd ) {
  define('Drawer', ['jquery''Promoter'],
    function($Promoter) {
      return Drawer;
   });
}


var Drawer = function Drawer() { 
  var self = this;
  
  /**
   * datatype: Integer
   **/
  self.id = null;
  
  /**
   * datatype: Date
   **/
  self.dateAdded = null;
  
  /**
   * datatype: Promoter
   **/
  self.promoter = new Promoter();
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.id = data.id;
    
    self.dateAdded = data.dateAdded;
    
    self.promoter.constructFromObject(data.promoter);
    
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
   * @return {Date}
   **/
  self.getDateAdded = function() {
    return self.dateAdded;
  }

  /**
   * @param {Date} dateAdded
   **/
  self.setDateAdded = function (dateAdded) {
    self.dateAdded = dateAdded;
  }
  
  /**
   * @return {Promoter}
   **/
  self.getPromoter = function() {
    return self.promoter;
  }

  /**
   * @param {Promoter} promoter
   **/
  self.setPromoter = function (promoter) {
    self.promoter = promoter;
  }
  

  self.toJson = function () {
    return JSON.stringify(self);
  }
}

if (typeof module === 'object' && module.exports) {
  module.exports = Drawer;
}
