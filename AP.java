import java.util.Scanner;

public class AP{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the radious: ");
        double radious=scanner.nextDouble();

        double area=Math.PI*radious*radious;
        double perimeter=2*Math.PI*radious;

        System.out.println("area and perimeter is: "+area+" "+perimeter);

        scanner.close();
    }
}
