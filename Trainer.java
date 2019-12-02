import java.util.*;

public class Trainer extends Staff{

    // Fields
    private String teamName;
    private boolean isOver18;
    
    // Constructor
    public Trainer(String fullName, String title, String address, int phoneNumber, String teamName, boolean isOver18) {
        super(fullName, title, address, phoneNumber);
        this.teamName = teamName;
        this.isOver18 = isOver18;
    }
    
    // Getters
    
    public String getTeamName() {
        return teamName;
    }
    
    public boolean getIsOver18() {
        return isOver18;
    }
    
    // Setters
    
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public void setIsOver18(boolean isOver18) {
        this.isOver18 = isOver18;
    }
    
    // Create trainer
    public static void makeNewTrainer(ArrayList<Staff> staffA) {
        System.out.println("Full name: ");
        String fullName = InputHelper.getStringFromUser("name");
        
        System.out.println("Title: ");
        String title = InputHelper.getStringFromUser("title");

        System.out.println("Adress: ");
        String adress = InputHelper.getAddressFromUser();

        System.out.println("Phone number: ");
        int phoneNumber = InputHelper.getPhoneNumberFromUser();
        
        System.out.println("Team name: ");
        String teamName = InputHelper.getStringFromUser("team name");
        
        System.out.printf("Junior or senior team?%n%d for active%n%d for passive", 1, 2);
        boolean membershipStatus = InputHelper.getOptionFromUser(1, 2) == 1;
    }
}