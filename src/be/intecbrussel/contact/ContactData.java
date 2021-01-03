package be.intecbrussel.contact;

public class ContactData {

    private String eMail;
    private Telephone mobile;
    private Telephone phone;

    public ContactData(String eMail, Telephone mobile, Telephone phone) {
        this.eMail = eMail;
        this.mobile = mobile;
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public Telephone getMobile() {
        return mobile;
    }

    public Telephone getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return  "E-mail: " + eMail +
                "\nMobile: " + mobile.getNumber() +
                "\nPhone: " + phone.getNumber();
    }
}
