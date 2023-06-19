package coreJava2;

public class PersonalDetails {
	private String name;
    private String doorNo;
    private String streetNo;
    private String city;
    private String zipCode;
    private String mobileNo;
    private String telephoneNo;

    public PersonalDetails(String name, String doorNo, String streetNo, String city, String zipCode, String mobileNo, String telephoneNo) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.city = city;
        this.zipCode = zipCode;
        this.mobileNo = mobileNo;
        this.telephoneNo = telephoneNo;
    }

    public void displayDetails() {
        System.out.println("\nPersonal Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + doorNo + ", " + streetNo + ", " + city + ", " + zipCode);
        System.out.println("Mobile No: " + mobileNo);
        if (telephoneNo != null) {
            System.out.println("Telephone No: " + telephoneNo);
        }
    }

}
