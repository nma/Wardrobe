'use strict';

module.exports = {
  client: {
    source: ['client/**/*.{html,css,ico,ssp}', '!**/app/**'],
    destination: 'dist/webapp',
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
