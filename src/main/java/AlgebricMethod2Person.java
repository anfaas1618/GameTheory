import java.util.ArrayList;

public class AlgebricMethod2Person {
    public static void main(String[] args) {
        int [][]  payoffA=new
                int[][]{{0,1},
                {2,1},
        };
        int [][]  payoffB=new
                int[][]{
                {5, 0},
                {-1, 2},
        };
        int a = payoffB[0][0];
        int c= payoffB[1][0];
        int b = payoffB[0][1];
        int d= payoffB[1][1];
        System.out.println(a +"(p) + " +c+"(1-p) = "+b +"(p) + " +d+"(1-p)");
        System.out.println("("+a+"-"+c+"-"+b+"+"+d+")P"+" = "+"("+d+"-"+c+")");
        int denom= a-c-b+d;
        int num=d-c;
        System.out.println("("+denom+")p ="+num);
        double pans=(double) num/(double)denom;
        System.out.println("p="+convertDecimalToFraction(pans));
        double oneMinusP = 1-pans;
        System.out.println("1-p="+convertDecimalToFraction(oneMinusP));
        System.out.println("Mixed strategy for player A = ["+convertDecimalToFraction(pans)+","+convertDecimalToFraction(oneMinusP)+"]");

        a = payoffA[0][0];
        c= payoffA[0][1];
        b = payoffA[1][0];
        d= payoffA[1][1];
        System.out.println(a +"(q) + " +c+"(1-q) = "+b +"(q) + " +d+"(1-q)");
        System.out.println("("+a+"-"+c+"-"+b+"+"+d+")P"+" = "+"("+d+"-"+c+")");
        denom= a-c-b+d;
        num=d-c;
        System.out.println("("+denom+")q ="+num);
        pans=(double) num/(double)denom;
        System.out.println("q="+convertDecimalToFraction(pans));
        oneMinusP = 1-pans;
        System.out.println("1-q="+convertDecimalToFraction(oneMinusP));
        System.out.println("Mixed strategy for player B = ["+convertDecimalToFraction(pans)+","+convertDecimalToFraction(oneMinusP)+"]");


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
