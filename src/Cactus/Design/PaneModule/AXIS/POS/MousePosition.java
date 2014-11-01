package Cactus.Design.PaneModule.AXIS.POS;

/**
 * Created with IntelliJ IDEA.
 * User: ezilizh
 * Date: 10/30/14
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class MousePosition extends Position
{
    public MousePosition()
    {
        super();
    }

    public MousePosition(double x, double y)
    {
        super(x, y);
    }

    @Override
    public Position getCopy()
    {
        return new MousePosition(super.getX(), super.getY()) ;
    }
}