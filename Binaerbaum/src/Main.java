public class Main {
    public void main(){
        Binbaum baum = new Binbaum();
        baum.einfuegen(new Datenelement("cat"));
        baum.einfuegen(new Datenelement("car"));
        baum.einfuegen(new Datenelement("coin"));
        baum.einfuegen(new Datenelement("cat"));
        baum.einfuegen(new Datenelement("crab"));
        baum.einfuegen(new Datenelement("clip"));
        baum.einfuegen(new Datenelement("cook"));
        baum.gibAlphabet();
    }
}

