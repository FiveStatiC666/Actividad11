import java.util.Locale;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        boolean area= false;
        boolean perimetro=false;
        boolean opcion;
        char Figura;
        char Calculos;
        double resultado=0;

        Scanner scanner= new Scanner(System.in);

        do
        {
            System.out.println("¿Que deseas calcular: ");
            System.out.println("a.- Area");
            System.out.println("b.- Perimetro");

            Calculos= scanner.next().toLowerCase().charAt(0);

            switch (Calculos)
            {
                case 'a':
                    area=true;
                    opcion=true;
                    break;

                case 'b':
                    perimetro=true;
                    opcion=true;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    opcion=false;
                    break;
            }

        }
        while (opcion==false);

        do {
            System.out.println("¿Que figura deseas: ");
            System.out.println("a.- Circulo");
            System.out.println("b.- Triangulo");
            System.out.println("c.- Cuadrado");

            Figura = scanner.next().toLowerCase().charAt(0);

            switch (Figura) {
                case 'a':
                    System.out.println("Ingresa el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    Circle circle = new Circle(radio);

                    if (area) {
                        resultado = circle.getArea();
                    }

                    if (perimetro) {
                        resultado = circle.getPerimeter();
                    }

                    opcion = true;
                    break;

                case 'b':
                    System.out.println("Ingresa la longitud del lado del triangulo: ");
                    double lado = scanner.nextDouble();
                    Triangle trianngulo = new Triangle(lado);

                    if (area) {
                        resultado = trianngulo.getArea();
                    }

                    if (perimetro) {
                        resultado = trianngulo.getPerimeter();
                    }

                    opcion = true;
                    break;

                case 'c':
                    System.out.println("Ingresa la longitud del lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    Square cuadrado = new Square(ladoCuadrado);

                    if (area) {
                        resultado = cuadrado.getArea();
                    }

                    if (perimetro) {
                        resultado = cuadrado.getPerimeter();
                    }

                    opcion = true;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    opcion = false;
                    break;

            }

        }while(opcion==false);

        System.out.println(resultado);
    }
}
