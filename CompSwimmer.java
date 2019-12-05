import java.util.*;

public class CompSwimmer extends Member{
    private Trainer trainer;
    private Discipline.DisciplineType swimmingDiscipline;
   
    public CompSwimmer(String fullName, String address, int phoneNumber, String birthDate, boolean membershipStatus, boolean arrears, Trainer trainer, Discipline.DisciplineType swimmingDiscipline){
        super(fullName, address, phoneNumber, birthDate, membershipStatus, arrears);
        this.trainer = trainer; 
        this.swimmingDiscipline = swimmingDiscipline;
    }
    // Getters
    public String getTrainerName(){
        return trainer.getFullName();
    }
    public Trainer getTrainer(){
        return trainer;
    }
    public Discipline.DisciplineType getSwimmingDiscipline(){
        return swimmingDiscipline;
    }
    // Setters
    public void setSwimmingDiscipline(Discipline.DisciplineType swimmingDiscipline){
        this.swimmingDiscipline = swimmingDiscipline;
    }
    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
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

        Trainer trainer = Trainer.letUserSelectTrainer(trainerA);

        System.out.println("Swimming discipline:");
        Discipline.DisciplineType swimmingDiscipline = Discipline.letUserSelectDisciplineType();
          
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

        System.out.print("Select: ");
        int option = InputHelper.getOptionFromUser(1, 7);

        switch(option){
            case 1: // Change name
                System.out.println("What do you want to change the name to?");
                this.setFullName(InputHelper.getStringFromUser("name"));
                break;
            case 2: // Change address
                System.out.println("What do you want to change the address to?");
                this.setAddress(InputHelper.getAddressFromUser());
                break;
            case 3: // Phone Number
                System.out.println("What do you want to change the phone number to?");
                this.setPhoneNumber(InputHelper.getPhoneNumberFromUser());
                break;
            case 4: // Change birthdate
                System.out.println("What do you want to change the birthdate to?");
                this.setBirthDate(DateHelper.getValidDateFromUser());
                break;
            case 5: // Change membership status
                System.out.printf("What do you want to change the update status to?%n%d for active%n%d for passive%nSelect: ", 1, 2);
                this.setMembershipStatus(InputHelper.getOptionFromUser(1, 2) == 1);
                break;
            case 6: // Change trainer
                System.out.println("Which trainer do you want to change it to?");
                this.setTrainer(Trainer.letUserSelectTrainer(trainerA));
                break;
            case 7: // Change swimming discipline
                System.out.println("What do you want to change the swimming discipline type to?");
                this.setSwimmingDiscipline(Discipline.letUserSelectDisciplineType());
                break;
            default: // Do nothing
                break;
        }

    }
}

