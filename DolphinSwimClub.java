import java.util.*;

public class DolphinSwimClub{
	
   public static void main(String[] args){
      ArrayList<Trainer> trainerA = new ArrayList<Trainer>();
      ArrayList<Member> memberA = new ArrayList<Member>();
      Member temp = new Member("Michael Berko", "Fiolestrædet 1", 402394858, "20/02 1203", true, false);
      Member temp1 = new Member("Michael Berko", "Fiolestrædet 1", 402394858, "20/02 1203", true, false);
      Discipline newDiscipline = new Discipline(Discipline.DisciplineType.BUTTERFLY, memberA);
      Discipline newDiscipline1 = new Discipline(Discipline.DisciplineType.BUTTERFLY, memberA);
      memberA.add(temp);
      System.out.println(newDiscipline.toFile());
      Trainer newTrainer = new Trainer("Uncle Jules", "Nørrebro Lige Der Over 2200", 12345678, "Team Jules", false);
      CompSwimmer newSwimmer = new CompSwimmer("Rasmus Falk-Jensen", "Frederiksberg Bredegade 13B 2000", 31953678, "28/05 1997", true, false, newTrainer, Discipline.DisciplineType.BUTTERFLY);
      Tournament newTournament = new Tournament(12.00, "Denmark, Copenhagen", 3, "Copenhagen Swim 2019");
      //System.out.println(newDiscipline);
      //trainerA.add(newTrainer);
      //Member newMem = new Member("Rasmus Falk-Jensen", "Frederiksberg Bredegade 13B Frederiksberg 2000", 31953678, "28/05 1997", true, false);
   
      //newSwimmer.editCompSwimmer(trainerA);
   	//System.out.print(newMem);
   	//CompSwimmer.makeNewCompSwimmer(trainerA);
   }
}