
class 02-09-2026 {
    String studentName;
    static String collegeName = "KIET";
    int rollNo;
    int age;

    Student(String name, int roll, int age) {
        this.studentName = name;
        this.rollNo = roll;
        this.age = age;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name : " + studentName);
        System.out.println("College Name : " + collegeName);
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Age          : " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        // Age validation
        if (age >= 18 && age <= 60) {
            Student student = new Student(name, roll, age);
            student.display();
        } else {
            System.out.println("Invalid age! Age must be between 18 and 60.");
        }

        sc.close();
    }
}

//write a program to display the updated account balance after wothdrawing 5000 rupess 