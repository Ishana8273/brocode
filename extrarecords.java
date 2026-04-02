abstract sealed class Person permits Employee, Student {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void getRole();
}

final class Employee extends Person {

    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void getRole() {
        System.out.println(name + " is an Employee with salary " + salary);
    }
}

final class Student extends Person {

    private String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    @Override
    public void getRole() {
        System.out.println(name + " is a Student studying " + course);
    }
}

public class extrarecords {

    public static void main(String[] args) {

        Person p1 = new Employee("Rahul", 50000);
        Person p2 = new Student("Anita", "Computer Science");

        p1.getRole();
        p2.getRole();
    }
}