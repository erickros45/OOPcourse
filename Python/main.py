from account import Account
from car import Car
from UberX import UberX

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))
    uberx = UberX("AW456", Account("Andres Ferrera", "ANDA756"),"Chevrolet","Spark")
    uberx.passanger= 4
    print(vars(uberx))