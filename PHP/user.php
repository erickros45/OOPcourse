<?php
require_once("account.php")
class User extends Account{
    public function __construct($name, $document, $email, $password)
    {
        parent::__constructor($name, $document)
        $this->email=$email;
        $this->password=$password;
    }
}
?>