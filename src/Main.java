public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        System.out.println("Area of Circle: "+circle.CalculateArea());
        System.out.println ("Circumfernec ofArea: "+circle.CalculatCircumfernec());
        Rectanguler rectanguler=new Rectanguler(2,6);
        System.out.println("Area of Rectangular is: "+rectanguler.CalculateArea());
        System.out.println("Circumfernec of Rectagular: "+rectanguler.CalculatCircumfernec());
        Tringle tringle=new Tringle(5,4);
        System.out.println("Area of Tringle: "+tringle.CalculateArea());
        System.out.println("Circumfernec of Tringle: "+tringle.CalculatCircumfernec());




    }
}