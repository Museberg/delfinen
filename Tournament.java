import java.util.*;
import java.time.*;
import java.time.format.*;

public class Tournament {
   //Fields for our tournament object.
   private String tournamentName;
   private String location;
   private Discipline.DisciplineType disciplineType;
   private Map<CompSwimmer, LocalTime> participants = new HashMap <CompSwimmer, LocalTime>();
   
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
   
   public static Tournament makeNewTournament(ArrayList<CompSwimmer> swimmerA) {
      Scanner console = new Scanner(System.in);

      System.out.println("What is the name of the proceeding tournament? ");
      String tournamentName = console.nextLine();

      System.out.println("Where is the tournament going to take place? ");
      String location = console.nextLine();

      System.out.println("Which type of discipline are they competing in?");
      Discipline.DisciplineType disciplineType = Discipline.letUserSelectDisciplineType();

      boolean addAnother;
      Map<CompSwimmer, LocalTime> participants = new HashMap <CompSwimmer, LocalTime>();
      ArrayList<CompSwimmer> tempSwimmerA = swimmerA;

      do{
         CompSwimmer swimmer = CompSwimmer.letUserSelectCompSwimmer(tempSwimmerA, disciplineType);
         tempSwimmerA.remove(swimmer);

         System.out.printf("What is %s's time? (mm:ss.SSS)%nTime: ", swimmer.getFullName());
         LocalTime time = TimeHelper.getValidTimeFromUser();

         // Adding swimmer with time to map
         participants.put(swimmer, time);

         System.out.printf("Do you wish to add another competitor to the tournament?%nPress %d for no%nPress %d for yes%nSelect: ", 0, 1);
         addAnother = InputHelper.getOptionFromUser(0, 1) == 1;

      }while(addAnother);
      
      return new Tournament(tournamentName, location, disciplineType, participants);
   }
   
   /*public static void editTournament(ArrayList<Tournament> tournamentList){
      Scanner console = new Scanner(System.in);
      for(int i = 0; i < tournamentList.size(); i++) {
         System.out.println(i+1 + ". " + "Tournament Name: "+ tournamentList.get(i).getTournamentName());
      }
      System.out.println("\nFor which tournament would you like to edit? ");
      int targetTournament = InputHelper.getIntFromUser() -1;
      System.out.println("\n1. Time \n2. Location \n3. Placement \n4. TournamentName");
      int choice = InputHelper.getOptionFromUser(1,4);
      switch(choice) {
         case 1:
            System.out.println("What is the new time?");
            Double newTime = InputHelper.getDoubleFromUser();
            tournamentList.get(targetTournament + 1).setTime(newTime);
            break;
         case 2:
            System.out.println("Set the new location:");
            String newLocation = console.nextLine();
            tournamentList.get(targetTournament + 1).setLocation(newLocation);
            break;
         case 3:
            System.out.println("Set the new placements: ");
            int newPlacement = console.nextInt();
            tournamentList.get(targetTournament + 1).setPlacement(newPlacement);
            break;
         case 4:
            System.out.println("What is the new Tournament name?");
            String newTournamentName = console.nextLine();
            tournamentList.get(targetTournament + 1).setLocation(newTournamentName);
      
      }
   }
   
   
   public String toString() {
      return "Time: " + time + "\nLocation: " + location + "\nPlacement: " + placement + ".place" + "\nTournament Name " + tournamentName;
   }*/
}
