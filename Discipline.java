import java.util.*;
public class Discipline {
   public static enum DisciplineType {
      BUTTERFLY,
      BACKSTROKE,
      BREASTSTROKE,
      FREESTYLE
   }
   //Fields
   private DisciplineType disciplineType;
   private ArrayList<Member> memberA; //Husk at tilnytte til den rigtige liste.
   
   //Constructor
   public Discipline(DisciplineType disciplineType, ArrayList<Member> memberA) {
      this.disciplineType = disciplineType;
      this.memberA = memberA; 
   }
   
    //Getter methods to access the encapsulated fields
    public DisciplineType getDisciplineType() {
        return disciplineType;
    }
   
   public ArrayList<Member> getMemberA() {
      return memberA;
   }
    public ArrayList<Member> getListOfMembers() {
        return memberA;
    }
    //Setter methods to translate the fields.
    public void setDisciplineType(DisciplineType disciplineType) {
        this.disciplineType = disciplineType;
    }
    public void setListOfMembers(String listOfMembers) { // Husk at ændre fra string til ArrayList, når der er en liste.
        this.memberA = memberA;
    }
    
    // Show top 5
   /* public void printTop5(ArrayList<CompSwimmer> compSwimmerA) {
        ArrayList<CompSwimmers> tempA = new ArrayList<>();
        for(CompSwimmer s : compSwimmerA) {
            if() {
                
            }
        }
    }*/
    
    // Prints list of discipline types and returns the discipline type selected by the user
    public static DisciplineType letUserSelectDisciplineType(){
        System.out.println("Please select the discipline type:");
        int i = 1;
        for(DisciplineType d : DisciplineType.values()){
            System.out.println(i + " - " + Helper.formatEnum(d.name()));
            i++;
        }
        System.out.print("Select: ");
        return DisciplineType.values()[InputHelper.getOptionFromUser(1, DisciplineType.values().length) - 1];
    }
   
   
   
   //A toString method to make the object print itself.
   public String toString() {
      return "Discipline Type: " + disciplineType + "\nListOfMembers: " + memberA;
   }
   
   public String toFile() {
      return ""+ getDisciplineType() + "\n" + memberA.get(0).getFullName() + "\n" + memberA.get(0).getAddress();
   }
}