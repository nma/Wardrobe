if (typeof module === 'object' && module.exports) {
  var Wardrobe = {};
  
  Wardrobe.Stack = require('./model/Stack.js');
  
  Wardrobe.Drawer = require('./model/Drawer.js');
  
  Wardrobe.Shelf = require('./model/Shelf.js');
  
  Wardrobe.Promoter = require('./model/Promoter.js');
  
  Wardrobe.User = require('./model/User.js');
  
  
  Wardrobe.UserApi = require('./api/UserApi.js');
  
  Wardrobe.ShelfApi = require('./api/ShelfApi.js');
  
  Wardrobe.StackApi = require('./api/StackApi.js');
  
  module.exports = Wardrobe;
}