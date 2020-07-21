public class Ninja extends Human {

    public Ninja(){
        this.stealth = 10;
    }

    public void steal(Human otherHuman) {
        //  Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
        this.health += this.stealth;
        otherHuman.health -= this.stealth;
    }

    public void runAway() {
        this.health -= 10;
    }
}