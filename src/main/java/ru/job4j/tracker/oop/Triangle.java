package ru.job4j.tracker.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double period(double a, double b, double c) {
        return 0.5 * (a + b + c);
    }

    public boolean exist(double ab, double ac, double bc) {
        return ((ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab));
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = period(ab, ac, bc);
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
 }
