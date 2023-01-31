public class CustomerManager {
    private Customer _customer;
    private ICreditManager _iCreditManager;
    public CustomerManager(Customer customer,ICreditManager creditManager){
        this._customer=customer;
        this._iCreditManager=creditManager;
    }
    public void save(){
        System.out.println("Musteri Kaydedildi : ");
    }

    public void delete(){
        System.out.println("Musteri Silindi : ");
    }

    public void giveCredit(){
        _iCreditManager.calculate();
        System.out.println("Kredi Verildi.");
        _iCreditManager.save();
    }
}
