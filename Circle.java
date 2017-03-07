public class Circle extends Shape
{
    private double radius;

    public Circle( int r )
    {
        super( "Circle" );
        radius = r;
    }

    public void calcArea()
    {
        setArea( Math.PI * Math.pow( radius, 2 ) );
    }

    public void calcPerim()
    {
        setPerim( Math.PI * 2 * radius );
    }

    public double getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return getName() + ",\tRadius: " + radius + ",\tArea: " + getArea() + ",\tCircumference: " + getPerim();
    }
}