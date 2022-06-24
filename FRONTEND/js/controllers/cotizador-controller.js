app.controller('cotizadorCtrl', [
  '$scope', '$rootScope', '$location', 'Session', 'cotizadorService',
  function ($scope, $rootScope, $location, Session, cotizadorService) {
    $scope.pageClass = 'page-login';
    $scope.mensaje = "";
    var descuentoCodigo ="";
    $scope.controlCotiza = false;
    $scope.catalogoRegiones = [];
    $scope.catalogoPaises = [];

    $scope.logindisabled = false;
    $scope.cotizacion = {
      peso: '',
      alto: '',
      largo: '',
      ancho: ''
    };

    $scope.Cotizar = function () {

      console.log("tarifa:", $scope.pais.tarifa)

      if ($scope.cotizacion.codigo != "" && $scope.cotizacion.codigo != undefined) {

        cotizadorService.getCodigo($scope.cotizacion.codigo).then(function (result) {

          if (result.length > 0) {
            
            descuentoCodigo = result[0].descuento;

            calcularCotizacion(
              $scope.cotizacion.peso,
              $scope.pais.tarifa,
              $scope.cotizacion.alto,
              $scope.cotizacion.largo,
              $scope.cotizacion.ancho,
              (result[0].descuento/100) ,
            );
          } else {
            calcularCotizacion(
              $scope.cotizacion.peso,
              $scope.pais.tarifa,
              $scope.cotizacion.alto,
              $scope.cotizacion.largo,
              $scope.cotizacion.ancho,
              0 ,
            );
          }

        }, function (error) {
          //toastr.error( error );
        });

      } else {
        //Si no encontro el Codigo

        calcularCotizacion(
          $scope.cotizacion.peso,
          $scope.pais.tarifa,
          $scope.cotizacion.alto,
          $scope.cotizacion.largo,
          $scope.cotizacion.ancho,
          0 ,
        );
      }


    };

    var calcularCotizacion = function (peso, tarifa, alto, largo, ancho, descuento) {

      console.log("Inicio de Cotizacion");
      console.log("Formula: (peso*tarifa) + 1.66 * Alto * largo * ancho – (descuento cliente) * 0.5 * peso");
      console.log("Formula: (" + peso + "*" +tarifa +") + 1.66 * " + alto + " * " + largo + " * " + ancho + " – ("+ descuento + " * 0.5 * " + peso + ")");

      //var temp = peso * tarifa + 1.66 * alto * largo * ancho - (descuento * peso);
      var temp = peso * tarifa + 1.66 * alto * largo * ancho;
      temp = temp - (descuento * temp)

      console.log("Fin de Cotizacion:", temp);

      $scope.controlCotiza = true;
      if($scope.cotizacion.codigo == "" ||  $scope.cotizacion.codigo == undefined ){
        $scope.mensaje = "El resultado de la cotizacion es Q" + temp.toFixed(2) + " sin descuento aplicado."
      }else if(descuento == 0){
        $scope.mensaje = "El resultado de la cotizacion es Q" + temp.toFixed(2) + " sin descuento aplicado por el codigo " + $scope.cotizacion.codigo + " ya que no es valido."
      }else{
        $scope.mensaje = "El resultado de la cotizacion es Q" + temp.toFixed(2) + " con un descuento aplicado de " + descuentoCodigo  + "% por el codigo " + $scope.cotizacion.codigo + "."
      }

    }

    $scope.getRegiones = function () {
      cotizadorService.getRegiones().then(function (result) {
        $scope.catalogoRegiones = result;
      }, function (error) {
        //toastr.error( error );
      });
    }

    $scope.getPaisesRegion = function (region) {
      console.log("RegionSeleccionada::", region.id)
      cotizadorService.getPaisesRegion(region.id).then(function (result) {
        $scope.catalogoPaises = result;
      }, function (error) {
        //toastr.error( error );
      });
    }

    $scope.limpiar = function(){
      $scope.cotizacion.alto = "";
      $scope.cotizacion.largo = "";
      $scope.cotizacion.ancho = "";              
      $scope.cotizacion.peso = "";
      $scope.region = "";
      $scope.pais = "";
      $scope.catalogoPaises = "";
      $scope.cotizacion.codigo ="";
      $scope.controlCotiza = false;
    }

    $scope.getRegiones();
    //$scope.getPaisesRegion(1);

    // AdminLTE estilos
    $(function () {
      $('input').iCheck({
        checkboxClass: 'icheckbox_square-blue',
        radioClass: 'iradio_square-blue',
        increaseArea: '20%' // optional
      });
    });
  }
]);