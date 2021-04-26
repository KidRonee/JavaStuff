public class RobinsonCrusoe {
    public static double[] crusoe(int n, double d, double ang, double distMult, double angMult) {
        double[] xy = new double[2];
        for (ang = Math.toRadians(ang); n > 0; n--, d *= distMult, ang *= angMult) {
            System.out.println(ang);
            xy[0] += d * Math.cos(ang);
            xy[1] += d * Math.sin(ang);
        }
        return xy;
    }
}
