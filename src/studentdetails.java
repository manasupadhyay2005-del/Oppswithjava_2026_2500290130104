//wap to creat a java program .these deatils are collage name , student name ,  student roll no.

// public class studentdetails {
//     static String clgname = "KIET";
//     String Sname;
//     int rollno;
//     public studentdetails(String s , int r)
//     {
//         this.Sname = s;
//         this.rollno = r;

//     }
//     public void display(){
//         System.out.print("Student:" + Sname + "Student rollno.:"+rollno + "collage name:"+clgname);
//     }
    
// }


public class studentdetails {

    static String clgname = "KIET";
    String Sname;
    int rollno;

    // Constructor
    public studentdetails(String s, int r) {
        this.Sname = s;
        this.rollno = r;
    }

    // Display method
    public void display() {
        System.out.println(
            "Student: " + Sname +
            "  Student Roll No.: " + rollno +
            "  College Name: " + clgname
        );
    }

    // Driver code
    public static void main(String[] args) {

        studentdetails s1 = new studentdetails("Manas", 101);
        studentdetails s2 = new studentdetails("Rahul", 102);

        s1.display();
        s2.display();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      