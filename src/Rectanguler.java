public class Rectanguler extends Shape{
    private double Highet;
    private double Length;

    public Rectanguler(double highet, double length) {
        Highet = highet;
        Length = length;
    }

    public double getHighet() {
        return Highet;
    }

    public void setHighet(double highet) {
        Highet = highet;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    @Override
    double CalculateArea() {
        return Length*Highet;
    }

    @Override
    double CalculatCircumfernec() {
        return 2*(Length+Highet);
    }
}
