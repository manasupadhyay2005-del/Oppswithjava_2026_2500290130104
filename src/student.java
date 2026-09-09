public class student {
    String name;
    int rollno;

    void display() {
        System.out.println(name + " - " + rollno);
    }

    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "manas";
        s1.rollno = 101;

        student s2 = new student();
        s2.name = "kamakshu";
        s2.rollno = 102;
        
        student s3 = new student();
        s3.name = "vartika";
        s3.rollno = 103;
        
        student s4 = new student();
        s4.name = "bajrangi";
        s4.rollno = 104;

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
