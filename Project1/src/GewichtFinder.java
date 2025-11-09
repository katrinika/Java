public class GewichtFinder implements Finder{

    public String titel() {
        return "Alle schwere Tiere werden gesucht.";
    }

    public boolean passt(Tier meinTier) {
        return meinTier.gewicht>6;
    }
}
