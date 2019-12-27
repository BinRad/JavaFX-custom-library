//package Project1;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.shape.ArcType;
//import java.util.HashMap;
//import static java.lang.Math.PI;
//import static java.lang.Math.cos;
//import static java.lang.Math.sin;
//
//public class PieChart {
//    private double n, w, h, x, y;
//    HashMap data = new HashMap(); //holds probabilities of each event of n total events
//    public PieChart(int w, int h, HashMap<String, Double> data){
//        this.w = w;
//        this.h = h;
//        this.data = data;
//    }
//    public PieChart(int w, int h){
//        this.w = w;
//        this.h = h;
//    }
//    public void setX(double X){
//        this.x = X;
//    }
//    public void setY(double Y){
//        y = Y;
//    }
//    public double getX(){
//        return x;
//    }
//    public double getY(){
//        return y;
//    }
//    public String toString(String key){
//        return data.get(key).toString();
//    }
//    public void setN(double N){
//        n = N;
//    }
//    public double getN(){
//        return n;
//    }
//    public void setData(HashMap data){
//        this.data = data;
//    }
//    public HashMap getData(){
//        return data;
//    }
//    public Object[] sortData(){
//            for()
//    }
//    public static void setColor(GraphicsContext gc, double i){
//        double q = 0;
//        for(MyColor COL : MyColor.values()) {
//            if (q == i) {
//                gc.setFill(COL.paint());
//                return;
//            }
//            q++;
//        }
//    }
//    public void draw(GraphicsContext gc){
//        double currentAngle = 0;
//        MyCircle c = new MyCircle((int) w, (int) h);
//        c.setX((int) x);
//        c.setY((int) y);
//        c.setRadius(w/2);
//        MyShape.setColor(gc, MyColor.BLUE);
//        Object[] arr = sortData();
//        for(double i = 0; i< n; i++){
//            String key = arr[(int) n].toString();
//            double arcExtent = (double) data.get(key)*2*PI;
//            setColor(gc, i+1);
//            gc.strokeArc(x, y, w, h, arcExtent, currentAngle, ArcType.ROUND);
//            gc.strokeText(toString(key),x + (w * sin(currentAngle)), y + h*cos(currentAngle));
//            currentAngle = currentAngle + arcExtent;
//
//        }
//    }
//
//}
