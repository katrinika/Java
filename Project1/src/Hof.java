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
}

