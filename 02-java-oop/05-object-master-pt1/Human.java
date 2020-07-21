public class Human {
    int strength;
    int stealth;
    int intelligence;
    int health;

    public Human(){
        this(3, 3, 3, 100);
    }

    public Human(int strength, int stealth, int intelligence, int health){
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public void attack(Human otherHuman) {
        otherHuman.health -= strength;
    }

    public int getStrength() {
        return strength;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }
    
    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }
    
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
}