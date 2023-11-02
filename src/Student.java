import java.time.LocalDate;

public class Student {
    String name;
    LocalDate age;
    String group;


    public Student(String name, LocalDate age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}
