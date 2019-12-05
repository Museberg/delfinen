import java.util.*;

public class Trainer{

   // Fields
   private String fullName;
   private String title;
   private String address;
   private int phoneNumber;
   private String teamName;
   private boolean isOver18;
   
   // Constructor
   public Trainer(String fullName, String address, int phoneNumber, String teamName, boolean isOver18) {
      this.fullName = fullName;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.teamName = teamName;
      this.isOver18 = isOver18;
   }
   
   // Getters
   public String getFullName() {
      return fullName;
   }
   
   public String getAddress() {
      return address;
   }
   
   public int getPhoneNumber() {
      return phoneNumber;
   }

   public String getTeamName() {
      return teamName;
   }
   
   public boolean getIsOver18() {
      return isOver18;
   }
   
   // Setters
   public void getFullName(String fullName) {
      this.fullName = fullName;
   }
   
   public void getAddress(String address) {
      this.address = address;
   }
   
   public void getPhoneNumber(int phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public void setTeamName(String teamName) {
      this.teamName = teamName;
   }
   
   public void setIsOver18(boolean isOver18) {
      this.isOver18 = isOver18;
   }
   
   // Create trainer
   public static Trainer makeNewTrainer() {
      System.out.println("Full name: ");
      String fullName = InputHelper.getStringFromUser("name");
      
      System.out.println("Address: ");
      String address = InputHelper.getAddressFromUser();
   
      System.out.println("Phone number: ");
      int phoneNumber = InputHelper.getPhoneNumberFromUser();
      
      System.out.println("Team name: ");
      String teamName = InputHelper.getStringFromUser("team name");
      
      System.out.printf("Junior or senior team?%n%d for active%n%d for passive", 1, 2);
      boolean membershipStatus = InputHelper.getOptionFromUser(1, 2) == 1;
      
      return new Trainer(fullName, address, phoneNumber, teamName, membershipStatus);
   }
   
   public String toString() {
      return "Fullname: " + fullName + "\nAddress: " + address + "\nPhoneNumber: " + phoneNumber + "\nTeamname: " + teamName;
   }
   
   public String toFile(){
      return fullName + "\n" + address + "\n" +phoneNumber + "\n" +teamName;
   }
}