public class Main {
    void main() {
        //concentrationGame();
        //pyramide();
        schachBrett();
    }

    public void schachBrett() {
        System.out.print("╔═");
        linie();
        System.out.println("═╗");

        for (int y = 8; y >= 1; y--) {
            System.out.print("║ ");
            int blau = y% 2;
            for (int x = 1; x <= 8; x++) {
                feld(x % 2 == blau);
            }
            System.out.println(" ║");
        }
        System.out.print("╚═");
        linie();
        System.out.println("═╝");
    }

    public void linie(){
        for(int v=1; v<=8; v=v+1){
            System.out.print("═══");
        }
    }


    public void feld(boolean istSchwarz) {
        if (istSchwarz) {
            System.out.print("   ");
        } else {
            System.out.print("██");
        }
    }

    public void concentrationGame() {
        for (int i = 1; i <= 10; i = i + 1) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }

    public void pyramide() {
        for (int i = 1; i <= 10; i = i + 1) {
            for (int ii = 1; ii <= i; ii = ii + 1) { //schleife in schleife damit print mal i passiert
                System.out.print("#");
            }
            System.out.println();
        }
    }

}