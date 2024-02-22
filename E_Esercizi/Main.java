import java.util.*;
import java.io.*;

public class Main{
    public static void main( String[] args ) {
        Pila<String> p = new Pila<>();
        
    

    File f = new File("E_Esercizi/datiln.txt");
    Scanner scan  = new Scanner(f);

    try{

        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            p.push(line);
        }
        scanner.close();
    

    }catch(Exception E){
        System.out.println("Error " + e.toString());
    }

    System.out.println();
}
}