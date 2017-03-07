public class testShape
{
    public static void main( String[] args )
    {
        Rectangle box = new Rectangle( 2, 4 );
        box.calcArea();
        box.calcPerim();
        
        System.out.println( box );

        Circle circ = new Circle( 5 );
        circ.calcArea();
        circ.calcPerim();

        System.out.println ( circ );
    }

}