import java.util.*;
import java.time.*;
import java.time.format.*;

public class Member{
   private String fullName;
   private String address;
   private int phoneNumber;
   private LocalDate birthDate;
   private boolean membershipStatus;
   private boolean arrears; // Has the member paid their membership admission?

   public enum AgeGroup{
      JUNIOR,
      SENIOR,
      SENIORPLUS
   }
  
   public Member(String fullName, String address, int phoneNumber, String birthDate, boolean membershipStatus, boolean arrears){
      this.fullName = fullName;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.birthDate = DateHelper.parseDate(birthDate);
      this.membershipStatus = membershipStatus;
   }

    // Getters
   public String getFullName(){
      return fullName;
   }
   public String getAddress(){
      return address;
   }
   public int getPhoneNumber(){
      return phoneNumber;
   }
   public int getAge(){
      return DateHelper.getAge(birthDate);
   }
   public LocalDate getBirthDate(){
      return birthDate;
   }
   public boolean getMembershipStatus(){
      return membershipStatus;
   }
   public boolean getArrears(){
      return arrears;
   }
   public AgeGroup getAgeGroup(){
      int age = this.getAge();
   
      if(age < 18){
         return AgeGroup.JUNIOR;
      }
      else if(age >= 18 && age <= 60){
         return AgeGroup.SENIOR;
      }
      else{
         return AgeGroup.SENIORPLUS;
      }
   }

    // Setters
   public void setFullName(String fullName){
      this.fullName = fullName;
   }
   public void setAddress(String adress){
      this.address = address;
   }
   public void setPhoneNumber(int phoneNumber){
      this.phoneNumber = phoneNumber;
   }
   public void setMembershipStatus(Boolean membershipStatus){
      this.membershipStatus = membershipStatus;
   }
   public void setArrears(boolean arrears){
      this.arrears = arrears;
   }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

   public static Member makeNewMember(){
      System.out.println("Full name:");
      String fullName = InputHelper.getStringFromUser("name");
   
      System.out.println("Adress:");
      String address = InputHelper.getAddressFromUser();
   
      System.out.println("Phone number:");
      int phoneNumber = InputHelper.getPhoneNumberFromUser();
   
      System.out.println("Birthdate. Please type as dd/mm yyyy");
      String birthDate = DateHelper.dateToString(DateHelper.getValidDateFromUser());
   
      System.out.printf("Passive or active member?%n%d for active%n%d for passive", 1, 2);
      boolean membershipStatus = InputHelper.getOptionFromUser(1, 2) == 1;
        
      boolean arrears = false;
   
      return new Member(fullName, address, phoneNumber, birthDate, membershipStatus, arrears);
   }

   public String toString(){
      return "Member" +
            "\nName: " + fullName +
            "\nAddress: " + address +
            "\nPhone Number: " + phoneNumber +
            "\nMembershipstatus: " + (membershipStatus ? "Active" : "Passive") +
            "\nArrears: " + arrears;
   }
   
   public String toFile() {
      return fullName + "\n" + address + "\n" + phoneNumber + "\n" + birthDate + "\n" + membershipStatus + "\n" + arrears;
   }
}