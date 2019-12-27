package Project1;
import javafx.scene.canvas.GraphicsContext;

import java.awt.Point;

public class MyRectangle extends MyShape {
    private int w,h;
    public MyRectangle(int w, int h){
        super(w, h);
        this.w = w;
        this.h = h;
    }
    public Point getMaxPoint(){
        Point P = new Point(getX()+w/2,getY()+h/2);
        return P;
    }
    public Point getMinPoint(){
        Point P = new Point(getX()-w/2,getY()-h/2);
        return P;
    }
    @Override
    public String toString(){
        int P, A;
        P = w + w + h + h;
        A = w*h;
        return "Width: " + w + "  Height: " + h + "  Perimeter: " + P + "  Area:" + A;
    }
    public MyRectangle getMyBoundingBox(){
        MyRectangle R = new MyRectangle(w, h);
        R.setX(this.getX());
        R.setY(this.getY());
        return R;
    }
    public void draw(GraphicsContext gc, boolean o){
        if(o){
            gc.strokeRect(getX()-w/2,getY()-h/2,w,h);
        }
        else {
            gc.fillRect(getX()-w/2,getY()-h/2, w, h);
        }
    }
}