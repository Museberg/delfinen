import java.util.*;

public class Cashier {
   public static void checkArrears (ArrayList<Member> memberA){
      double bill;
      for (int i = 0; i < memberA.size(); i++){
         if (memberA.get(i).getArrears()){
            System.out.println(memberA.get(i));
            if (!memberA.get(i).getMembershipStatus()){ //passive membership
               bill = 500;
            }                               
            else if (memberA.get(i).getAgeGroup() == Member.AgeGroup.JUNIOR){
               bill = 1000;
            }
            else if (memberA.get(i).getAgeGroup() == Member.AgeGroup.SENIOR){
               bill = 1600;
            }
            else{
               bill = 1600 * 0.75; // Dicount for SeniorPlus
            }
            System.out.println(memberA.get(i).getFullName() + " has to pay DKK " + bill);
         }
      }
   }    
}