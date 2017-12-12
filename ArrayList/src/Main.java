import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Phone phone = new Phone("469 403 2234");

    public static void main(String[] args){
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
                System.out.println("\n Enter action: (6 to show available actions");
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action) {
                    case 0:
                        System.out.println("\n Shutting down...");
                        quit = true;
                        break;
                    case 1:
                        phone.printContacts();
                        break;
                    case 2:
                        addNewContact();
                        break;
                    case 3:
                        updateContact();
                        break;
                    case 4:
                        removeContact();
                        break;
                    case 5:
                        queryContact();
                        break;
                    case 6:
                        printActions();
                        break;
                }

        }
    }

    private static void startPhone() {
        System.out.println("Starting Phone ....");
    }

    private static void addNewContact() {
        System.out.println("Enter new Contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if(phone.addNewContact(newContact)) {
            System.out.println("New contact added : name = " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println( name + " is already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing Contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = phone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (phone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing Contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = phone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if (phone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing Contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = phone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is" + existingContactRecord.getPhoneNumber());
        if (phone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        }
    }

    private static void printActions(){
        System.out.println("\n Available action: \n press");
        System.out.println( "0 - to Shutdown\n" +
                            "1 - to Print contacts\n" +
                            "2 - to Add a new contact\n" +
                            "3 - to Update existing contact\n" +
                            "4 - to remove an existing contact exists\n" +
                            "5 - Query if an existing contact exists\n" +
                            "6 - to Print a list of available actions");
        System.out.println("Choose your action:");
    }

}
