import java.awt.*;
public class House implements Drawable{
    public House() {
    }
    @Override
    public void draw(Graphics2D g2d, int x, int y) {

        g2d.setColor(Color.decode("#8f5a1e"));
        g2d.drawRect(x, y-100 , 250, 250);
        g2d.fillRect(x, y-100, 250, 250);

        g2d. setColor(Color.WHITE);
        g2d.drawRect(x+40, y-30, 70, 70);
        g2d.fillRect(x+40, y-30, 70,70);

        g2d.setColor(Color.RED);
        g2d.drawPolygon(new int[]{x, x+125, x+250}, new int[]{y-100, y-250, y-100}, 3);
        g2d.fillPolygon(new int[]{x, x+125, x+250}, new int[]{y-100, y-250, y-100}, 3);


    }
}
