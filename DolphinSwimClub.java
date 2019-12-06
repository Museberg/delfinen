import java.util.*;
import java.time.*;
import java.time.format.*;

public class DolphinSwimClub{
	
	public static void main(String[] args){
		ArrayList<Trainer> trainerA = new ArrayList<Trainer>();
		ArrayList<Member> memberA = new ArrayList<>(); 
		ArrayList<Tournament> tournamentA = new ArrayList<>();

		Trainer newTrainer = new Trainer("Uncle Jules", "Nørrebro Lige Der Over 2200", 12345678, "Team Jules", false);

		CompSwimmer newSwimmer = new CompSwimmer("Rasmus Falk-Jensen", "Frederiksberg Bredegade 13B 2000", 31953678, "28/05 1997", true, false, newTrainer, Discipline.DisciplineType.BUTTERFLY);
		memberA.add(newSwimmer);

		trainerA.add(newTrainer);
		Member newMem = new Member("Rasmus Falk-Jensen", "Frederiksberg Bredegade 13B Frederiksberg 2000", 31953678, "28/05 1997", true, false);

		//newSwimmer.editCompSwimmer(trainerA);
		//System.out.print(newMem);
		//CompSwimmer.makeNewCompSwimmer(trainerA);

		Tournament.makeNewTournament(memberA);

	}
}