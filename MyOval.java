package Project1;
import javafx.scene.canvas.GraphicsContext;
import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

public class MyOval extends MyShape {
    private double w, h;
    public MyOval(int w, int h){
        super(w, h);
        this.w = w;
        this.h = h;
    }
    public Double getPerimeter(){
        return PI*((3*(w+h)/2)-(sqrt(((3*w)+h)*(w+(3*h))/4)));
    }
    public Double getArea(){
        return w*h*PI/4;
    }
    @Override
    public String toString(){
        return "Vertical Axes: " + h/2 + "  Horizontal Axes: " + w/2 + "  Perimeter: " + this.getPerimeter() + "  Area:" + this.getArea();
    }
    public MyRectangle getMyBoundingBox(){
        MyRectangle R = new MyRectangle((int) w,(int) h);
        R.setX(this.getX());
        R.setY(this.getY());
        return R;
    }
    public void draw(GraphicsContext gc, boolean o) {
        if (o) {
            gc.strokeOval(getX()-w/2,getY()-h/2, w, h);
        } else {
            gc.fillOval(getX()-w/2,getY()-h/2, w, h);
        }
    }
}