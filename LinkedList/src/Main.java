import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Tim",10.12);
        Customer anotherCustomer = new Customer("Kevin", 12.22);
        anotherCustomer = customer;
        anotherCustomer.setBalance(20.55);
        System.out.println("Balance for customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++ ){
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(2, 2);


        for (int i = 0; i < intList.size(); i++ ){
            System.out.println(i + " : " + intList.get(i));
        }

    }
}
