public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default_A", "ddddd", "Default#makd.com");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name, creditLimit, "unknow#gmail.com");
    }

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
