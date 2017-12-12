import java.util.ArrayList;

public class Phone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public Phone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    //Update Contact - use the constructor in Contact

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else {
            this.myContacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
            return true;
        }
    }

    // Find the whole contact and return the position

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    // Remove contact
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }


    // Find if the name is exist

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    // Return the Data (String)
    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0 ) {
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }


    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " +
                                this.myContacts.get(i).getName()+
                                " --> " +
                                this.myContacts.get(i).getPhoneNumber()
                                );
        }
    }
}
