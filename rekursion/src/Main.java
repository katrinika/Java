import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    void main() throws IOException {
        /*
     //   System.out.print("Rekursion");

        int summe = 0;

        for(int i=1; i <= 100; i=i+1){
            summe = summe + i;
        }

        System.out.println(summe);
     */

        System.out.println("Die Summe der natürlichen Zahlen von 1 bis 100 beträgt " + summe(100));
        System.out.println("20 Fakultät ist " + fakultaet(20));
        System.out.println("Die 8. Fibonacci Zahl lautet "+fibonacci(8));
        System.out.println("Ist Oskar ein Palyndrom? = " + palindrom("Oskar"));
        System.out.println("Ist Kazak ein Palyndrom? = " + palindrom("kazak"));
        palyndromFinder("wortliste.txt");
    }

    void palyndromFinder(String filename) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        while (line != null) {
            //System.out.println(line);
            String klein = line.toLowerCase();

            if(palindrom(klein)){
                System.out.println("- " + line);
            }

            line = br.readLine();
        }
        br.close();
    }

    int summe(int n){
        if(n==0){
           return 0;
        }
        else{
            return summe(n-1)+n;
        }
    }

    long fakultaet(long n){
        if(n==1){
            return 1;
        }
        else{
           return fakultaet(n-1)*n;
        }
    }

    int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        else{

            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    boolean palindrom(String wort){
        if(wort.length()==1){
            return true;
        }
        else{
            if(wort.length()==0){
                return true;
            }
            else{
               char ersterBuchstabe = wort.charAt(0);
               char letzterBuchstabe = wort.charAt(wort.length()-1);
               if(ersterBuchstabe!=letzterBuchstabe){
                   return false;
               }
               else{

                   String ausschnitt = wort.substring(1,wort.length()-1);
                   if(palindrom(ausschnitt)){
                       return true;
                   }
                   else{
                       return false;
                   }
                   // return palyndrom(ausschnitt);
               }
            }
        }
    }

}
