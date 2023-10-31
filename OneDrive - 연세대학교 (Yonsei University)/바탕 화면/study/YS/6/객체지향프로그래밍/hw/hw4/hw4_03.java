public class hw4_03 {
    public static void main(String[] args) {
        Contact contact = new Contact("Alice", new PhoneNumber("+82", "1234567890"));
        ContactManagement cm = new ContactManagement();
        System.out.println("Original contact: " + contact);
        System.out.println();

        Contact updatedContactShallow = cm.editContactShallow(contact, "Bob", "0987654321");
        System.out.println("Shallow copy updated contact: " + updatedContactShallow);
        System.out.println("Original contact after shallow copy: " + contact);
        System.out.println();

        Contact updatedContactDeep = cm.editContactDeep(contact, "Charlie", "1122334455");
        System.out.println("Deep copy updated contact: " + updatedContactDeep);
        System.out.println("Original contact after deep copy: " + contact);
    }
}
class PhoneNumber {
    private String countryCode;

    private String localNumber;

    public PhoneNumber() {}

    public PhoneNumber(String countryCode, String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public PhoneNumber(PhoneNumber original) {
        if (original == null) {
            System.exit(0);
        }
        countryCode = original.countryCode;
        localNumber = original.localNumber;
    }

    @Override
    public String toString() {
        return "[Phone Number] countryCode(" + countryCode + ") localNumber(" + localNumber + ")";
    }

    public String getCountryCode() {
        return countryCode;
    }
    public String getLocalNumber() {
        return localNumber;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }
}
class Contact {
    private String name;
    private PhoneNumber phoneNumber;

    public Contact () {}

    public Contact (String name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Contact (Contact original) {
        if (original == null) {
            System.exit(0);
        }
        name = original.name;
        phoneNumber = new PhoneNumber(original.phoneNumber);
    }

    public String toString() {
        String phoneNumberString;
        if (phoneNumber == null)
            phoneNumberString = "";
        else
            phoneNumberString = phoneNumber.toString();

        return "[CONTACT] name(" + name + ") " + phoneNumber;
    }

    public String getName() {
        return name;
    }
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

//    '지역 번호' 변경에 사용할 것
    public void setPhoneNumber(String localNumber) {
        phoneNumber.setLocalNumber(localNumber);
    }
}

class ContactManagement {
    private Contact contact;
    public ContactManagement() {}
    public Contact editContactShallow (Contact contact, String newName, String newLocalNumber) {
        contact.setName(newName);
        contact.setPhoneNumber(newLocalNumber);
        return contact;
    }
    public Contact editContactDeep (Contact contact, String newName, String newLocalNumber) {
        Contact newContact = new Contact(contact);
        newContact.setName(newName);
        newContact.setPhoneNumber(newLocalNumber);
        return newContact;
    }

}
