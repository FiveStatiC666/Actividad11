
public class Circle implements Shape
{

    public static final double pi= 3.1416;
    private double radio;
    private double diametro= radio*2;
    private double area;
    private double perimetro;

    public Circle (double radio)
    {
        this.radio=radio;
    }

    @Override
    public double getArea()
    {
        area= (pi*(Math.pow(radio,2)));
        System.out.println("Area del circulo: ");
        return area;
    }

    @Override
    public double getPerimeter()
    {
        perimetro= pi*radio*2;
        System.out.println("Perimetro del circulo: ");
        return perimetro;
    }
}
