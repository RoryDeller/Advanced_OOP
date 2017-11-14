public class Seagull extends Bird{

    public Seagull(boolean vertebres, boolean invertebres, String species, boolean winged) {
        super(vertebres, invertebres, species, winged);
    }

    public void somethingThatOnlySeagullsDo () {
        System.out.println("Steal chips");
    }

}
