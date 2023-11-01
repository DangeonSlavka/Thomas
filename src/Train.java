import java.awt.*;

public class Train implements Drawable{
    public Train() {

    }
    @Override
    public void draw(Graphics2D g2d, int x, int y){

        g2d.setColor(Color.BLUE);
        g2d.fillRect(x, y, 350, 120 );

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(6));
        g2d.drawRect(x, y, 350, 120 );

        g2d.setColor(Color.BLACK);
        g2d.drawOval(x+310, y+120, 40, 40);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(x, y+120, 40, 40);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(x+70, y+120, 40, 40);

        g2d.setColor(Color.BLUE);
        g2d.fillRect(x+10, y-100, 140, 100);

        g2d.setColor(Color.BLACK);
        g2d.drawRect(x+10, y-100, 140, 100);

        g2d.setColor(Color.WHITE);
        g2d.drawLine(x+344, y+6, x+344, y+113);

        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(25));
        g2d.drawLine(x+300, y-141, x+300, y-16);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(6));
        g2d.drawRect(x+290, y-156, 25,156);

        g2d.setColor(Color.WHITE);
        g2d.fillRect(x+77, y-90, 70, 70);

        g2d.setColor(Color.RED);
        g2d.drawLine(x+6, y+114, x+338, y+114);

        g2d.setColor(Color.BLACK);
        g2d.drawLine(x+20, y+140, x+330, y+140);
    }
}
