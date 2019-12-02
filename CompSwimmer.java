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
    public Trainer getTrainer(){
        return trainer;
    }
    public Discipline.DisciplineType getSwimmingDiscipline(){
        return swimmingDiscipline;
    }
    public void setSwimmingDiscipline(Discipline.DisciplineType swimmingDiscipline){
        this.swimmingDiscipline = swimmingDiscipline;
    }
   
    public static CompSwimmer makeNewCompSwimmer(ArrayList<Trainer> trainerA){
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
            System.out.println(i + " - " + Helper.getEnumAsString(d.name()));
            i++;
        }
        option = InputHelper.getOptionFromUser(1, Discipline.DisciplineType.values().length);
        Discipline.DisciplineType swimmingDiscipline = Discipline.DisciplineType.values()[option - 1];
          
        return new CompSwimmer(fullName, address, phoneNumber, birthDate, membershipStatus, false, trainer, swimmingDiscipline);
    }

    public void editCompSwimmer(ArrayList<Trainer> trainerA){
        System.out.println("What do you want to edit?");

        System.out.printf("%d - Full name (%s)%n", 1, this.getFullName());
        System.out.printf("%d - Address (%s)%n", 2, this.getAddress());
        System.out.printf("%d - Phone Number (%s)%n", 3, this.getPhoneNumber());
        System.out.printf("%d - Birthdate (%s)%n", 4, DateHelper.dateToString(this.getBirthDate()));
        System.out.printf("%d - Membership Status (%s)%n", 5, (this.getMembershipStatus() ? "Active" : "Passive"));
        System.out.printf("%d - Trainer (%s)%n", 6, this.getTrainer().getFullName());
        System.out.printf("%d - Swimming Discipline (%s)%n", 7, Helper.getEnumAsString(getSwimmingDiscipline().name()));

        int option = InputHelper.getOptionFromUser(1, 7);

        switch(option){
            case 1: // Change name

                break;
            case 2: // Change address

                break;
            case 3: // Phone Number

                break;
            case 4: // Change birthdate

                break;
            case 5: // Change membership status

                break;
            case 6: // Change trainer

                break;
            case 7: // Change swimming discipline

                break;
            case default:
                break;
        }

    }
}

