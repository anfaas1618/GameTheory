public class ProbabilityMethod {
    public static void main(String[] args) {
        System.out.println("hello there");
        int p1q1,p1q2,p1;
        int p2q1,p2q2,p2;
        int q1,q2,c;

        int [][]  payoffA=new
                int[][]{{0,1,-1},
                {-1,0,1},
                {1 ,-1,0}
        };
        int [][]  payoffB=new
                int[][]{
                 {0,-1,1},
                {1,0,-1},
                {-1 ,1,0}
        };
            p1q1=payoffA[0][0]-payoffA[0][2]-payoffA[2][0]+payoffA[2][2];
            p1q2=payoffA[0][1]-payoffA[0][2]-payoffA[2][1]+payoffA[2][2];
            p2q1=payoffA[1][0]-payoffA[1][2]-payoffA[2][0]+payoffA[2][2];
            p2q2=payoffA[1][1]-payoffA[1][2]-payoffA[2][1]+payoffA[2][2];
            p1=payoffA[0][2]-payoffA[2][2];
            p2=payoffA[1][2]-payoffA[2][2];
            q1=payoffA[2][0]-payoffA[2][2];
            q2=payoffA[2][1]-payoffA[2][2];
            c=payoffA[2][2];
        System.out.println("****************** values for e1 ****************************************");
        System.out.println("p1q1="+p1q1);
        System.out.println("p2q1="+p2q1);
        System.out.println("p1q2="+p1q2);
        System.out.println("p2q2="+p1q1);
        System.out.println("p1="+p1);
        System.out.println("p2="+p2);
        System.out.println("q1="+q1);
        System.out.println("q2="+q2);
        System.out.println("************************differentiation of e1 with p1 **********************************");
        System.out.println("equation 1 is =");
        int[] q1_after_diff,q2_after_diff,constant;
        q1_after_diff =new int[2];
        q2_after_diff=new int[2];
        constant=new int[2];
        q1_after_diff[0]=p1q1;
        q2_after_diff[0]=p1q2;
        constant[0]=p1;
        System.out.println("("+q1_after_diff[0]+")q1 + ("+q2_after_diff[0]+")q2 + ("+constant[0]+") = 0");

        System.out.println("************************differentiation of e1 with p2 **********************************");
        System.out.println("equation 2 is =");
        q1_after_diff[1]=p2q1;
        q2_after_diff[1]=p2q2;
        constant[1]=p2;
        System.out.println("("+q1_after_diff[1]+")q1 + ("+q2_after_diff[1]+")q2 + ("+constant[1]+") = 0");

double values[]=new double[3];

    values= solveSimultaneousEquations(q1_after_diff[0],q2_after_diff[0],q1_after_diff[1],q2_after_diff[1],-constant[0],-constant[1] );
  values[2]=1-values[0]-values[1];
        System.out.println("q1=" + values[0] + " q2=" + values[1]+" 1-q1-q2="+values[2]);
        System.out.println("in fractions");
        System.out.println("q1=" + convertDecimalToFraction(values[0]) + "  q2=" +
                                 convertDecimalToFraction(values[1])+"  (1-q1-q2)="+
                                 convertDecimalToFraction(values[2]));

        System.out.println("mixed strategy for B is ["+convertDecimalToFraction(values[0])+","+
                                                       convertDecimalToFraction(values[1])+","+
                                                       convertDecimalToFraction(values[2])+"]");


    }
    //taken from stackoverflow
    //modified here
    public static double[] solveSimultaneousEquations(double a, double b, double c, double d, double e, double f) {
        double det = ((a) * (d) - (b) * (c));  //instead of 1/
        double x = ((d) * (e) - (b) * (f)) / det;
        double y = ((a) * (f) - (c) * (e)) / det;
        double[] xy=new double[3];
        xy[0]=x;
        xy[1]=y;
        xy[2]=0.0;
        return xy;
    }
    static private String convertDecimalToFraction(double x){
        if (x < 0){
            return "-" + convertDecimalToFraction(-x);
        }
        double tolerance = 1.0E-6;
        double h1=1; double h2=0;
        double k1=0; double k2=1;
        double b = x;
        do {
            double a = Math.floor(b);
            double aux = h1; h1 = a*h1+h2; h2 = aux;
            aux = k1; k1 = a*k1+k2; k2 = aux;
            b = 1/(b-a);
        } while (Math.abs(x-h1/k1) > x*tolerance);
        int h11 = (int) h1;
        int k11 = (int) k1;
        if (k1==1)
            return ""+h11;
        else
            return h11+"/"+k11;
    }
}
