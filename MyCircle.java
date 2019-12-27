package Project1;
import javafx.scene.canvas.GraphicsContext;
import static java.lang.Math.PI;

public class MyCircle extends MyOval {
    private double radius;
    private int w,h;
    public MyCircle(int w, int h) {
        super((w+h)/2, (w+h)/2);
        radius = (w+h)/4;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
        w = (int) (radius*2);
        h = (int) (radius*2);
    }
    @Override
    public Double getPerimeter() {
        return (2 * PI * radius);
    }
    public Double getArea(){
        return PI*radius*radius;
    }
    public String toString(){
        return "Radius: " + radius + "  Perimeter: " + getPerimeter() + "  Area: " + getArea();
    }
    public MyRectangle getMyBoundingBox(){
        MyRectangle R = new MyRectangle((int) radius*2,(int) radius*2);
        R.setX(this.getX());
        R.setY(this.getY());
        return R;
    }
    public void draw(GraphicsContext gc, boolean o){
        if(o){
            gc.strokeOval(getX()-radius,getY()-radius,radius*2,radius*2);
        }
        else {
            gc.fillOval(getX()-radius,getY()-radius, radius*2, radius*2);
        }
    }
}