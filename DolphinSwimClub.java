import java.util.*;

public class DolphinSwimClub{
	
	public static void main(String[] args){
		ArrayList<Trainer> trainerA = new ArrayList<Trainer>();
		Trainer newTrainer = new Trainer("Uncle Jules", "Nørrebro Lige Der Over 2200", 12345678, "Team Jules", false);
		trainerA.add(newTrainer);
		Member newMem = new Member("Rasmus Falk-Jensen", "Frederiksberg Bredegade 13B Frederiksberg 2000", 31953678, "28/05 1997", true, false);

		System.out.print(newMem);
		CompSwimmer.makeNewCompSwimmer(trainerA);
	}
}