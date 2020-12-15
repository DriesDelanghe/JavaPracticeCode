package Week1.Les2;

public class StudentTest {
    public static void main(String[] args) {
        //ctrl + p for parameter list
        Student student1 = new Student("Van Goethem", "Anne", "2820");
        Student student2 = new Student("Janssens", "Peter", "3000");

        //ToString function needed when printing out an object
        System.out.println(student1);
        System.out.println(student2);
    }
}
