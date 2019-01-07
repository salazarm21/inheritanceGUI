/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancegui;
        
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
        
/**
 *
 * @author marina
 */
public class ColorChangingCircle extends Circle{
    ColorChangingCircle(double centerX, double centerY, double radius){
    super(centerX, centerY, radius);
    setFill();
    }
    
    public void setFill(){
    double red = Math.random();
    double blue = Math.random();
    double green = Math.random();
    Paint myColor = new Color(red, green, blue, 1);
    super.setFill(myColor);
    }
}
