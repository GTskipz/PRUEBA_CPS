app.config([
  '$stateProvider', '$urlRouterProvider',
  function ($stateProvider, $urlRouterProvider) {
    // Configuración de las rutas
    $stateProvider.state({
      name: 'cotizador',
      url: '/cotizador',
      templateUrl: 'views/cotizador.html',
      controller: 'cotizadorCtrl'
    });
    $urlRouterProvider.otherwise('/cotizador');

  }
]);