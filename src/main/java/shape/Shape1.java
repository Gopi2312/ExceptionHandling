package shape;
import java.util.logging.*;
import java.util.*;
public class Shape1 
{
    float height;
    float width;
    float base;
    float side1;
    float side2;
    float radius;
    int x;
    boolean b = true;
    Scanner sc = new Scanner(System.in);
    Logger log = Logger.getLogger("hi");

    Shape1() {
        while (b) {
            log.info("1.Circle\n2.Rectangle\n3.Triangle\n4.Exit\nEnter your option 1 or 2 or 3 or 4: ");
            x = sc.nextInt();
            try
            {
                if (x == 1) {
                    log.info("Enter Circle Radius:");
                    radius = sc.nextFloat();
                } else if (x == 2) {
                    log.info("Enter Rectangle Height:");
                    height = sc.nextFloat();
                    log.info("Enter Rectangle Width:");
                    width = sc.nextFloat();
                } else if (x == 3) {
                    log.info("Enter Triangle base: ");
                    base = sc.nextFloat();
                    log.info("Enter Triangle side1: ");
                    side1 = sc.nextFloat();
                    log.info("Enter Triangle Side2: ");
                    side2 = sc.nextFloat();
                }
            }
            catch(InputMismatchException e)
            	{
            		System.exit(0);
            		log.info(String.valueOf(e));
            	}
            perimeter();
            area();
        }
    }

    void perimeter() {
        if (x == 1) {
            float cirPer = (float) (2 * 3.14 * radius);
            log.fine("Perimeter of circle: {}" , cirPer);
        } else if (x == 2) {
            float recPer = 2 * (height + width);
            log.fine("Perimeter of Rectangle: {}" , recPer);
        } else if (x == 3) {
            float triPer = base + side1 + side2;
            log.fine("Perimeter of Triangle: {}" , triPer);
        } else {
            b = false;
            System.exit(0);
        }
    }

    void area() {
        if (x == 1) {
            float cirPer = (float) (3.14 * radius * radius);
            log.fine("area of circle: {}" , cirPer);
        } else if (x == 2) {
            float recPer = height * width;
            log.fine("area of Rectangle: {}" , recPer);
        } else if (x == 3) {
            float triPer = 1.0 / 2.0 * (base * side1);
            log.fine("Perimeter of Triangle: {}" , triPer);
        } else {
            b = false;
            System.exit(0);
        }
    }
    public static void main( String[] args )
    {
    	Shape1 sp = new Shape1();
        sp.perimeter();
    	sp.area();
    }
}
