
class Student {
    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Chandana");
        s1.setRollNumber(101);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNumber());
    }
}
