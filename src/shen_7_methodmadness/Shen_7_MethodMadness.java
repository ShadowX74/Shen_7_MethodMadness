package shen_7_methodmadness;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Shen_7_MethodMadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Fractals");
        Group root = new Group();
        Canvas canvas = new Canvas(600, 600);
//      drawBCircle(gc, 25, 66, 13, 14);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawSTriangle(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void drawBCircle(GraphicsContext circ, int x, int y, int w, int h) {
        circ.setFill(Color.CRIMSON);
        circ.fillRect(x, y, w, h);
    }
    public static final int SIZE = 600;
    private void drawSTriangle(GraphicsContext tri) {
//        for (int i=1; i<input; i++){
//            Random rand = new Random();
//            int point1 = rand.nextInt(600);
//            int point2 = rand.nextInt(600);
//            double [] xPoints = {point1, rand.nextInt(600), rand.nextInt(600)};
//            double [] yPoints = {point2, rand.nextInt(600), rand.nextInt(600)};
//            tri.setFill(Color.CRIMSON);
//            tri.fillRect(x, y, w, h);
//            tri.fillPolygon(xPoints, yPoints, 3);
//        }
        Scanner console = new Scanner(System.in);
        System.out.print("What level do you want? ");
        int level = console.nextInt();
        int triangleHeight = (int) Math.round(SIZE * Math.sqrt(3.0) / 2.0);
        double [] xPoints = {0, SIZE / 2, SIZE};
        double [] yPoints = {triangleHeight, 0, triangleHeight};
        tri.fillPolygon(xPoints, yPoints, 3);
        if (level >= 2) {
            double [] p1 = {0, triangleHeight};
            double [] p2 = {SIZE / 2, 0};
            double [] p3 = {SIZE, triangleHeight};
            double [] p4 = {SIZE/4, triangleHeight/2};
            double [] p5 = {(SIZE/2+SIZE)/2, triangleHeight/2};
            double [] p6 = {SIZE/2, triangleHeight};
            double [] xPoints1 = {p1[0], p4[0], p6[0]};
            double [] yPoints1 = {p1[1], p4[1], p6[1]};
            double [] xPoints2 = {p4[0], p2[0], p5[0]};
            double [] yPoints2 = {p4[1], p2[1], p5[1]};
            double [] xPoints3 = {p6[0], p5[0], p3[0]};
            double [] yPoints3 = {p6[1], p5[1], p3[1]};
            // recurse on 3 triangular areas
            tri.fillPolygon(xPoints1, yPoints1, 3);
            tri.fillPolygon(xPoints2, yPoints2, 3);
            tri.fillPolygon(xPoints3, yPoints3, 3);
        }
    }

    /*fractal examples:
    https://courses.cs.washington.edu/courses/cse143/11sp/lectures/Sierpinski.java
    http://www.netgraphics.sk/bresenham-algorithm-for-a-circle
    */
}