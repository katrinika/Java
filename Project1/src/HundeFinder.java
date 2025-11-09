public class HundeFinder implements Finder {

    public String titel() {
        return "Alle Hunde werden gesucht.";
    }


    public boolean passt(Tier meinTier) {
        return meinTier.katze==false;
    }
}
