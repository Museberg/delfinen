import java.util.*;

public class Staff {

    // Fields
    private String fullName;
    private String title;
    private String address;
    private int phoneNumber;
    
    // Constructor
    public Staff(String fullName, String title, String address, int phoneNumber) {
        this.fullName = fullName;
        this.title = title;
        this.address = address;
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
    
    public String getAddress() {
        return address;
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
    
    public void getAddress(String address) {
        this.address = address;
    }
    
    public void getPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // Make method
    public static void makeNewStaff(ArrayList<Staff> staffA) {
        System.out.println("Full name: ");
        String fullName = InputHelper.getStringFromUser("name");
        
        System.out.println("Title: ");
        String title = InputHelper.getStringFromUser("title");

        System.out.println("Adress: ");
        String adress = InputHelper.getAddressFromUser();

        System.out.println("Phone number: ");
        int phoneNumber = InputHelper.getPhoneNumberFromUser();

    }
}