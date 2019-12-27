package Project1;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.sql.Connection;

import static java.lang.Math.PI;
import static java.lang.Math.tan;

//public class Main extends Application {
//    public static final int w = 600, h = 600;
//    private Canvas canvas;


//    public static void main(String[] args) {
//        launch(args);
//    }
//    public void start(Stage stage) {
//        DatabaseModification db = new DatabaseModification();
//        BorderPane root = new BorderPane();
//        canvas = new Canvas(w, h);
//        Label lab = new Label("Enter N: ");
//        TextField input = new TextField("3");
//        Button enter = new Button("enter");
//        FlowPane pane = new FlowPane(lab, input, enter);
//        pane.setHgap(20);
//        pane.setVgap(20);
//        root.setTop(pane);
//        Scene scene = new Scene(root,w,h);
//        stage.setScene(scene);//sets the scene on the stage that is using the root with the canvas elements
//        stage.show();// tells java to show the stage in the application with all of the things that we put in it]
//        enter.setOnAction(action -> {
//            //after button press create new canvas
//            root.getChildren().remove(canvas);
//            canvas = new Canvas(w,h);
//            GraphicsContext gc = canvas.getGraphicsContext2D();
//            root.setCenter(canvas);
//
//            String n = input.getText().trim();
//            //if(Integer.parseInt(n) != 0) {
//                PieChart P = new PieChart(w/2, h/2);
//                P.setX(w/2);
//                P.setY(h/2);
//                HistogramAlphaBet H = new HistogramAlphaBet();
//                H.count(P);
//                P.setN(Integer.parseInt(n));
//                P.draw(gc);
//           // }
//        });
//
//    }
//}


    public class Main extends Application {
        public static final int w = 600, h = 600;
        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage stage) {
            Group root = new Group();
            Canvas canvas = new Canvas(w, h);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            PieChart P = new PieChart(w / 2, h / 2);
            P.setX(w / 2);
            P.setY(h / 2);
//        P.addEntry("first", 0.15);
//        P.addEntry("second", 0.03);
//        P.addEntry("third", 0.09);
//        P.addEntry("fourth", 0.15);
//        P.addEntry("fifth", 0.104567);
//        P.addEntry("sixth", 0.1);
//        P.addEntry("seventh", 0.003);
//        P.addEntry("eighth", 0.03);
//        P.addEntry("ninth", 0.03);
//        P.addEntry("tenth", 0.01);
            HistogramAlphaBet H = new HistogramAlphaBet();
            H.count(P);

            P.setN(8);
            P.draw(gc);

            //display canvas / scene / stage
            root.getChildren().add(canvas); //adds the canvas to the root group
            stage.setScene(new Scene(root));//sets the scene on the stage that is using the root with the canvas elements
            stage.show();// tells java to show the stage in the application with all of the things that we put in it
        }
    }





















//
//        //Circle 1
//        double r = h/2-15;
//        MyCircle C1 = new MyCircle(w/2,h/2);
//        C1.setRadius(r);
//        C1.setColor(gc, MyColor.PUPLRE);
//        C1.setX(w/2);
//        C1.setY(h/2);
//        C1.draw(gc, false);
//        C1.getMyBoundingBox().draw(gc, true);
//        System.out.println(C1.toString());
//
//        //Polygon 1
//        MyPolygon P1 = new MyPolygon(w,h);
//        P1.setN(9);
//        P1.setL(r);
//        MyShape.setColor(gc, MyColor.YELLOW);
//        P1.setX(w/2);
//        P1.setY(h/2);
//        P1.draw(gc, false);
//        P1.setColor(gc, MyColor.PUPLRE);
//        P1.getMyBoundingBox().draw(gc, true);
//
//        //Circle 2
//        r =  (2*r/(3.4*tan(PI/5)));
//        MyCircle C2 = new MyCircle(0,0);
//        C2.setRadius(r);
//        C2.setColor(gc, MyColor.GREEN);
//        C2.setX(w/2);
//        C2.setY(h/2);
//        C2.draw(gc, false);
//
//        //Polygon 2
//        MyPolygon P2 = new MyPolygon(w,h);
//        P2.setN(5);
//        P2.setL(r);
//        P2.setColor(gc, MyColor.RED);
//        P2.setX(w/2);
//        P2.setY(h/2);
//        P2.draw(gc, false);
//
//        //Circle 3
//        r =  (r*2/(3.4*tan(PI/5)));
//        MyCircle C3 = new MyCircle(0,0);
//        C3.setRadius(r);
//        C3.setColor(gc, MyColor.BLUE);
//        C3.setX(w/2);
//        C3.setY(h/2);
//        C3.draw(gc, false);
//
//        //Polygon 3
//        MyPolygon P3 = new MyPolygon(w,h);
//        P3.setN(5);
//        P3.setL(r);
//        P3.setColor(gc, MyColor.BROWN);
//        P3.setX(w/2);
//        P3.setY(h/2);
//        P3.draw(gc, false);
//
//        //Circle 4
//        r =  (r*2/(3.4*tan(PI/5)));
//        MyCircle C4 = new MyCircle(0,0);
//        C4.setRadius(r);
//        C4.setColor(gc, MyColor.WHITE);
//        C4.setX(w/2);
//        C4.setY(h/2);
//        C4.draw(gc, false);
//
//        //Line 1
//        MyLine L1 = new MyLine(w,h);
//        L1.setColor(gc, MyColor.BLACK);
//        L1.draw(gc, true);
//
//        //Line 2
//        MyLine L2 = new MyLine(w,h);
//        L2.setColor(gc, MyColor.BLACK);
//        L2.setX1(0);
//        L2.setX2(w);
//        L2.setY1(h);
//        L2.setY2(0);
//        L2.draw(gc, true);
//        L2.getMyBoundingBox().draw(gc, true);