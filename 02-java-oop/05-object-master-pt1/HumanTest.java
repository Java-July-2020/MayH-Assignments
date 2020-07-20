public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        System.out.println("Human1 Health: " + human1.health);
        System.out.println("Human2 Health: " + human2.health);
        human1.attack(human2);
        System.out.println("Human1 Health: " + human1.health);
        System.out.println("Human2 Health: " + human2.health);
    }
}