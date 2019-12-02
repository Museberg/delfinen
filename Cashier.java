import java.util.*;

public class Cashier {
    public static void checkArrears (ArrayList<Member> memberA){
        for (int i = 0; i < memberA.size(); i++){
            if (memberA.get(i).getArrears()){
                System.out.println(memberA.get(i));
            }
        }
    }    
}