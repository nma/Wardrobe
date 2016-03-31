// require files in Node.js environment

if (typeof module === 'object' && module.exports) {
  
}



//export module
if ( typeof define === "function" && define.amd ) {     
	define('UserGroupEnum', ['jquery'], function($) {
        return UserGroupEnum;
	 });
}

var UserGroupEnum = function UserGroupEnum() {
	var self = this;
	

	/**
	 * @const 
	 */ 
	self.ADMIN = "admin",
	
	/**
	 * @const 
	 */ 
	self.USER = "user";

}


//export module
if ( typeof define === "function" && define.amd ) {
  define('User', ['jquery'],
    function($) {
      return User;
   });
}


var User = function User() { 
  var self = this;
  
  /**
   * datatype: Integer
   **/
  self.id = null;
  
  /**
   * datatype: String
   **/
  self.firstName = null;
  
  /**
   * datatype: String
   **/
  self.lastName = null;
  
  /**
   * datatype: String
   **/
  self.email = null;
  
  /**
   * datatype: String
   **/
  self.password = null;
  
  /**
   * datatype: UserGroupEnum
   **/
  self.userGroup = null;
  
  /**
   * User Status
   * datatype: Integer
   **/
  self.userStatus = null;
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.id = data.id;
    
    self.firstName = data.firstName;
    
    self.lastName = data.lastName;
    
    self.email = data.email;
    
    self.password = data.password;
    
    self.userGroup = data.userGroup;
    
    self.userStatus = data.userStatus;
    
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
  self.getFirstName = function() {
    return self.firstName;
  }

  /**
   * @param {String} firstName
   **/
  self.setFirstName = function (firstName) {
    self.firstName = firstName;
  }
  
  /**
   * @return {String}
   **/
  self.getLastName = function() {
    return self.lastName;
  }

  /**
   * @param {String} lastName
   **/
  self.setLastName = function (lastName) {
    self.lastName = lastName;
  }
  
  /**
   * @return {String}
   **/
  self.getEmail = function() {
    return self.email;
  }

  /**
   * @param {String} email
   **/
  self.setEmail = function (email) {
    self.email = email;
  }
  
  /**
   * @return {String}
   **/
  self.getPassword = function() {
    return self.password;
  }

  /**
   * @param {String} password
   **/
  self.setPassword = function (password) {
    self.password = password;
  }
  
  /**
   * @return {UserGroupEnum}
   **/
  self.getUserGroup = function() {
    return self.userGroup;
  }

  /**
   * @param {UserGroupEnum} userGroup
   **/
  self.setUserGroup = function (userGroup) {
    self.userGroup = userGroup;
  }
  
  /**
   * get User Status
   * @return {Integer}
   **/
  self.getUserStatus = function() {
    return self.userStatus;
  }

  /**
   * set User Status
   * @param {Integer} userStatus
   **/
  self.setUserStatus = function (userStatus) {
    self.userStatus = userStatus;
  }
  

  self.toJson = function () {
    return JSON.stringify(self);
  }
}

if (typeof module === 'object' && module.exports) {
  module.exports = User;
}
