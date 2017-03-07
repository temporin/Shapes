public abstract class Shape
{
    private String name;
    private double area;
    private double perim;

    public Shape ( String shapeOf )
    {
        name = shapeOf;
    }

    public abstract void calcArea();

    public abstract void calcPerim();
    
    public void setArea( double input )
    {
        area = input;
    }

    public void setPerim( double input)
    {
        perim = input;
    }

    public String getName()
    {
        return name;
    }

    public double getArea()
    {
        return area;
    }

    public double getPerim()
    {
        return perim;
    }

    public String toString()
    {
        return name + ",\tArea: " + area + ",\tPerimeter: " + perim;
    }

    
}