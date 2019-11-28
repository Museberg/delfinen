import java.util.*;

public class Member{
   private String fullName;
   private String adress;
   private String phoneNumber;
   private int age;
   private String membershipStatus;
   private String ageGroup;
   
   public Member(String fullName, String adress, String phoneNumber, int age, String membershipStatus, String ageGroup){
      this.fullName = fullName;
      this.adress = adress;
      this.phoneNumber = phoneNumber;
      this.age = age;
      this.membershipStatus = membershipStatus;
      this.ageGroup = ageGroup;
   }
   
   public String getFullName(){
      return fullName;
   }
   public String getAdress(){
      return adress;
   }
   public String getPhoneNumber(){
      return phoneNumber;
   }
   public int getAge(){
      return age;
   }
   public String getMembershipStatus(){
      return membershipStatus;
   }
   public String getAgeGroup(){
      return ageGroup;
   }
   
   public void setFullName(String fullName){
      this.fullName = fullName;
   }
   public void setAdress(String adress){
      this.adress = adress;
   }
   public void setPhoneNumber(String phoneNumber){
      this.phoneNumber = phoneNumber;
   }
   public void setAge(int age){
      this.age = age;
   }
   public void setMembershipStatus(String membershipStatus){
      this.membershipStatus = membershipStatus;
   }
   public void setAgeGroup(String ageGroup){
      this.ageGroup = ageGroup;
   }
   
   public static void makeNewMember(ArrayList<Member> memberA){
      Scanner console = new Scanner(System.in);
      Scanner console2 = new Scanner(System.in);
      System.out.println("Full name: ");
      String fullName = console.nextLine();
      System.out.println("Adress: ");
      String adress = console.nextLine();
      System.out.println("Phone number: ");
      String phoneNumber = console.nextLine();
      System.out.println("Age: ");
      int age = console2.nextInt();
      System.out.println("Active or passive membership?(type a for active and p for passive): ");
      String membershipStatus = console.nextLine();
      String ageGroup = "";
      if (age >= 18 || age <= 60){
         ageGroup = "Senior";
      }
      else if (age > 60){
         ageGroup = "Senior+";
      }
      else{
         ageGroup = "Junior";
      }
      
      Member temp = new Member(fullName, adress, phoneNumber, age, membershipStatus, ageGroup);
      memberA.add(temp);
   }
   
   public String toString(){
      return (fullName + "\n" + adress + "\n" + phoneNumber + "\n" + age + "\n" + membershipStatus + "\n" + ageGroup);
   }
   
}