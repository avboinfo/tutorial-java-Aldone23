/*
** Esempio di uso di uno Stack (Pila)
** Sandro Gallo - 08/02/2024
*/

package S_Stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();


         try {
            File f1 = new File("F_File/InputFile.txt");
            File f = new File("F_File/OutputFile.txt");

            Scanner fileInput = new Scanner(f1);

             FileWriter fw = new FileWriter(f);
            
                while (fileInput.hasNextLine()) {
                    String temp = fileInput.nextLine();
                        s.push(temp);

                        fw.write(s+"");
            }

            fileInput.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        
        
    }

}
