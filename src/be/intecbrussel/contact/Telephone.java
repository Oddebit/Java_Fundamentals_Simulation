package be.intecbrussel.contact;

public class Telephone {

    private static final int MOBILE_LENGTH = 10;
    private static final int PHONE_LENGTH = 9;

    private String number;
    private String kind;

    public Telephone (String number, String kind) {
        this.number = number;
        this.kind = kind;
    }

    public String getNumber() {
        return number;
    }

    public String getKind() {
        return kind;
    }

    public boolean isValid() {
        int length = number.length();
        return ((kind.toLowerCase().equals("phone") && length == 9)
                || (kind.toLowerCase().equals("mobile") && length == 10));
    }
}
