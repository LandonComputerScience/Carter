import java.awt.*;

public class SquareBalloon extends Balloon{

    Color c;

    public SquareBalloon(){}

    public SquareBalloon(int x, int y, int r, Color c){
        super(x, y, r, c);
        this.c = c;
    }

    @Override
    public void draw(Graphics g, boolean makeItFilled){
        int x = getX();
        int y = getY();
        int r = getRadius();

        g.setColor(c);
        g.fillRect(x, y, 2*r, 2*r);
    }

}
