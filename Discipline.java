public class Discipline {
   public enum DisciplineType {
      Butterfly,
      Backstroke,
      Breaststroke,
      Freestyle
   }
   private DisciplineType disciplineType; // 
   private String listOfMembers; //Husk at tilnytte til den rigtige liste.
   
   public Discipline(DisciplineType disciplineType, String listOfMembers) {
      this.disciplineType = disciplineType;
      this.listOfMembers = listOfMembers; 
   }
   
   public DisciplineType getDisciplineType() {
      return disciplineType;
   }
   
   public String getListOfMembers() {
      return listOfMembers;
   }
   
   public void setDisciplineType(DisciplineType disciplineType) {
      this.disciplineType = disciplineType;
   }
   
   public void setListOfMembers(String listOfMembers) { // Husk at ændre fra string til ArrayList, når der er en liste.
      this.listOfMembers = listOfMembers;
   }
   public String toString() {
      return "Discipline Type: " + disciplineType + "ListOfMembers: " + listOfMembers;
   }
}