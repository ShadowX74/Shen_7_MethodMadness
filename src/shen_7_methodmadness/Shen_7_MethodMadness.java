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
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBCircle(gc, 25, 66, 13, 14);
        drawStriangle(gc, 25, 66, 13, 14);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void drawBCircle(GraphicsContext circ, int x, int y, int w, int h) {
        circ.setFill(Color.CRIMSON);
        circ.fillRect(x, y, w, h);
    }
    private void drawStriangle(GraphicsContext tri, int x, int y, int w, int h) {
        Random rand = new Random();
        int xPoints = rand.nextInt(400);
        int yPoints = rand.nextInt(400);
        tri.setFill(Color.CRIMSON);
        tri.fillRect(x, y, w, h);
        tri.fillPolygon(xPoints, yPoints, 3);
    }
    /*fractal examples:
    https://courses.cs.washington.edu/courses/cse143/11sp/lectures/Sierpinski.java
    http://www.netgraphics.sk/bresenham-algorithm-for-a-circle
    */
}