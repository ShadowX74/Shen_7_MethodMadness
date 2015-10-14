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
import java.util.Scanner;

public class Shen_7_MethodMadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer 1-10");
        int usernum = reader.nextInt();
        Scene scene = new Scene(root, 800, 600, Color.AQUA);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /*fractal examples:
    https://courses.cs.washington.edu/courses/cse143/11sp/lectures/Sierpinski.java
    http://www.netgraphics.sk/bresenham-algorithm-for-a-circle
    */
}