package creatures;

public abstract class Animal implements Feedable {
    private final String species;
    private double weight;
    public String name;

    public Animal(String species) {
        this.species = species;

        if (species.equals("dog")) {
            this.weight = 5;
        } else if (species.equals("cat")) {
            this.weight = 3;
        } else if (species.equals("parrot")) {
            this.weight = 0.5;
        } else {
            this.weight = 1;
        }
    }

    public void feed(){
        if (this.weight > 0) {

            this.weight += 1.1;
            System.out.println("thx for food " + this.weight);
        }
        else {
            System.out.println(" teraz to troche pozno ");
        }
    }


    public void feed(double foodWeight){
        if (this.weight > 0) {

            this.weight -= 0.5;
            System.out.println("thx, nice walk " + this.weight);
        }
        else {
            System.out.println("nie zyje");
        }
    }

    public void takeForAWalk(){
        if (this.weight > 0) {

            this.weight -= 0.5;
            System.out.println("thx, nice walk " + this.weight);
        }
        else {
            System.out.println("nie zyje");
        }
    }


}
