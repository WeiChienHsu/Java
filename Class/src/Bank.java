public class Bank {
    private String number;
    private double balance;
    private String custName;
    private String email;
    private String phone;

    //Constructor
    public Bank() {
        this("123", 2000, "Lee", "asv@ddd.ddd", "453-423-3483" );
        System.out.println("Empty constructor with default value");
    }

    public Bank(String number, double balance,
                String custName, String email, String phone){

        this.number = number;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phone = phone;
    }

    public Bank(String custName, String email, String phone) {
        this("99999", 100.55, custName, email, phone);
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustName(){
        return this.custName;
    }

    public void deposit(int num) {
        if(num < 0){
            System.out.println("You could deposit negative amount");
        } else {
            this.balance += num;
            System.out.println("Successfully deposited");
            System.out.println("You have balance:" + this.balance);
        }

    }

    public void withdraw(int num){
        if(num < 0){
            System.out.println("You could withdraw negative amount");
        } else {
            if(num > this.balance){
                System.out.println("Not enough money");
            } else {
                this.balance -= num;
                System.out.println("Successfully withdrew");
                System.out.println("You have balance:" + this.balance);
            }
        }
    }


}
