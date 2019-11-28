public class Staff {

    // Fields
    private String fullName;
    private String title;
    private String street;
    private String city;
    private int zip;
    private int phoneNumber;
    
    // Constructor
    public Staff(String fullName, String title, String street, String city, int zip, int phoneNumber) {
        this.fullName = fullName;
        this.title = title;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }
    
    // Methods
    
    // Getters
    public String getFullName() {
        return fullName;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getStreet() {
        return street;
    }
    
    public String getCity() {
        return city;
    }
    
    public int getZip() {
        return zip;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    // Setters
    public void getFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void getTitle(String title) {
        this.title = title;
    }
    
    public void getStreet(String street) {
        this.street = street;
    }
    
    public void getCity(String city) {
        this.city = city;
    }
    
    public void getZip(int zip) {
        this.zip = zip;
    }
    
    public void getPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}