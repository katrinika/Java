public class Tier {
    public String name;
    public int laenge;
    public double gewicht;
    public boolean schlaf;
    public boolean katze;

    public Tier( String name, int laenge, double gewicht, boolean schlaf, boolean katze) {
        this.name = name;
        this.laenge = laenge;
        this.gewicht = gewicht;
        this.schlaf = schlaf;
        this.katze = katze;
    }

    public boolean weiblich() {
        return name.endsWith("a"); //Weibliche Katzen enden Name mit A
    }

    void tierinfo() {

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
        if(katze){
            System.out.print("Meine Katze");
        }
        else{
            System.out.print("Mein Hund");
        }
        System.out.println(" heißt " + name +
                " und "+ pronomen.toLowerCase() + " ist " + laenge +" cm lang.\n"+ pronomen +" wiegt "+ gewicht + " Kilogramm.");

        if(schlaf){
            System.out.println(pronomen + " schläft gerade.");
        }
        else{
            System.out.println(pronomen + " isst gerade.");
        }
    }
}

