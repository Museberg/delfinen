public class Discipline {
    public static enum DisciplineType {
        BUTTERFLY,
        BACKSTROKE,
        BREASTSTROKE,
        FREESTYLE
    }
    //Fields
    private DisciplineType disciplineType;
    private String listOfMembers; //Husk at tilnytte til den rigtige liste.
   
    //Constructor
    public Discipline(DisciplineType disciplineType, String listOfMembers) {
        this.disciplineType = disciplineType;
        this.listOfMembers = listOfMembers; 
    }
   
    //Getter methods to access the encapsulated fields
    public DisciplineType getDisciplineType() {
        return disciplineType;
    }
   
    public String getListOfMembers() {
        return listOfMembers;
    }
    //Setter methods to translate the fields.
    public void setDisciplineType(DisciplineType disciplineType) {
        this.disciplineType = disciplineType;
    }
   
    public void setListOfMembers(String listOfMembers) { // Husk at ændre fra string til ArrayList, når der er en liste.
        this.listOfMembers = listOfMembers;
    }

    // Prints list of discipline types and returns the discipline type selected by the user
    public static DisciplineType letUserSelectDisciplineType(){
        System.out.println("Please select the discipline type:");
        int i = 1;
        for(DisciplineType d : DisciplineType.values()){
            System.out.println(i + " - " + Helper.getEnumAsString(d.name()));
            i++;
        }
        System.out.print("Select: ");
        return DisciplineType.values()[InputHelper.getOptionFromUser(1, DisciplineType.values().length) - 1];
    }
   
   
    //A toString method to make the object print itself.
    public String toString() {
        return "Discipline Type: " + disciplineType + "ListOfMembers: " + listOfMembers;
    }
}