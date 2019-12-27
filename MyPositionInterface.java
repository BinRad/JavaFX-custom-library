package Project1;
import java.awt.Point;

public interface MyPositionInterface {
    Point getPoint();
    // gets the point x, y which in
    // our MyShape class hierarchy
    //is the middle of the shape
    // it will return it as a
    //point which is a pair of integers

    void moveTo(double dx, double dy);
    //Move the object from the
    //the point x ,y to the point
    //(x + dx), (y + dy)
    //it moves the object
    //by dx in the X direction
    //and by dy in the Y direction

    double distanceTo(int a, int b);
    // this returns the distance to
    // the point x, y which is stored
    // in our class. In our MyShape
    // class x, y is the center of
    // the shape.
}
