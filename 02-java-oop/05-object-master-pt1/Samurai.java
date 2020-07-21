public class Samurai extends Human {
    
    private static int samuraiCount;
    
    public Samurai(){
        this.health = 200;
        samuraiCount++;
    }


    public void deathBlow(Human otherHuman){
        otherHuman.health = 0;
        this.health /= 2;
    }

    public void meditate(Human otherHuman){
        this.health *= 2;
    }

    public int howMany(){
        return samuraiCount;
    }
}