public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Student student = new Student("Prince", 20);
        student.introduce();
    }
}
