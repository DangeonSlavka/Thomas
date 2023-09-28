import java.awt.*;
public class Terrain {

    public Terrain() {
    }

    public void draw(Graphics2D g2d, int x, int y){
            g2d.setColor(Color.pink);
            g2d.drawRect(x-500, y-480, 800, 450);
            g2d.fillRect(x-500, y-480, 800, 450 );

            g2d.setColor(Color.GRAY);
            g2d.drawRect(x-500, y-30, 800, 350 );
            g2d.fillRect(x-500, y-30, 800, 350);

            g2d.setStroke(new BasicStroke(6));
            g2d.setColor(Color.BLACK);
            g2d.drawLine(x-600,y+167, x+800, y+167);

    }
}
