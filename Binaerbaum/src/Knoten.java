public class Knoten extends Baumelement {
    public Datenelement daten;
    public Baumelement links;
    public Baumelement rechts;
    public Knoten(Datenelement daten){
        this.daten = daten;
        this.links = new Abschluss();
        this.rechts = new Abschluss();
    }
    public Baumelement einfuegen(Datenelement neueDaten){
        String eigenerName = daten.name;
        String neuerName = neueDaten.name;
        if(eigenerName.equals(neuerName)){
            System.out.println("Datenelement bereits vorhanden: "+ eigenerName);
            return this;
        }
        if(eigenerName.compareToIgnoreCase(neuerName) < 0){  // neuer Name kommt alphabetisch VOR dem eigenem Namen
            this.rechts = this.rechts.einfuegen(neueDaten);
        }
        else{
            this.links = this.links.einfuegen(neueDaten);
        }
        return this;
    }

    public int anzahl() {
        return 1 + links.anzahl() + rechts.anzahl();
    }
    public int gibHoehe(){
        return 1 + Math.max(links.gibHoehe(),rechts.gibHoehe());
    }
    public void gibAlphabet() {
        links.gibAlphabet();
        System.out.println(this.daten.name);
        rechts.gibAlphabet();
    }

}

