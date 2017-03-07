public class Rectangle extends Shape
{
    private double height;
    private double width;

    public Rectangle ( double h, double w )
    {
        super( "Rectangle" );
        height = h;
        width = w;
    }

    public void calcArea()
    {
        setArea( height * width );
    }

    public void calcPerim()
    {
        setPerim( 2 * height + 2 * width );
    }


}