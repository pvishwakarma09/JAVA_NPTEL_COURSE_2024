/* Modify the code segment to print the following output.
-----------------OUTPUT------------------- (this line should not be printed)
Circle: This is Shape1

Circle: This is Shape2
------------------------------------------------- (this line should not be printed)
 */

// Interface ShapeX is created
interface ShapeX {

    public String base = "This is Shape1";

    public void display1();
}

// Interface ShapeY is created which extends ShapeX
interface ShapeY extends ShapeX {

    public String base = "This is Shape2";

    public void display2();
}

// Class ShapeG is created which implements ShapeY
class ShapeG implements ShapeY {

    public String base = "This is Shape3";
    //Overriding method in ShapeX interface

    public void display1() {
        System.out.println("Circle: " + ShapeX.base);
    }
    // Overriding method in ShapeY interface

    public void display2() {
        System.out.print("Circle: " + ShapeY.base);
    }
}
// Main class Question 

public class W08_A3 {

    public static void main(String[] args) {
        //Object of class shapeG is created and display methods are called.
        ShapeG circle = new ShapeG();
        circle.display1();
        circle.display2();
    }
}
