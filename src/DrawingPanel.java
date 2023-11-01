import javax . swing .*;
import java . awt .*;
import java . awt . event . ActionEvent ;
import java . awt . event . ActionListener ;
import java.util.ArrayList;

class DrawingPanel extends JFrame implements
        ActionListener {
    private final int BACKGROUND_WIDTH = 800;
    private final int BACKGROUND_HEIGHT = 800;

    private final int TIMER_DELAY = 1000;
    private final Timer timer = new Timer ( TIMER_DELAY ,
            this );
    private int ticksFromStart = 0;

    public DrawingPanel () {
        setTitle (" Drawing panel ");
        setSize ( BACKGROUND_WIDTH , BACKGROUND_HEIGHT );
        setVisible ( true );
        setDefaultCloseOperation ( DISPOSE_ON_CLOSE ) ;
      timer . start () ;
    }

    @Override
    public void paint ( Graphics g) {
        Graphics2D g2d = ( Graphics2D ) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d . setColor ( Color . WHITE ) ;
        g2d . fillRect (0 , 0, BACKGROUND_WIDTH ,
                BACKGROUND_HEIGHT ) ;

        ArrayList<Drawable> list = new ArrayList<>();
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        list.add(new Terrain());
        coordinates.add(new Coordinate(500, 500));

        list.add(new Train());
        coordinates.add(new Coordinate(10+ticksFromStart, 500));

        list.add(new House());
        coordinates.add(new Coordinate(400, 400));


        int i = 0;
        for(Drawable obj:list){
            Coordinate tmp = coordinates.get(i++);
            obj.draw(g2d, tmp.x, tmp.y);
        }

    }

    @Override
    public void actionPerformed ( ActionEvent e) {
        if ( e. getSource () == timer ) {
            repaint () ;
            ++ ticksFromStart ;
        }
    }
}
