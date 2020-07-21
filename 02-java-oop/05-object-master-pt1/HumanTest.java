public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Ninja ninja = new Ninja();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();
        Samurai samurai3 = new Samurai();
        Wizard wizard = new Wizard();
        System.out.println("Human1 Health: " + human1.health);
        System.out.println("Human2 Health: " + human2.health);
        human1.attack(human2);
        System.out.println("Human1 Health: " + human1.health);
        System.out.println("Human2 Health: " + human2.health);
        ninja.steal(human1);
        System.out.println("Ninja Health: " + ninja.health);
        System.out.println("Samurai Count: " + samurai1.howMany());
        wizard.heal(human1);
        System.out.println("Human1 Health: " + human1.health);
    }
}