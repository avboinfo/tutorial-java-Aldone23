import java.util.ArrayList;
import java.util.Collections;

public class ProveArrayList {

    public static void main(String[] args){
        System.out.println("!!------PROVA STARTED------!!");

        ArrayList<String> a = new ArrayList<>();
        a.add("uno");
		a.add("due");
		a.add("tre");
		a.add("quattro");
		a.add("cinque");
		
		a.remove("due");
		
		Collections.sort(a);
		System.out.println(a);

        System.out.pritnln("Juve".compareTo("Milan"));

    }
}