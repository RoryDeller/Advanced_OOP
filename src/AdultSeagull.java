public class AdultSeagull extends Seagull {

    public AdultSeagull(boolean vertebres, boolean invertebres, String species, boolean winged) {
        super(vertebres, invertebres, species, winged);
    }

    public void doesNothing(){
        System.out.println("I'm an adult Seagull.");
    }
}
