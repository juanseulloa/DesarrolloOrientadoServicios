<?php
require('..\lib\nusoap.php');

$cliente = new soapclient( 'http://localhost:9090/wsbiblioteca/Servicio?WSDL');

$result = $cliente->get('getlist',array($codigo));

$xhtml = "<select>\n";
var_dump($result);
        foreach ( $result as $key) {
             foreach ( $key as $value) {
                 $xhtml .= "<option selected> {$value} </option> \n";

             }
        }

$xhtml .= "</select>";
echo ($xhtml);


