public class Trainer extends Staff{

    // Fields
    private String teamName;
    private boolean isOver18;
    
    // Constructor
    public Trainer(String fullName, String title, String street, String city, int zip, int phoneNumber, String teamName, boolean isOver18) {
        super(fullName, title, street, city, zip, phoneNumber);
        this.teamName = teamName;
        this.isOver18 = isOver18;
    }
    
    // Methods
    
}