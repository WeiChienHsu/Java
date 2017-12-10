public class Main {

    public static void main(String[] args){
//        Bank de_fault = new Bank();
//        Bank kevin = new Bank("120", 2000, "Kevin", "Hwo@kdd.dd", "123-423-4443");
//
//        kevin.deposit(1000);
//        kevin.withdraw(1400);
//
//        Bank tim = new Bank("Tim","gadi@ldld.comd", "123-443-4444");
//        System.out.println(tim.getCustName() + tim.getBalance());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", "123");
        System.out.println(person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Alan","eeeee","123123");
        System.out.println(person3.getCreditLimit());


    }
}
