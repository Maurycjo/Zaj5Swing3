package figury;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;

public class Kwadrat extends Figura
{

    public Kwadrat(Graphics2D buffer, int delay, int width, int height)
    {
        super(buffer, delay, width, height);
        shape= new Rectangle(50,50,20,20);
        aft= new AffineTransform();
        area= new Area(shape);
    }
}
