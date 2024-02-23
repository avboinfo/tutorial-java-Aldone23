import java.util.ArrayList;
import java.util.Collections;

public class ProveArrayList {

    public static void main(String[] args){
        System.out.println("!!------PROVA STARTED------!!");

        ArrayList<String> a = new ArrayList<>();
        a.add("uno");
		a.add("Babina");
		a.add("tre");
		a.add("quattro");
		a.add("cinque");
		
		a.remove("Babina");
        a.add(1,"due");
		
        //I seguenti for eseguono la stessa funzione, il primo è più semplice
        for(String s : a){
            System.out.println(s);
        }

        for(int i = 0; i<a.size();i++){
            String s = a.get(i);
            System.out.println(s);
        }
		
        System.out.println(a);

        System.out.println("Juve".compareTo("Milan"));

        

        

    }
}