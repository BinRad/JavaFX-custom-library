package Project1;

public interface MyShapePositionInterface extends MyPositionInterface{
    MyRectangle getMyBoundingBox();
    //Returns a MyRectangle
    //that is the same width
    //and the height as the
    //object and in the same
    //position. It returns a
    //bounding rectangle of the
    //object.

    boolean doOverlap(MyShape O);
    //Returns true if the the
    //object it was called with
    //and the object passed into
    //the method are overlapping
    //otherwise it will return
    //false.
}