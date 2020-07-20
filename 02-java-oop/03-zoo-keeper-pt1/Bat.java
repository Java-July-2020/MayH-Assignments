public class Bat extends Mammal {
    
    public Bat(int energyLevel){
        super(energyLevel);
    }

    public void fly() {
        System.out.println("Flap Flap!");
        energyLevel -= 50;
    }
  
    public void eatHumans() {
        energyLevel += 25;
    }
  
    public void attackTown() {
        System.out.println("Help Help!");
        energyLevel -= 10;
    }
}