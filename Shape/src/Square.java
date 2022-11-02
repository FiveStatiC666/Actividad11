public class Square implements Shape
{
    private double lado;
    private double area;
    private double perimetro;

    public Square (double lado)
    {
        this.lado=lado;
    }


    public double getArea()
    {
        area=lado*lado;
        System.out.println("Area del cuadrado: ");
        return area;
    }

    public double getPerimeter()
    {
        perimetro=lado*4;
        System.out.println("Perimetro del cuadrado: ");
        return perimetro;
    }
}
