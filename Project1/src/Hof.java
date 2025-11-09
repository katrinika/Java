import java.util.ArrayList;
import java.util.List;

public class Hof {
    List<Tier> tiere = new ArrayList<>();
    public void tierhinzufuegen(Tier neuesTier){
        tiere.add(neuesTier);
        System.out.println("Neues Tier " + neuesTier.name + " auf dem Hof.");
    }

    public void tierBericht(){
        System.out.println();
        System.out.println("Auf dem Hof gibt es " + tiere.size() + " Tiere.");
        System.out.println();

    }

    public void tierSuche() {
        System.out.println();
        System.out.println("Alle Katzen werden gesucht");
        for (int i = 0; i < tiere.size(); i = i + 1){
            Tier meinTier = tiere.get(i);
            if(meinTier.katze){
                System.out.println(meinTier.name);
            }
        }
    }

    public void tierSuche2(){
        System.out.println("Alle Tiere länger als 50cm werden gesucht.");
        for (int i = 0; i < tiere.size(); i = i + 1) {
            Tier meinTier = tiere.get(i);
            if (meinTier.laenge > 50) {
                System.out.println(meinTier.name);
            }
        }
    }
}

