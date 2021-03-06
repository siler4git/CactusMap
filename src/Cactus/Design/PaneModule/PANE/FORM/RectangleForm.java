package Cactus.Design.PaneModule.PANE.FORM;

import Cactus.Design.PaneModule.PANE.FORM.TYPE.Form;

/**
 * Created with IntelliJ IDEA.
 * User: ezilizh
 * Date: 10/31/14
 * Time: 3:45 PM
 */
public class RectangleForm extends ShapeForm
{
    public RectangleForm()
    {
        super();
    }

    public RectangleForm(double width, double height)
    {
        super(width, height);
    }

    public RectangleForm(Form form)
    {
        super(form);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public Form getCopy()
    {
        return new RectangleForm(this.width, this.height);
    }
}
