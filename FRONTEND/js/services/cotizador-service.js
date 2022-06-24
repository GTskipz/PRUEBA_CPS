angular.module( 'app.cotizadorService', [])

.factory( 'cotizadorService', ['$http', '$q', function ($http, $q ) {  

  return {


  	getRegiones: function () {
      var deferred = $q.defer();
      $http.get('http://localhost:8080/api/Region').then( function ( data ) {
        deferred.resolve( data.data );
      }, function ( error ) {
        deferred.reject( error );
      });
      return deferred.promise;
    },

    getPaisesRegion: function (id_region) {
      var deferred = $q.defer();
      $http.get('http://localhost:8080/api/Pais/Region/'+ id_region).then( function ( data ) {
        deferred.resolve( data.data );
      }, function ( error ) {
        deferred.reject( error );
      });
      return deferred.promise;
    },

    getCodigo: function (codigo) {
      var deferred = $q.defer();
      $http.get('http://localhost:8080/api/Codigo/'+ codigo).then( function ( data ) {
        deferred.resolve( data.data );
      }, function ( error ) {
        deferred.reject( error );
      });
      return deferred.promise;
    },
  }
  
}]);