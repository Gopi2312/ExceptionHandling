package assignment.student1;
import java.util.logging.*;
import java.util.*;
public class Student1 
{
    String name;
    char gradelevel;
    float gpa;
    Scanner sc = new Scanner(System.in);
    Logger log = Logger.getLogger("hi");

    Student1() {
        try{
            log.info("Enter Name: ");
            name = sc.nextLine();
            log.info("Enter Grade_Level:");
            gradelevel = sc.next().charAt(0);
            log.info("Enter GPA upto 10:");
            gpa = sc.nextFloat();
        }
        catch(InputMismatchException e)
        {
            log.info(e);
        }
    }

    void update() {
        log.info("You want to Update Your GPA\n1.Yes\n2.No\nEnter 1 or 2: ");
        int x = sc.nextInt();
        if (x == 1) {
            log.info("Enter Updated GPA upto 10: ");
            float updategpa= sc.nextFloat();
            gpa = updategpa;
        }
    }

    void profile() {
        if (gpa <= 10) {
            log.fine("{} has a  {} GPA",name,gpa);
        } else {
            log.info("Enter valid GPA");
        }
    }
    public static void main( String[] args )
    {
    	Student1 std = new Student1();
        std.update();
        std.profile();
    }
}
