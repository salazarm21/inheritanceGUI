/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancegui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author marina
 */
public class InheritanceGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root= new Pane();
        for(int i = 0; i < 20; i++){
        ColorChangingCircle c = makeCircle();
        root.getChildren().add(c);
        
        }
        
        Button btn = new Button();
        btn.setText("Change Colors");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                for(int i = 0; i < 20; i++){
                  //  ColorChangingCircle c = ColorChangingCircle;
                    root.getChildren().get(i);
                  //  c.setFill();
                }
            }
        });
        
        VBox allItems = new VBox();
        allItems.getChildren().add(btn);
        
        
        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Color Changing Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static ColorChangingCircle makeCircle(){
    int x = (int) (Math.random() * 600);
    int y = (int) (Math.random() * 600);
    int r = (int) (Math.random() * 30 + 10);
    ColorChangingCircle myCircle = new ColorChangingCircle(x, y, r);
    return myCircle;
    }
}
