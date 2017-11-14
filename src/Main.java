import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Bird> birds = new ArrayList<>();

        Seagull aGull = new Seagull(true, false, "seagull", true);
        birds.add(aGull);

        BabySeagull babyGull = new BabySeagull(true, false, "seagull", true);
        birds.add(babyGull);

        AdultSeagull adultGull = new AdultSeagull(true, false, "seagull", true);
        birds.add(adultGull);


        for (Bird b : birds){
            System.out.println(b.getClass().getName());
            b.doesNothing();

            if (aGull instanceof Seagull){
                ((Seagull) aGull).somethingThatOnlySeagullsDo();
            }

        }

    }



}
