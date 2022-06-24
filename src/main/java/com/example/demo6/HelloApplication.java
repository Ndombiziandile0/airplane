package com.example.demo6;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    VBox root = new VBox();
    Duration dur_1 = Duration.millis(5000);
    Duration dur_2 = Duration.millis(7000);
    Duration dur_3 = Duration.millis(8000);
    Duration dur_4 = Duration.millis(10000);
    Duration dur_5 = Duration.millis(12000);
    Duration dur1 = Duration.millis(15000);
    Duration dur2 = Duration.millis(17000);
    Duration dur3 = Duration.millis(12000);
    Duration dur4 = Duration.millis(20000);
    TranslateTransition point_1 = new TranslateTransition(dur1);
    TranslateTransition point_2 = new TranslateTransition(dur2);
    TranslateTransition point_3 = new TranslateTransition(dur3);
    TranslateTransition point_4 = new TranslateTransition(dur4);
    TranslateTransition translate1 = new TranslateTransition(dur_1);
    TranslateTransition translate2 = new TranslateTransition(dur_2);
    TranslateTransition translate3 = new TranslateTransition(dur_3);
    TranslateTransition translate4 = new TranslateTransition(dur_4);
    TranslateTransition translate5 = new TranslateTransition(dur_5);
    SequentialTransition seq1;
    SequentialTransition seq2;
    SequentialTransition seq3;
    SequentialTransition seq4;
    SequentialTransition seqT1;
    SequentialTransition seqT2;
    SequentialTransition seqT3;
    SequentialTransition seqT4;
    SequentialTransition seqT5;
    Label Score;
    Label l;
    int points;
    Rectangle shape1 = new Rectangle(180,100);
    String src = getClass().getResource("/plane.png").toExternalForm();
    Image img = new Image(src);
    ImageView imageView = new ImageView(img);
    Rectangle shape2 = new Rectangle(35,20);
    String src1 = getClass().getResource("/coin.png").toExternalForm();
    Image coin1 = new Image(src1);
    Rectangle shape3 = new Rectangle(35,20);
    String src2 = getClass().getResource("/coin.png").toExternalForm();
    Image coin2 = new Image(src2);
    Rectangle shape4 = new Rectangle(35,20);
    String src3 = getClass().getResource("/coin.png").toExternalForm();
    Image coin3 = new Image(src3);
    Rectangle shape5 = new Rectangle(35,20);
    String src4 = getClass().getResource("/coin.png").toExternalForm();
    Image coin4 = new Image(src4);

    Rectangle shape_1 = new Rectangle(180,100);
    String src_1 = getClass().getResource("/cloud.png").toExternalForm();
    Image image1 = new Image(src_1);
    Rectangle shape_2 = new Rectangle(180,100);
    String src_2 = getClass().getResource("/cloud.png").toExternalForm();
    Image image2 = new Image(src_2);
    Rectangle shape_3 = new Rectangle(480,230);
    String src_3 = getClass().getResource("/cloud.png").toExternalForm();
    Image image3 = new Image(src_3);
    Rectangle shape_4 = new Rectangle(480,230);
    String src_4 = getClass().getResource("/cloud.png").toExternalForm();
    Image image4 = new Image(src_4);
    Rectangle shape_5 = new Rectangle(180,100);
    String src_5 = getClass().getResource("/cloud.png").toExternalForm();
    Image image5 = new Image(src_5);
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        shape_1.setFill(new ImagePattern(image1));
        shape_2.setFill(new ImagePattern(image2));
        shape_3.setFill(new ImagePattern(image3));
        shape_4.setFill(new ImagePattern(image4));
        shape_5.setFill(new ImagePattern(image5));
        shape2.setFill(new ImagePattern(coin1));
        shape3.setFill(new ImagePattern(coin2));
        shape4.setFill(new ImagePattern(coin3));
        shape5.setFill(new ImagePattern(coin4));
        point_1.setToY(1950f);
        point_1.setCycleCount(200);
        point_1.setAutoReverse(false);
        seq1 = new SequentialTransition (shape2, point_1);
        point_2.setToY(1950f);
        point_2.setCycleCount(200);
        point_2.setAutoReverse(false);
        seq2 = new SequentialTransition (shape3, point_2);
        point_3.setToY(1950f);
        point_3.setCycleCount(200);
        point_3.setAutoReverse(false);
        seq3 = new SequentialTransition (shape4, point_3);
        point_4.setToY(1950f);
        point_4.setCycleCount(200);
        point_4.setAutoReverse(false);
        seq4 = new SequentialTransition (shape5, point_4);
        translate1.setToX(-1950f);
        translate1.setCycleCount(200);
        translate1.setAutoReverse(false);
        seqT1 = new SequentialTransition (shape_1, translate1);
        translate2.setToX(-1950f);
        translate2.setCycleCount(200);
        translate2.setAutoReverse(false);
        seqT2 = new SequentialTransition (shape_2, translate2);
        translate3.setToX(-1950f);
        translate3.setCycleCount(200);
        translate3.setAutoReverse(false);
        seqT3 = new SequentialTransition (shape_3, translate3);
        translate4.setToX(-1950f);
        translate4.setCycleCount(200);
        translate4.setAutoReverse(false);
        seqT4 = new SequentialTransition (shape_4, translate4);
        translate5.setToX(-1950f);
        translate5.setCycleCount(200);
        translate5.setAutoReverse(false);
        seqT5 = new SequentialTransition (shape_5, translate5);
        final Group group = new Group(createInstructions(),createScore(),root,shape_2,shape_3,shape_4,shape2,shape3,shape4,shape5,pane);


        shape_1.setX(1400);
        shape_1.setY(50);
        shape_2.setX(1400);
        shape_2.setY(400);
        shape_3.setX(1400);
        shape_3.setY(800);
        shape_4.setX(1400);
        shape_4.setY(500);
        shape_5.setX(1400);
        shape_5.setY(100);


        shape2.setX(400);
        shape2.setY(-50);
        shape3.setX(600);
        shape3.setY(-50);
        shape4.setX(700);
        shape4.setY(-50);
        shape5.setX(850);
        shape5.setY(-50);
        final Scene scene = new Scene(group,1400, 700);
        ImageView plane = createPlain(scene);
        pane.getChildren().addAll(shape1,shape_1,shape_2,shape_3,shape_4,shape_5,Score);
        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            double x = shape1.getX();
            double y = shape1.getY();
            if(event.getCode()== KeyCode.UP){
                shape1.setY(y-10);
            }
            else if(event.getCode()==KeyCode.DOWN){
                shape1.setY(y+10);
            }
            else if(event.getCode()==KeyCode.RIGHT){
                shape1.setX(x+10);
            }
            else if(event.getCode()==KeyCode.LEFT){
                shape1.setX(x-10);
            }
            else if(event.getCode()==KeyCode.ENTER){
                Play();
            }
            if(event.getCode() == KeyCode.SPACE){
                seq1.pause();
                seq2.pause();
                seq3.pause();
                seq4.pause();
                seqT1.pause();
                seqT2.pause();
                seqT2.pause();
                seqT3.pause();
                seqT4.pause();
                seqT5.pause();
            }
        });
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void Play(){
        seq1.play();
        seq2.play();
        seq3.play();
        seq4.play();
        seqT1.play();
        seqT2.play();
        seqT2.play();
        seqT3.play();
        seqT4.play();
        seqT5.play();

    }
    public void Pause(){
        seq1.pause();
        seq2.pause();
        seq3.pause();
        seq4.pause();
        seqT1.pause();
        seqT2.pause();
        seqT2.pause();
        seqT3.pause();
        seqT4.pause();
        seqT5.pause();
    }
    private ImageView createPlain(Scene scene) {
        shape1.setFill(new ImagePattern(img));
        shape1.setX(100);
        shape1.setY(200);
        imageView.setFitWidth(130);
        imageView.setFitHeight(80);
        imageView.setY(scene.getHeight() - imageView.getFitHeight());
        return imageView;
    }
    private Label createInstructions() {
        l = new Label(
                "\n\tSELECT ENTER TO BEGIN\n\tPOINTS:"
        );
        l.setTextFill(Color.FORESTGREEN);
        l.setFont(Font.font("Arial", FontWeight.BOLD,20));
        return l;
    }
    private Label createScore() {
        points = 0;
        Score = new Label();
        Score.setText(points + "");
        Score.setLayoutX(200);
        Score.setLayoutY(47);
        root.getChildren().add(Score);
        Score.setTextFill(Color.FORESTGREEN);
        Score.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        shape1.translateXProperty().addListener(observable -> {
        });
        shape_1.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (shape1.getBoundsInParent().intersects(shape_1.getBoundsInParent())) {
                    String icon = getClass().getResource("/gameover.png").toExternalForm();
                    Image imageB = new Image(icon);
                    shape1.setFill(new ImagePattern(imageB));
                    Pause();
                    shape_1.setOpacity(0.1);
                } else if (shape1.getBoundsInParent().intersects(shape_2.getBoundsInParent())) {
                    String icon = getClass().getResource("/gameover.png").toExternalForm();
                    Image imageJet = new Image(icon);
                    shape1.setFill(new ImagePattern(imageJet));
                    Pause();
                    shape_2.setOpacity(0.1);
                } else if (shape1.getBoundsInParent().intersects(shape_3.getBoundsInParent())) {
                    String icon = getClass().getResource("/gameover.png").toExternalForm();
                    Image imageB = new Image(icon);
                    shape1.setFill(new ImagePattern(imageB));
                    Pause();
                    shape_3.setOpacity(0.1);
                } else if (shape1.getBoundsInParent().intersects(shape_4.getBoundsInParent())) {
                    String icon = getClass().getResource("/gameover.png").toExternalForm();
                    Image imageB = new Image(icon);
                    shape1.setFill(new ImagePattern(imageB));
                    Pause();
                    shape_4.setOpacity(0.1);
                } else if (shape1.getBoundsInParent().intersects(shape_5.getBoundsInParent())) {
                    String icon = getClass().getResource("/gameover.png").toExternalForm();
                    Image imageB = new Image(icon);
                    shape1.setFill(new ImagePattern(imageB));
                    Pause();
                    shape_5.setOpacity(0.1);
                } else if (shape1.getBoundsInParent().intersects(shape2.getBoundsInParent())) {
                    points += 10;
                    Score.setText(points + " ");
                } else if (shape1.getBoundsInParent().intersects(shape3.getBoundsInParent())) {
                    points += 10;
                    Score.setText(points + " ");
                } else if (shape1.getBoundsInParent().intersects(shape4.getBoundsInParent())) {
                    points += 10;
                    Score.setText(points + " ");
                } else if (shape1.getBoundsInParent().intersects(shape5.getBoundsInParent())) {
                    points += 10;
                    Score.setText(points + " ");
                }
            }
        });
        return Score;
    }

    public static void main(String[] args) {
        launch();
    }
}