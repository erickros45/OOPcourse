package Java;

public class CreditCard extends Payment {
    Integer number;
    Integer CVV;
    String date;

    public CreditCard(Integer id, Integer number, Integer CVV, String date){
        super(id);
        this.number=number;
        this.CVV=CVV;
        this.date=date;
    }
    
}
