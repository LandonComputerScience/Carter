import java.awt.*;

public class FancyBalloon extends Balloon {

    Color c;

    public FancyBalloon(){}

    public FancyBalloon(int x, int y, int r, Color c){
        super(x, y, r, c);
        this.c = c;
    }

    @Override
    public void draw(Graphics g, boolean makeItFilled){
        int x = getX();
        int y = getY();
        int r = getRadius();
        int xPoly[] = {150, 250, 325, 375, 450, 275, 100};
        int yPoly[] = {150, 100, 125, 225, 250, 375, 300};
        Polygon p = new Polygon(xPoly, yPoly, xPoly.length);

        g.setColor(c);
        g.fillPolygon(p);
    }
}
