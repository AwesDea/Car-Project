package car;

/**
 * Created by AM!N on 11/26/2016.
 * wheels
 */
public class Wheel {
    double friction = 0;
    double wheelForce = 0;

    public double radiusOfCharkhesh(double m, double v) {
        double r = m * v * v / wheelForce;
        return r;
    }

}
