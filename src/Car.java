import javax.swing.*;
import java.awt.*;

public class Car {
    Image carImage;
    public   int x=2,y=250;
    Car(){
        ImageIcon carIcon = new ImageIcon("C:\\Users\\user\\Downloads\\cars.png");
        carImage = carIcon.getImage();
        carImage = carImage.getScaledInstance(200,100, Image.SCALE_SMOOTH);
    }

}
