package interclass;

public abstract class Parallelogram implements Figure {
    protected double a;
    protected double h;

    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}
