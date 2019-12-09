import java.util.*;

public class Helper{
	
	// Use .name() on enum to get its string representation
   	public static String formatEnum(String enumString){
    	return enumString.substring(0, 1).toUpperCase() + enumString.substring(1).toLowerCase();
   	}

   	public static Tournament selectTournament(ArrayList<Tournament> tournamentA){
   		System.out.println("Please select a tournament");
   		int i = 1;
   		for(Tournament tournament : tournamentA){
   			System.out.printf("%d - %s%n", i, tournament.getTournamentName());
   			i++;
   		}
   		System.out.print("Select: ");
   		return tournamentA.get(InputHelper.getOptionFromUser(1, tournamentA.size()) - 1);
   	}

   	public static CompSwimmer selectCompSwimmer(ArrayList<CompSwimmer> compSwimmerA){
   		System.out.printf("Please select a comptetive swimmer");
   		int i = 1;
   		for(CompSwimmer swimmer : compSwimmerA){
   			System.out.printf("%d - %s%n", i, swimmer.getFullName());
   			i++;
   		}
   		System.out.print("Select: ");
   		return compSwimmerA.get(InputHelper.getOptionFromUser(1, compSwimmerA.size()) - 1);
   	}

   	public static Member selectMember(ArrayList<Member> memberA){
		System.out.println("Please select a member");
		int i = 1;
		for(Member member : memberA){
			System.out.printf("%d - %s%n", i, member.getFullName());
			i++;
		}
		System.out.print("Select: ");
		return memberA.get(InputHelper.getOptionFromUser(1, memberA.size()) - 1);
   	}
}
