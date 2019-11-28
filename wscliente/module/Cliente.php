<?php
namespace Module;

require_once '../config/loader.php';




class Cliente {
    
    public function getall(){
        $cliente =new \SoapClient("http://localhost:9090/wsbiblioteca/Servicio?WSDL",array('trace'=>1,'exeptions'=>0));
        $arreglito=$cliente->__soapCall('listarLibro',array());
        

        return $arreglito;
    }
    
    
    
    
}
