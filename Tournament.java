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
      int placement = console.nextInt();
      System.out.println("Your placement has been set to be " + placement);
      System.out.println("What time should the tournament be? ");
      System.out.println("The time should be formatted by hh,mm!");
      double time = console.nextDouble();
      
      Tournament temp = new Tournament(time, location, placement, tournamentName);  
      System.out.println(temp);
   
      tournamentList.add(temp);
   }
   
   
   public String toString() {
      return "Time: " + time + "\nLocation: " + location + "\nPlacement: " + placement + ".place" + "\nTournament Name " + tournamentName;
   }
}