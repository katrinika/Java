public class Katze {
    public String name;
    public int laenge;
    public double gewicht;
    public boolean schlaf;

    public Katze( String name, int laenge, double gewicht, boolean schlaf) {
        this.name = name;
        this.laenge = laenge;
        this.gewicht = gewicht;
        this.schlaf = schlaf;
    }

    public boolean weiblich() {
        return name.endsWith("a"); //Weibliche Katzen enden Name mit A
    }

    void katzeninfo() {

        String pronomen = weiblich() ? "Sie" : "Er";
       /*
       String pronomen;
       if(weiblich()){
           pronomen="Sie";
       }
       else{
           pronomen="Er";
       }
       */

        System.out.println("Meine Katze heißt " + name +
                " und "+ pronomen.toLowerCase() + " ist " + laenge +" cm lang.\n"+ pronomen +" wiegt "+ gewicht + " Kilogramm.");
        if(schlaf){
            System.out.println(pronomen + " schläft gerade.");
        }
        else{
            System.out.println(pronomen + " isst gerade.");
        }
    }
}

