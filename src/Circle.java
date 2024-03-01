public class Circle extends Shape {

    private double reduis;

    public Circle(double reduis) {
        this.reduis = reduis;
    }

    public double getReduis() {
        return reduis;
    }

    public void setReduis(double reduis) {
        this.reduis = reduis;
    }

    @Override
    double CalculateArea() {
        return Math.PI*Math.pow(reduis,2);
    }

    @Override
    double CalculatCircumfernec() {
        return 2*Math.PI*reduis;
    }
}
