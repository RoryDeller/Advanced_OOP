public class BabySeagull extends Seagull {

    public BabySeagull(boolean vertebres, boolean invertebres, String species, boolean winged) {
        super(vertebres, invertebres, species, winged);
    }

    public void doesNothing(){
        System.out.println("Im a baby seagull");
    }
}
