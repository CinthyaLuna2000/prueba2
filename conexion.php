<?php

 $hostname = "spidercam.proyectosutd.com";
  $database= "proyec23_spidercam";
  $username = "proyec23_uspider";
  $password = "1Familia.";


  $conexion=new mysqli($hostname,$username,$password,$database);
  if($conexion->connect_errno){
    echo "Lo sentimos, el sitio web esta experimentando problemas";
  }



?>