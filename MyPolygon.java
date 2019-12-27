package Project1;
import javafx.scene.canvas.GraphicsContext;

import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class MyPolygon extends MyShape {
    private double N, L;
    double w ,h;
    public MyPolygon(int w, int h) {
        super(w, h);
        this.w = w;
        this.h = h;
        this.L = h;
    }
    public void setN(double sides){
        N = sides;
    }
    public void setL(double l) {
        L = l;
    }
    private double[] getxPoints(){
        double[] xPoints = new double[(int) N];
        for(int i = 0; i < N; i++){
            xPoints[i] = L*cos((-PI/2) - i*2*PI/N) + getX();
        }
        return xPoints;
    }
    private double[] getyPoints(){
        double[] yPoints = new double[(int) N];
        for(int i = 0; i  < N; i++){
            yPoints[i] = L*sin((3*PI/2) + i*2*PI/N) + getY();
        }
        return yPoints;
    }
    private double getboundX(){
        double minX, maxX;
        maxX= 0;
        minX = L*cos((-PI/2) - 2*PI/N) + getX();
        for(int i = 0; i < N; i++){
            double temp;
             temp = L*cos((3*PI/2) + i*2*PI/N) + getX();
            if(temp > maxX){
                maxX = temp;
            }
            if(temp < minX){
                minX = temp;
            }
        }
        return (maxX-minX);
    }
    private double getboundY(){
        double minY, maxY;
        maxY = 0;
        minY =  abs(100*L*sin((3*PI/2)+2*PI/N) + getY());
        for(int i = 0; i  < N; i++) {
            double temp;
            temp = abs(L*sin((3*PI/2)+ i*2*PI/N)+getY());
            if (temp > maxY) {
                maxY = temp;
            }
            if (temp < minY) {
                minY = temp;
            }
        }
        return (maxY-minY);
    }
    @Override
    public String toString(){
        return "side length: " + L + "  interior angle (deg): " + (180-360/N) + "  perimeter: " +  L*N;
    }
    public MyRectangle getMyBoundingBox() {
        MyRectangle R = new MyRectangle((int)(getboundX()),(int) (getboundY()));
        R.setX(this.getX());
        if(N%2 != 0) {
            R.setY((int) (this.getY()+(sqrt(N)/(N-1))*((L/(2*tan((PI/N))))-(L/((2*sin(PI/N)))))));
        }
        else{
            R.setY(this.getY());
        }
        return R;
    }
    public void draw(GraphicsContext gc, boolean o){
        if (o) {
            gc.strokePolygon(getxPoints(), getyPoints(), (int) N);
        } else {
            gc.fillPolygon(getxPoints(), getyPoints(), (int) N);
        }
    }
}
