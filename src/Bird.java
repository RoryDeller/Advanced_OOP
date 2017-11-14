public abstract class Bird extends Animal {


    public boolean isWinged() {
        return winged;
    }

    public void setWinged(boolean winged) {
        this.winged = winged;
    }

    public  void doesNothing(){
        System.out.println("Doing nothing.");
    }


    private boolean winged;

    public Bird(boolean vertebres, boolean invertebres, String species, boolean winged) {
        super(vertebres, invertebres, species);
        this.winged = winged;

    }



}
