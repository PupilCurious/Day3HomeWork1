public class Main {
    public static void main(String[] args) {

            CustomerManager customerManager = new CustomerManager(new Customer(),new CarCreditManager());
            customerManager.giveCredit();





            /*CreditManager creditManager = new CreditManager();
            creditManager.calculate();
            creditManager.save();

            Customer customer = new Customer();
            customer.id=1;
            customer.city="Izmir";

            CustomerManager customerManager = new CustomerManager(customer);
            customerManager.save();
            customerManager.delete();

            Person person = new Person(); // örneğini oluşturmak, instance oluşturmak, instance creation, heap de bir referans numarası oluşturmak
            person.id=1;
            person.firstName = "Baturalp";
            person.lastName = "Ertugrul";
            person.nationalIdentity = "12345678901";
            person.city = "Istanbul";

            Company company = new Company();
            company.taxNumber="1242523";
            company.companyName="MSTURKAC";
            company.city="Ankara";

            CustomerManager customerManager1 = new CustomerManager(new Company());
            customerManager1.save();
            customerManager1.delete();

            //Inheritance sayesinde ana class Inheritance olan diğer class referanslarını tutabilir.
            Customer c1 = new Customer();
            Customer c2 = new Person();
            Customer c3 = new Company();*/

    }
}