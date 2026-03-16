public class Abschluss extends Baumelement {
    public Baumelement einfuegen(Datenelement element){
        Baumelement k = new Knoten(element);
        return k;
    }
    public int anzahl() {
        return 0;
    }
    public int gibHoehe(){
        return 0;
    }
    public void gibAlphabet() {
    }
}

