public class Main {

    public static void main(String[] args){
        Bank de_fault = new Bank();
        Bank kevin = new Bank("120", 2000, "Kevin", "Hwo@kdd.dd", "123-423-4443");

        kevin.deposit(1000);
        kevin.withdraw(1400);

    }
}
