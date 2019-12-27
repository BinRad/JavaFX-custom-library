package Project1;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import java.awt.Point;
import java.lang.Object;
import static java.lang.Math.sqrt;

public abstract class MyShape extends Object implements MyShapePositionInterface{
    private int w, h;
    public MyShape(int w, int h){
      this.w = w;
      this.h = h;
    }
    private int x, y;
    public void setX(int X){ x = X; }
    public void setY(int Y){
        y = Y;
    }
    public static void setColor(GraphicsContext gc, MyColor O){
        gc.setFill(O.paint());
        gc.setStroke(O.paint());
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Paint getColor(GraphicsContext gc){
                return gc.getFill();
    }
    @Override
    public String toString(){
        String s = "no object specified";
        return s;
    }
    public abstract void draw(GraphicsContext gc, boolean o);
    public Point getPoint(){
        Point P = new Point(getX(), getY());
        return P;
    }
    public void moveTo(double dx, double dy){
        x += dx;
        y += dy;
    }
    public double distanceTo(int a, int b){
        return sqrt(((x-a)*(x-a))+((y-b)*(y-b)));
    }
    public abstract MyRectangle getMyBoundingBox();
    public boolean doOverlap(MyShape O) {
        MyRectangle M = getMyBoundingBox();
        MyRectangle R = O.getMyBoundingBox();
        if (M.getMaxPoint().x <= R.getMinPoint().x) {
            return false;
        } else {
            if (M.getMinPoint().x >= R.getMaxPoint().x) {
                return false;
            } else {
                if (M.getMaxPoint().y <= R.getMinPoint().y) {
                    return false;
                } else {
                    if (M.getMinPoint().y >= R.getMaxPoint().y) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }
}