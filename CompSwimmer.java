import java.util.*;

public class CompSwimmer extends Member{
    private Trainer trainer;
    private Discipline.DisciplineType swimmingDiscipline;
   
    public CompSwimmer(String fullName, String address, int phoneNumber, String birthDate, boolean membershipStatus, boolean arrears, Trainer trainer, Discipline.DisciplineType swimmingDiscipline){
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
    public void setSwimmingDiscipline(Discipline.DisciplineType swimmingDiscipline){
        this.swimmingDiscipline = swimmingDiscipline;
    }
   
    public static void makeNewCompSwimmer(ArrayList<Trainer> trainerA){
        System.out.println("Full name:");
        String fullName = InputHelper.getStringFromUser("name");

        System.out.println("Address:");
        String address = InputHelper.getAddressFromUser();

        System.out.println("Phone number:");
        int phoneNumber = InputHelper.getPhoneNumberFromUser();

        System.out.println("Birthdate. Please type as dd/mm yyyy");
        String birthDate = DateHelper.dateToString(DateHelper.getValidDateFromUser());

        System.out.printf("Passive or active member?%n%d for active%n%d for passive%n", 1, 2);
        boolean membershipStatus = InputHelper.getOptionFromUser(1, 2) == 1;

        System.out.println("Please select a trainer:");
        int i = 1;
        for(Trainer trainer : trainerA){
            System.out.printf("%d - %s%n", i, trainer.getFullName());
            i++;
        }
        int option = InputHelper.getOptionFromUser(1, trainerA.size());
        Trainer trainer = trainerA.get(option - 1);

        System.out.println("Swimming discipline:");
        i = 1;
        for(Discipline.DisciplineType d : Discipline.DisciplineType.values()){
            String dis = d.name();
            System.out.println(i + " - " + dis.substring(0, 1).toUpperCase() + dis.substring(1).toLowerCase());
            i++;
        }
        option = InputHelper.getOptionFromUser(1, Discipline.DisciplineType.values().length);
        Discipline.DisciplineType swimmingDiscipline = Discipline.DisciplineType.values()[option - 1];
          
        return new CompSwimmer(fullName, address, phoneNumber, birthDate, membershipStatus, false, trainer, swimmingDicipline);
    }
}

