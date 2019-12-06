import java.util.*;
import java.time.*;
import java.time.format.*;

public class Tournament {
    //Fields for our tournament object.
    private String tournamentName;
    private String location;
    private Discipline.DisciplineType disciplineType;
    private Map<CompSwimmer, LocalTime> participants = new LinkedHashMap <CompSwimmer, LocalTime>();
   
    public Tournament(String tournamentName, String location, Discipline.DisciplineType disciplineType, Map<CompSwimmer, LocalTime> participants) {
        this.location = location;
        this.tournamentName = tournamentName;
        this.disciplineType = disciplineType;
    }
    //Getter methods - accessors
   
    public String getLocation() {
        return location;
    }
   
    public String getTournamentName() {
        return tournamentName;
    }
   
    //Setter methods - mutators
   
    public void setLocation(String Location) {
        this.location = location;
    }
    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
     
    }
    public void setDisciplineType(Discipline.DisciplineType disciplineType){
        this.disciplineType = disciplineType;
    }
   
    public static Tournament makeNewTournament(ArrayList<Member> memberA) {
        Scanner console = new Scanner(System.in);

        System.out.println("What is the name of the proceeding tournament? ");
        String tournamentName = console.nextLine();

        System.out.println("Where is the tournament going to take place? ");
        String location = console.nextLine();

        System.out.println("Which type of discipline are they competing in?");
        Discipline.DisciplineType disciplineType = Discipline.letUserSelectDisciplineType();

        Map<CompSwimmer, LocalTime> participants = new LinkedHashMap <CompSwimmer, LocalTime>();


        System.out.println("Please select the participants of this tournament");
        addParticipants(participants, memberA, disciplineType);
      
        return new Tournament(tournamentName, location, disciplineType, participants);
   }
   
    public void editTournament(ArrayList<Member> memberA){
        Scanner console = new Scanner(System.in);

        System.out.printf("%d - Change the tournament's name%n", 1);
        System.out.printf("%d - Change the tournament's location%n,", 2);   
        System.out.printf("%d - Change the tournament's discipline. This also clears the list of participants%n", 3);
        System.out.printf("%d - Change the participants of this tournament%n", 4);
        System.out.print("Select: ");
        int option = InputHelper.getOptionFromUser(1, 4);

        switch(option) {
            case 1: // Change tournament name
                System.out.println("What do you want ot change the tournament's name to?");
                this.setTournamentName(console.nextLine());
                break; // Change tournament location
            
            case 2:
                System.out.println("What do you want to change the tournament's locationt to?");
                this.setLocation(console.nextLine());
                break; // Change tournament discipline (and add new participants)
            
            case 3:
                System.out.printf("What do you want to change the discipline to?%n Please note that this clears list of participants%n");
                System.out.printf("Are you sure you want to continue?%nPress %d for no%nPress %d for yes%n", 0, 1);
                if(InputHelper.getOptionFromUser(0, 1) == 0){ // If user wish to abort
                    break;
                }
                this.participants.clear();
                this.disciplineType = Discipline.letUserSelectDisciplineType();
                System.out.println("Please select the new participants of this tournament");
                addParticipants(this.participants, memberA, this.disciplineType);
                break;

            case 4: // Change the participants
                System.out.println("What change in participants do you want to make?");
                System.out.printf("%d to remove specific participants%n%d to add specific participants%n%d to remove all participants", 1, 2, 3);
                int selection = InputHelper.getOptionFromUser(1, 3);

                switch(selection) {
                    case 1: // Remove specific participants
                        deleteParticipants(this.participants);
                        break;
                    
                    case 2: // Add specific participants
                        addParticipants(this.participants, memberA, this.disciplineType);  
                        break;
                    
                    case 3: // Remove all participants
                        this.participants.clear();
                        System.out.println("All participants has now been removed");                
                        break;
                }

                break;
        }
    }
   
   
    /*public String toString() {
        return "Time: " + time + "\nLocation: " + location + "\nPlacement: " + placement + ".place" + "\nTournament Name " + tournamentName;
    }*/

    private static void addParticipants(Map<CompSwimmer, LocalTime> participants, ArrayList<Member> memberA, Discipline.DisciplineType disciplineType){
        boolean addAnother;

        ArrayList<CompSwimmer> tempSwimmerA = new ArrayList<>();
        // Creating list that only contains members who are competetive swimmers
        for(int i = 0; i < memberA.size(); i++){
            if(memberA.get(i) instanceof CompSwimmer){
            tempSwimmerA.add((CompSwimmer) memberA.get(i));
            }
        }
        do{
            CompSwimmer swimmer = CompSwimmer.letUserSelectCompSwimmer(tempSwimmerA, disciplineType);
            if(swimmer == null){
                System.out.printf("There are currently no swimmers registered in %s", Helper.getEnumAsString(disciplineType.name()));
                return;
            }
            tempSwimmerA.remove(swimmer);

            System.out.printf("What is %s's time? (mm:ss.SSS)%nTime: ", swimmer.getFullName());
            LocalTime time = TimeHelper.getValidTimeFromUser();

            // Adding swimmer with time to map
            participants.put(swimmer, time);

            System.out.printf("Do you wish to add another competitor to the tournament?%nPress %d for no%nPress %d for yes%nSelect: ", 0, 1);
            addAnother = InputHelper.getOptionFromUser(0, 1) == 1;

        }while(addAnother);
    }

    private static void deleteParticipants(Map<CompSwimmer, LocalTime> participants){
        int i = 1;
        for (Map.Entry<CompSwimmer, LocalTime> participant : participants.entrySet()){
            System.out.printf("%d - %s", i, participant.getKey());
        }
        Object[] keys = participants.keySet().toArray();
        participants.remove(keys[i - 1]);

    }
}
