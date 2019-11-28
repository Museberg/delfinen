public class Tournament {
 //Fields til vores tournament objekt.
   private double time;
   private String location;
   private int placement;
   private String tournamentName;
   
   public Tournament(double time, String location, int placement, String tournament) {
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
      this.time = time; // By using keyword "This.", the field time now has a new value, that overlaps the old value.
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
   public String toString() {
      return "Time: " + time + "\nLocation: " + location + "\nPlacement: " + placement + ".place" + "Tournament Name " + tournamentName;
   }
}