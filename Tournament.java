import java.util.*;

public class Tournament {
 //Fields til vores tournament objekt.
   private double time;
   private String location;
   private int placement;
   private String tournamentName;
   
   public Tournament(double time, String location, int placement, String tournamentName) {
      this.time = time;
      this.location = location;
      this.placement = placement;
      this.tournamentName = tournamentName;
   }
   //Getter methods - accessors
   
   public double getTime() {
      return time;
   }
   
   public String getLocation() {
      return location;
   }
   
   public int getPlacement() {
      return placement;
   }
   
   public String getTournamentName() {
      return tournamentName;
   }
   
   //Setter methods - mutators
   
   public void setTime(double time) {
      this.time = time; //By using keyword "This.", the field time now has a new value, that overlaps the old value.
   }
   
   public void setLocation(String Location) {
      this.location = location;
   }
   
   public void setPlacement(int placement) {
      this.placement = placement;
   }
   
   public void setTournamentName(String tournamentName) {
      this.tournamentName = tournamentName;
     
   }
   
   public static void createTournament(Scanner console, ArrayList<Tournament> tournamentList) {
      System.out.println("Weeeelcome to Tournament Section!");
      System.out.print("What is the name of the proceeding tournament? ");
      String tournamentName = console.nextLine();
      System.out.println("Your name has been given to be " + tournamentName);
      System.out.print("Where is the tournament going to take place? ");
      String location = console.nextLine();
      System.out.println("Your tournament has been set to be in " + location);
      System.out.print("What is the placement for the tournament? ");
      int placement = InputHelper.getIntFromUser();
      System.out.println("Your placement has been set to be " + placement);
      System.out.println("What time should the tournament be? ");
      System.out.println("The time should be formatted by hh,mm!");
      double time = InputHelper.getDoubleFromUser();
      
      System.out.println();
      Tournament temp = new Tournament(time, location, placement, tournamentName);  
      System.out.println(temp);
   
      tournamentList.add(temp);
   }
   
   public static void editTournament(ArrayList<Tournament> tournamentList){
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
   }
}
