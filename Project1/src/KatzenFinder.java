public class KatzenFinder implements Finder {

    public String titel() {
        return "Alle Katzen werden gesucht.";
    }

    public boolean passt(Tier meinTier) {
        return meinTier.katze;
    }
}
