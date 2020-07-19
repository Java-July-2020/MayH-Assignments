public class ProjectTest {
    public static void main(String[] args) {
        Project person1 = new Project();
        Project person2 = new Project();
        person1.setName("Bob");
        person1.setDescription("The Builder");
        String person1Name = person1.getName();
        String person1Description = person1.getDescription();
        person2.setName("Sid");
        person2.setDescription("The Science Kid");;
        String person2Name = person2.getName();
        String person2Description = person2.getDescription();
    }
}