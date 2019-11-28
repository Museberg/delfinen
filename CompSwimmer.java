import java.util.*;

public class CompSwimmer extends Member{
    private String trainerName;
    private String team;
    private String swimmingDicipline;
   
    public CompSwimmer(String fullName, String adress, int phoneNumber, String birthDate, String membershipStatus, boolean arrears, String trainerName, String team, String swimmingDicipline){
        super(fullName, adress, phoneNumber, birthDate, membershipStatus, arrears);
        this.trainerName = trainerName;
        this.team = team;
        this.swimmingDicipline = swimmingDicipline;
    }
   
    public String getTrainerName(){
        return trainerName;
    }
    public String getTeam(){
        return team;
    }
    public String getSwimmingDiciplie(){
        return swimmingDicipline;
    }
   
    public void setTrainerName(String trainerName){
        this.trainerName = trainerName;
    }
    public void setTeam(String team){
        this.team = team;
    }
    public void setSwimmingDicipline(String swimmingDicipline){
        this.swimmingDicipline = swimmingDicipline;
    }
   
    public static void makeNewCompSwimmer(ArrayList<CompSwimmer> proSwimmerA){
        Scanner console = new Scanner(System.in);
        Scanner console2 = new Scanner(System.in);
        System.out.println("Full name: ");
        String fullName = console.nextLine();
        System.out.println("Adress: ");
        String adress = console.nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = console.nextLine();
        System.out.println("Age: ");
        //int age = console2.nextInt(); relevant?
        System.out.println("Active or passive membership?(type a for active and p for passive): ");
        String membershipStatus = console.nextLine();
        System.out.println("Trainer name: ");
        String trainerName = console.nextLine();
        System.out.println("Team: ");
        String team = console.nextLine();
        System.out.println("Swimming dicipline: ");
        String swimmingDicipline = console.nextLine();
          
        /*ProSwimmer temp = new ProSwimmer(fullName, adress, phoneNumber, age, membershipStatus, trainerName, team, swimmingDicipline);
        proSwimmerA.add(temp);*/
    }
   
    public String toString(){
        return (getFullName() + "\n" + getAdress() + "\n" + getPhoneNumber() + "\n" + getAge() + "\n" + getMembershipStatus() + "\n" + trainerName + "\n" + team + "\n" + swimmingDicipline);
    }
}