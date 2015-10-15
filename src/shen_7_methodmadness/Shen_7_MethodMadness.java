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
        GraphicsContext gc = canvas.getGraphicsContext2D();
//        drawBCircle(gc, 25, 66, 13, 14);
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
//        double [] xPoints = {0, SIZE / 2, SIZE};
//        double [] yPoints = {triangleHeight, 0, triangleHeight};
//        tri.fillPolygon(xPoints, yPoints, 3);
        int p1 = new Point(0, triangleHeight);
        int p2 = new Point(SIZE / 2, 0);
        int p3 = new Point(SIZE, triangleHeight);
        drawFigure(level, g, p1, p2, p3);
    }
    /*fractal examples:
    https://courses.cs.washington.edu/courses/cse143/11sp/lectures/Sierpinski.java
    http://www.netgraphics.sk/bresenham-algorithm-for-a-circle
    */
}