import java.util.ArrayList;

public class Phone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public Phone(String myNumber, ArrayList<Contact> myContact) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContact.add(contact);
        return true;
    }

    //Update Contact - use the constructor in Contact

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else {
            this.myContact.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        }
    }

    // Find the whole contact and return the position

    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    // Find if the name is exist

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            } else {
                return -1;
            }
        }
    }


}
