//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Tier osya = new Tier("Oskar", 70, 7.8, true, true);

    Tier basya = new Tier("Basilio", 45, 3.7, false, true);

    Tier toffi = new Tier("Toffi", 65, 5, true, true);

    Tier nina = new Tier("Nina", 55, 2.8, false, true);

    Tier lyra = new Tier("Lyra", 120, 20, false, false);

    /*
    osya.tierinfo();
    System.out.println();
    basya.tierinfo();
    System.out.println();
    toffi.tierinfo();
    System.out.println();
    nina.tierinfo();
    System.out.println();
    lyra.tierinfo();
*/

    Hof hof = new Hof();
    hof.tierBericht();
    hof.tierhinzufuegen(osya);
    hof.tierhinzufuegen(basya);
    hof.tierBericht();
    hof.tierhinzufuegen(lyra);
    hof.tierhinzufuegen(nina);
    hof.tierBericht();
    hof.tierhinzufuegen(toffi);
    hof.tierBericht();

}