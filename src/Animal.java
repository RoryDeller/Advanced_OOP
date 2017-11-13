public abstract class Animal {

    private boolean vertebres;
    private boolean invertebres;
    private String species;

    public boolean isVertebres() {
        return vertebres;
    }

    public void setVertebres(boolean vertebres) {
        this.vertebres = vertebres;
    }

    public boolean isInvertebres() {
        return invertebres;
    }

    public void setInvertebres(boolean invertebres) {
        this.invertebres = invertebres;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    public Animal(boolean vertebres, boolean invertebres, String species) {
        this.vertebres = vertebres;
        this.invertebres = invertebres;
        this.species = species;
    }

    public abstract void doesNothing();
}
