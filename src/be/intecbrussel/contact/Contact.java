package be.intecbrussel.contact;

public class Contact {

    private ContactData data;
    private String name;

    public Contact(String name, String eMail, String mobileNumber, String phoneNumber) {
        this.name = name;
        Telephone phone = new Telephone(phoneNumber, "phone");
        Telephone mobile = new Telephone(mobileNumber, "mobile");
        this.data = new ContactData(eMail, mobile, phone);
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                "\n" + data.toString();
    }

    public void showInfo() {
        System.out.println(this.toString());
    }
}
