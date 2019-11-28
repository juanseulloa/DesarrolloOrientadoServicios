<?php

include  './lib/nusoap.php';
$endpoint = "http://localhost:9090/wsbiblioteca/Servicio";

// $cliente =new nusoap_client("http://localhost:9090/wsbiblioteca/Servicio?WSDL",array('location'=>$endpoint,'trace'=>1,'exeptions'=>0));
$cliente = new nusoap_client("http://localhost:9090/wsbiblioteca/Servicio?WSDL",true);

$codigo = filter_input(INPUT_POST, "codEd");
$nombre = filter_input(INPUT_POST, "nombreEd");
$autor = filter_input(INPUT_POST, "autorEd");
$edicion = filter_input(INPUT_POST, "edicionEd");
$anio = filter_input(INPUT_POST, "anioEd");

//print_r($cliente->__getLastResponse());
if ($nombre != null) {
   
$params = array('codigo'=>$codigo,'nombre' => $nombre, 'autor' => $autor, 'edicion' => $edicion, 'anio'=> $anio);

try {
    $res = $cliente->call('editarLibro', $params);
    var_dump($res);
   
    //header('location:../recursos/Libro.php');
} catch (SoapFault $es) {
    echo $es->getMessage();
}
        
}else{
    echo 'pailas papi';   
}
