import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Image backgroundImage;
    Car car;

    Board(){
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\user\\Downloads\\3042.eps.jpg");
        backgroundImage = imageIcon.getImage();
        car = new Car();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(backgroundImage, 0, 0, this);
        g.drawImage(car.carImage, car.x, car.y, this);

    }
}
