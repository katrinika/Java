//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

// katzeninfo("Oskar",70, 7.8, true);

 /*
    System.out.println();
    katzeninfo("Basilio",45, 3.7, false);
 */

    Katze osya = new Katze("Oskar", 70, 7.8, true);
/*
osya.name = "Oskar";
osya.laenge = 70;
osya.gewicht =7.8;
osya.schlaf = true;
*/
    Katze basya = new Katze("Basilio", 45, 3.7, false);
    /*
    basya.name = "Basilio";
    basya.laenge = 45;
    basya.gewicht =3.7;
    basya.schlaf = false;
*/

    Katze toffi = new Katze("Toffifee", 65, 5, true);

    Katze nina = new Katze("Nina", 55, 2.8, false);

    osya.katzeninfo();
    System.out.println();
    basya.katzeninfo();
    System.out.println();
    toffi.katzeninfo();
    System.out.println();
    nina.katzeninfo();


}