public class Gorilla extends Mammal {

    public Gorilla(int energyLevel){
        super(energyLevel);
    }

    public void throwSomething() {
        System.out.println("Whoosh!");
        energyLevel -= 5;
    }
  
    public void eatBananas() {
        System.out.println("Nom Nom!");
        energyLevel += 10;
    }
  
    public void climb() {
        System.out.println("Step Step!");
        energyLevel -= 10;
    }
}

