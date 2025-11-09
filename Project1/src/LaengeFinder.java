public class LaengeFinder implements Finder{

    public String titel() {
        return "Alle große Tiere werden gesucht.";
    }

    public boolean passt(Tier meinTier) {
        return meinTier.laenge>60;
    }
}
