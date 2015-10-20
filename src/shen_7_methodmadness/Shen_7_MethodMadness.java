package shen_7_methodmadness;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Shen_7_MethodMadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Method Madness");
        Group root = new Group();
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Scanner console = new Scanner(System.in);
        System.out.print("What level do you want? ");
        int level = console.nextInt();
        drawSTriangle1(gc, level);
        if (level >= 2) {
            drawSTriangle2(gc);
        }
        drawCircleInside(gc);
        drawLeftHorn(gc);
        drawRightHorn(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void drawCircleInside(GraphicsContext circ) {
        circ.setFill(Color.DARKVIOLET);
        circ.fillOval(213, 260, 174, 174);
    }
    public static final int SIZE = 600;
    public static final int triangleHeight = (int) Math.round(SIZE * Math.sqrt(3.0) / 2.0);
    private void drawSTriangle1(GraphicsContext tri, int i) {
        tri.setFill(Color.BLACK);
        tri.setStroke(Color.BLACK);
        double [] xPoints = {0, SIZE/2, SIZE};
        double [] yPoints = {triangleHeight, 0, triangleHeight};
        if (fillOrStroke(i)) {
            tri.fillPolygon(xPoints, yPoints, 3);
        }
        tri.strokePolygon(xPoints, yPoints, 3);
    }
    private void drawSTriangle2(GraphicsContext tri) {
        tri.setFill(Color.BLACK);
        double [] xPoints1 = {0, SIZE/4, SIZE/2};
        double [] yPoints1 = {triangleHeight, triangleHeight/2, triangleHeight};
        double [] xPoints2 = {SIZE/4, SIZE/2, (SIZE/2+SIZE)/2};
        double [] yPoints2 = {triangleHeight/2, 0, triangleHeight/2};
        double [] xPoints3 = {SIZE/2, (SIZE/2+SIZE)/2, SIZE};
        double [] yPoints3 = {triangleHeight, triangleHeight/2, triangleHeight};
        // recurse on 3 triangular areas
        tri.fillPolygon(xPoints1, yPoints1, 3);
        tri.fillPolygon(xPoints2, yPoints2, 3);
        tri.fillPolygon(xPoints3, yPoints3, 3);
        }
    private void drawLeftHorn(GraphicsContext gc) {
        gc.setFill(Color.RED);
        double [] xPoints = {0, SIZE/3-4, SIZE/4};
        double [] yPoints = {0, triangleHeight/4+50, triangleHeight/2};
        gc.fillPolygon(xPoints, yPoints, 3);
        }
    private void drawRightHorn(GraphicsContext gc) {
        gc.setFill(Color.RED);
        double [] xPoints = {600, SIZE/3*2+4, SIZE/4*3};
        double [] yPoints = {0, triangleHeight/4+50, triangleHeight/2};
        gc.fillPolygon(xPoints, yPoints, 3);
    }
    private boolean fillOrStroke(int level) {
        return (level == 1);
    }
}

    /*fractal examples:
    https://courses.cs.washington.edu/courses/cse143/11sp/lectures/Sierpinski.java
    http://www.netgraphics.sk/bresenham-algorithm-for-a-circle
    */
    /* Extra code:
        for (int i=1; i<input; i++){
            Random rand = new Random();
            int point1 = rand.nextInt(600);
            int point2 = rand.nextInt(600);
            double [] xPoints = {point1, rand.nextInt(600), rand.nextInt(600)};
            double [] yPoints = {point2, rand.nextInt(600), rand.nextInt(600)};
            tri.setFill(Color.CRIMSON);
            tri.fillRect(x, y, w, h);
            tri.fillPolygon(xPoints, yPoints, 3);
        }
    */
