//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    String name;
    name = "Oskar";

    int laenge;
    laenge = 70;

    double gewicht;
    gewicht = 7.8;

    boolean schlaf
            = false;


    System.out.println("Meine Katze heißt " + name +
    " und er ist " + laenge +" cm lang."+"\nEr wiegt "+ gewicht + " Kilogramm.");
    if(schlaf){
        System.out.println("Er schläft gerade.");
    }
    else{
        System.out.println("Er isst gerade.");
    }
}