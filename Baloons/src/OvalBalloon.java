import java.awt.*;

public class OvalBalloon extends Balloon {

    Color c;

    public OvalBalloon(){}

    public OvalBalloon(int x, int y, int r, Color c){
        super(x, y, r, c);
        this.c = c;
    }

    @Override
    public void draw(Graphics g, boolean makeItFilled){
        int x = getX();
        int y = getY();
        int r = getRadius();
        g.setColor(c);
        g.fillOval(x, y, r, 2*r);
    }

    @Override
    public double distance(int x, int y){
        double dx = x - getX();
        double dy = y - getY();
        return Math.sqrt((dx*dx)*4 + dy*dy);
    }

}
