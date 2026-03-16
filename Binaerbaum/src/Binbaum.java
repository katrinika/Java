public class Binbaum {
    public Baumelement wurzel;
    public Binbaum (){
        this.wurzel = new Abschluss();
    }
    public void einfuegen (Datenelement newDaten){
        this.wurzel = wurzel.einfuegen(newDaten);
        System.out.println("Element: " + newDaten.name +"  Anzahl: " + wurzel.anzahl() + "  Höhe: " + wurzel.gibHoehe());
        //System.out.print("  Höhe: " + wurzel.gibHoehe());
    }
    public void gibAlphabet (){

        wurzel.gibAlphabet();
    }
}
