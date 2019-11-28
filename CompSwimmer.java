import java.util.*;

public class CompSwimmer extends Member{
    private Trainer trainer;
    private Discipline.DisciplineType swimmingDiscipline;
   
    public CompSwimmer(String fullName, String address, int phoneNumber, String birthDate, boolean membershipStatus, boolean arrears, Trainer trainer, String teamName, Discipline.DisciplineType swimmingDiscipline){
        super(fullName, address, phoneNumber, birthDate, membershipStatus, arrears);
        this.trainer = trainer; 
        this.swimmingDiscipline = swimmingDiscipline;
    }
   
    public String getTrainerName(){
        return trainer.getFullName();
    }
    public Discipline.DisciplineType getSwimmingDiscipline(){
        return swimmingDiscipline;
    }
   
    // public void setTrainerName(String trainerName){
    //     this.trainerName = trainerName;
    // }
    public void setSwimmingDiscipline(Discipline.DisciplineType swimmingDiscipline){
        this.swimmingDiscipline = swimmingDiscipline;
    }
   
    public static void makeNew(ArrayList<CompSwimmer> compSwimmerA, ArrayList<Trainer> trainerA){
        System.out.println("Full name:");
        String fullName = InputHelper.getStringFromUser("name");

        System.out.println("Adress:");
        String adress = InputHelper.getAddressFromUser();

        System.out.println("Phone number:");
        int phoneNumber = InputHelper.getPhoneNumberFromUser();

        System.out.println("Birthdate. Please type as dd/mm yyyy");
        String birthDate = DateHelper.dateToString(DateHelper.getValidDateFromUser());

        System.out.printf("Passive or active member?%n%d for active%n%d for passive", 1, 2);
        boolean membershipStatus = InputHelper.getOptionFromUser(1, 2) == 1;

        System.out.println("Please select a trainer:");
        int i = 0;
        for(Trainer trainer : trainerA){
            System.out.printf("%s %d%n", trainer.getFullName(), i);
        }
        int option = InputHelper.getOptionFromUser(1, trainerA.size());
        Trainer trainer = trainerA.get(i - 1);

        System.out.println("Swimming discipline:");
          
        /*ProSwimmer temp = new ProSwimmer(fullName, adress, phoneNumber, age, membershipStatus, trainerName, teamName, swimmingDicipline);
        proSwimmerA.add(temp);*/
    }
}