<?php
class Car
{
    public $id;        
    public $license;   
    public $driver;    
    public $passenger;  

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function PrintDataCar(){
        echo "Licencia: $this->license Driver: ".$this->driver->name;
    }
}
?>