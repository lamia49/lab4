public class Tringle extends Shape{

    private double Highet;
    private double Base;

    public Tringle(double highet, double base) {
        Highet = highet;
        Base = base;
    }

    public double getHighet() {
        return Highet;
    }

    public void setHighet(double highet) {
        Highet = highet;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    @Override
    double CalculateArea() {
        return 0.5*Base*Highet;
    }

    @Override
    double CalculatCircumfernec() {
        return Base+Highet+Highet;
    }
}
