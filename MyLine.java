package Project1;
import javafx.scene.canvas.GraphicsContext;

import static java.lang.Math.abs;
import static java.lang.Math.atan;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyLine extends Project1.MyShape {
    private double x1, x2, y1, y2;
    // constructor method
    public MyLine(int w, int h){
        super(w, h);
        this.x1 = 0;
        this.x2 = w;
        this.y1 = 0;
        this.y2 = h;
    }
    public void setX1(int x1){
        this.x1 = x1;
    }
    public void setX2(int x2){
        this.x2 = x2;
    }
    public void setY1(int y1){
        this.y1 = y1;
    }
    public void setY2(int y2){
        this.y2 = y2;
    }
    @Override
    public MyRectangle getMyBoundingBox(){
        MyRectangle R = new MyRectangle((int) abs(x1-x2), (int)abs(y1-y2));
        R.setX((int) (x1+x2)/2);
        R.setY((int) (y1+y2)/2);
        return R;
    }
    public String toString(){
        double length = sqrt(pow((x2-x1), 2) + pow((y2 - y1), 2));
        double angle  = atan((y2 - y1)/(x2-x1));
        return "length: " + length + "  angle: " + angle;
    }
    public void draw(GraphicsContext gc, boolean o){
        gc.strokeLine(x1,y1,x2,y2);
    }
}