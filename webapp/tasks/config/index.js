'use strict';

module.exports = {
  client: {
    source: ['client/**/*.{html,css,ico,ssp}', '!**/app/**'],
    destination: '../scala-server/src/main/webapp/app',
    app: ['client/**/*.js']
  },
  general: {
    source: ['package.json'], 
    destination: 'dist'
  },
  build: {
    destination: 'dist'
  }
};
