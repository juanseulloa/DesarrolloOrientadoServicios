<?php

include  './lib/nusoap.php';
$endpoint = "http://localhost:9090/wsbiblioteca/Servicio";

// $cliente =new nusoap_client("http://localhost:9090/wsbiblioteca/Servicio?WSDL",array('location'=>$endpoint,'trace'=>1,'exeptions'=>0));
$cliente = new nusoap_client("http://localhost:9090/wsbiblioteca/Servicio?WSDL",true);


$nombre = filter_input(INPUT_POST, "nombrelib");
$autor = filter_input(INPUT_POST, "autor");
$edicion = filter_input(INPUT_POST, "edicion");
$anio = filter_input(INPUT_POST, "anio");

//print_r($cliente->__getLastResponse());
if ($nombre != null) {
$params = array('nombre' => $nombre, 'autor' => $autor, 'edicion' => $edicion, 'anios' => $anio);

try {
    $res = $cliente->call('crearLibro', $params);
    
   
    header('location:../recursos/Libro.php');
} catch (SoapFault $es) {
    echo $es->getMessage();
}
        
}else{
    echo 'pailas papi';   
}





