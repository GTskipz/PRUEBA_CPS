// Creación del módulo
var app = angular.module('MyAngularAppName', [
        'ngSanitize',
        'ui.router',
        'app.cotizadorService',
        'ngAnimate'
  ]);

app.run([
  '$rootScope', '$location',
  function($rootScope, $location){

    $rootScope.getLocation = function(){      
      return $location.url();
    }
    
  }
]);