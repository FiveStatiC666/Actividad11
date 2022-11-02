public class Triangle implements Shape
{
    private double lado;
    private double altura;
    private double area;
    private double perimetro;

    public Triangle(double lado)
    {
        this.lado=lado;
        this.altura=altura;
    }

    public double getArea()
    {
        area= (lado*altura)/2;
        System.out.println("Area del triangulo: ");
        return area;
    }

    public double getPerimeter()
    {
        perimetro= lado*3;
        System.out.println("Perimetro del triangulo: ");
        return perimetro;
    }
}
