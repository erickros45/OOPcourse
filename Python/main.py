from account import Account
from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))