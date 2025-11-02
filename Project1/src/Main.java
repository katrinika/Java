//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    katzeninfo("Oskar",70, 7.8, true);
    System.out.println();
    katzeninfo("Basilio",45, 3.7, false);
}

void katzeninfo(String name, int laenge, double gewicht, boolean schlaf) {
    System.out.println("Meine Katze heißt " + name +
            " und er ist " + laenge +" cm lang."+"\nEr wiegt "+ gewicht + " Kilogramm.");
    if(schlaf){
        System.out.println("Er schläft gerade.");
    }
    else{
        System.out.println("Er isst gerade.");
    }
}