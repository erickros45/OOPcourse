package Java;

public class Paypal extends Payment{
    Integer email;

    public Paypal(Integer id, Integer email){
        super(id);
        this.email=email;
    }
}
