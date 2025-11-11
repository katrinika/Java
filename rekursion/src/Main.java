public class Main {

    void main(){
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
}
