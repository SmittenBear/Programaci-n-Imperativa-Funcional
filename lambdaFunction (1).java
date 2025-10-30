public class lambdaFunction {

    interface diferencia {
        public double resta(double x, double y);
    }

    public static void main(String[] arg) {
        diferencia dif = (x,y) -> x - y;
        System.out.println(dif.resta(12, 50));
    }
}