public class SwastikaMethod {
    public static void main(String[] args) {
        int [][]  payoffA=new
                int[][]{{0,2},
                {3,1}
        };
        int [][]  payoffB=new
                int[][]{
                {2,1},
                {1,3}

        };
        swastikafor(payoffA,"A");
       swastikafor(payoffB,"B");

    }

    private static void swastikafor(int[][] payoff, String player) {
        int a =payoff[0][0];
        int b =payoff[0][1];
        int c =payoff[1][0];
        int d =payoff[1][1];
        int xy;
        int x;
        int y;
        int constant;
        xy=a-b-c+d;
        x=b-d;
        y=c-d;
        constant=d;
        System.out.println("equation for e1= "+a+"(xy)"+"+"+b+"(x)(1-y) + "+c+"(y)(1-x) + "+d+"(1-x)(1-y)");
        System.out.println(xy+"xy + "+x+"x + "+y+"y + "+constant);
        if (player.equals("A")) {
            double denom = xy;
            double num = -x;
            System.out.println("critical point = " + convertDecimalToFraction(num / denom));
        }
        if (player.equals("B"))
        {
            double denom = xy;
            double num = -y;
            System.out.println("critical point = " + convertDecimalToFraction(num / denom));
        }
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
