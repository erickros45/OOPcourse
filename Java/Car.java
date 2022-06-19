package Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public Integer getPassanger(){
        return passenger;
    }

    public void setPassanger(Integer passenger){
        if (passenger == 4){
            this.passenger = passenger;
        }
        else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    void printDataCar() {
        if(passenger != null){
            System.out.println("License: "+ license + " Driver Name: "+ driver.name + " Passengers: " + passenger);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
