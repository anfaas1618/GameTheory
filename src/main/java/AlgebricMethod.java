import java.util.Arrays;

public class AlgebricMethod {
    public static void main(String[] args) {
        int a1,b1,c1;
        int a2,b2,c2;
        int p1[],p2[],p3[];
        int q1[],q2[],q3[];
        int[][] payoff=    new
                int[][]{
                        {-2,-4,3},
                        {-1,3,6},
                        {1,2,-2}};
    int x= MinMax.minmax(payoff);
        for (int[] ints : payoff) {
            for (int j = 0; j < payoff.length; j++) {
                System.out.print(ints[j]+" ");

            }
            System.out.println();
        }
        System.out.println("The three equations are ");
        String equation1=payoff[0][0]+"p1"+"+("+payoff[1][0]+")p2"+"+("+payoff[2][0]+")p3";
        String equation2=payoff[0][1]+"p1"+"+("+payoff[1][1]+")p2"+"+("+payoff[2][1]+")p3";
        String equation3=payoff[0][2]+"p1"+"+("+payoff[1][2]+")p2"+"+("+payoff[2][2]+")p3";
        System.out.println(equation1+" ---equation 1");
        System.out.println(equation2+" ---equation 2");
        System.out.println(equation3+" ---equation 3");
        System.out.println("now we take equation 1 = equation 2");
        System.out.println("we get 1=2");
        System.out.println(equation1+"="+equation2);
        a1=payoff[0][0]-payoff[0][1];
        b1=payoff[1][0]-payoff[1][1];
        c1=payoff[2][0]-payoff[2][1];

        System.out.println("We get equation");
        String equation12=a1+"p1"+"+("+b1+")p2"+"+("+c1+")p3=0";
        System.out.println(equation12);
        System.out.println("a1="+a1+" b1="+b1+" c1="+c1);
        System.out.println("now we take equation 1 = equation 3");
        System.out.println("we get 1=3");
        System.out.println(equation1+"="+equation3);
        a2=payoff[0][0]-payoff[0][2];
        b2=payoff[1][0]-payoff[1][2];
        c2=payoff[2][0]-payoff[2][2];

        System.out.println("We get equation");
         equation12=a2+"p1"+"+("+b2+")p2"+"+("+c2+")p3=0";
        System.out.println(equation12);
        System.out.println("a1="+a2+" b1="+b2+" c1="+c2);
        System.out.println(" ");
        System.out.println("b   c   a   b");
        System.out.println("b1  c1  a1  b1");
        System.out.println("--  --  --  --");
        System.out.println("b2  c2  a2  b2");
        System.out.println("b here will be "+b1+"/"+b2);
        System.out.println("c here will be "+c1+"/"+c2);
        System.out.println("a here will be "+a1+"/"+a2);
        System.out.println("p1");
        System.out.println("--");
        System.out.println("(b1*c2)-(b2*c1)");
        System.out.println(" ");
        System.out.println("p1");
        System.out.println("--");
        System.out.println("("+b1+"*"+c2+")-("+b2+"*" +c1+")");
        System.out.println("p1");
        System.out.println("--");
        int p1frac=(b1*c2)-(b2*c1);
        System.out.println(p1frac);
        System.out.println("********************************");
        System.out.println("p2");
        System.out.println("--");
        System.out.println("(c1*a2)-(c2*a1)");
        System.out.println(" ");
        System.out.println("p2");
        System.out.println("--");
        System.out.println("("+c1+"*"+a2+")-("+c2+"*" +a1+")");
        System.out.println("p2");
        System.out.println("--");
        int p2frac=(c1*a2)-(c2*a1);
        System.out.println(p2frac);
        System.out.println("********************************");
        System.out.println("p3");
        System.out.println("--");
        System.out.println("(a1*b2)-(a2*b1)");
        System.out.println(" ");
        System.out.println("p3");
        System.out.println("--");
        System.out.println("("+a1+"*"+b2+")-("+a2+"*" +b1+")");
        System.out.println("p3");
        System.out.println("--");
        int p3frac=(a1*b2)-(a2*b1);
        System.out.println(p3frac);
        int sumfracdenom=p1frac+p2frac+p3frac;
        System.out.println("sum of p1 +p2+p3 denom we get="+sumfracdenom);
        p1= FracValue(p1frac,sumfracdenom);
        p2= FracValue(p2frac,sumfracdenom);
        p3= FracValue(p3frac,sumfracdenom);
        System.out.println("the value of p1 = "+GetFracValue(p1));
        System.out.println("the value of p2 = "+GetFracValue(p2));
        System.out.println("the value of p3 = "+GetFracValue(p3));
        System.out.println("####################################################################");
        System.out.println("The three equations for column are ");
         equation1=payoff[0][0]+"q1"+"+("+payoff[0][1]+")q2"+"+("+payoff[0][2]+")q3";
         equation2=payoff[1][0]+"q1"+"+("+payoff[1][1]+")q2"+"+("+payoff[1][2]+")q3";
         equation3=payoff[2][0]+"q1"+"+("+payoff[2][1]+")q2"+"+("+payoff[2][2]+")q3";
        System.out.println(equation1+" ---equation 1");
        System.out.println(equation2+" ---equation 2");
        System.out.println(equation3+" ---equation 3");
        System.out.println("now we take equation 1 = equation 2");
        System.out.println("we get 1=2");
        System.out.println(equation1+"="+equation2);
        a1=payoff[0][0]-payoff[1][0];
        b1=payoff[0][1]-payoff[1][1];
        c1=payoff[0][2]-payoff[1][2];

        System.out.println("We get equation");
         equation12=a1+"q1"+"+("+b1+")q2"+"+("+c1+")q3=0";
        System.out.println(equation12);
        System.out.println("a1="+a1+" b1="+b1+" c1="+c1);
        System.out.println("now we take equation 1 = equation 3");
        System.out.println("we get 1=3");
        System.out.println(equation1+"="+equation3);
        a2=payoff[0][0]-payoff[2][0];
        b2=payoff[0][1]-payoff[2][1];
        c2=payoff[0][2]-payoff[2][2];

        System.out.println("We get equation");
        equation12=a2+"q1"+"+("+b2+")q2"+"+("+c2+")q3=0";
        System.out.println(equation12);
        System.out.println("a1="+a2+" b1="+b2+" c1="+c2);
        System.out.println(" ");
        System.out.println("b   c   a   b");
        System.out.println("b1  c1  a1  b1");
        System.out.println("--  --  --  --");
        System.out.println("b2  c2  a2  b2");
        System.out.println("b here will be "+b1+"/"+b2);
        System.out.println("c here will be "+c1+"/"+c2);
        System.out.println("a here will be "+a1+"/"+a2);
        System.out.println("q1");
        System.out.println("--");
        System.out.println("(b1*c2)-(b2*c1)");
        System.out.println(" ");
        System.out.println("q1");
        System.out.println("--");
        System.out.println("("+b1+"*"+c2+")-("+b2+"*" +c1+")");
        System.out.println("q1");
        System.out.println("--");
         int      q1frac=(b1*c2)-(b2*c1);
        System.out.println(q1frac);
        System.out.println("********************************");
        System.out.println("q2");
        System.out.println("--");
        System.out.println("(c1*a2)-(c2*a1)");
        System.out.println(" ");
        System.out.println("q2");
        System.out.println("--");
        System.out.println("("+c1+"*"+a2+")-("+c2+"*" +a1+")");
        System.out.println("q2");
        System.out.println("--");
          int     q2frac=(c1*a2)-(c2*a1);
        System.out.println(q2frac);
        System.out.println("********************************");
        System.out.println("q3");
        System.out.println("--");
        System.out.println("(a1*b2)-(a2*b1)");
        System.out.println(" ");
        System.out.println("q3");
        System.out.println("--");
        System.out.println("("+a1+"*"+b2+")-("+a2+"*" +b1+")");
        System.out.println("q3");
        System.out.println("--");
           int  q3frac=(a1*b2)-(a2*b1);
        System.out.println(q3frac);
             sumfracdenom=q1frac+q2frac+q3frac;
        System.out.println("sum of q1 +q2+q3 denom we get="+sumfracdenom);
        q1= FracValue(q1frac,sumfracdenom);
        q2= FracValue(q2frac,sumfracdenom);
        q3= FracValue(q3frac,sumfracdenom);
        System.out.println("the value of q1 = "+GetFracValue(q1));
        System.out.println("the value of q2 = "+GetFracValue(q2));
        System.out.println("the value of q3 = "+GetFracValue(q3));

        Double p1value=((double) p1[0]/(double) p1[1]);
        Double p2value=((double) p2[0]/(double) p2[1]);
        Double p3value=((double) p3[0]/(double) p3[1]);
        Double q1value=((double) q1[0]/(double) q1[1]);
        Double q2value=((double) q2[0]/(double) q2[1]);
        Double q3value=((double) q3[0]/(double) q3[1]);

        Double GameValue=(payoff[0][0]*p1value*q1value) +
                         (payoff[0][1]*p1value*q2value) +
                         (payoff[0][2]*p1value*q3value) +
                         (payoff[1][0]*p2value*q1value) +
                         (payoff[1][1]*p2value*q2value) +
                         (payoff[1][2]*p2value*q3value) +
                         (payoff[2][0]*p3value*q1value) +
                         (payoff[2][1]*p2value*q2value) +
                         (payoff[2][2]*p2value*q3value);

        System.out.println(GameValue);
        System.out.println(convertDecimalToFraction(GameValue));
    }

    private static String GetFracValue(int[] value) {
        return value[0]+"/"+value[1];
    }

    public static int[] FracValue(int num, int denom)
    {  int [] values=new  int[2];
        values[0]=num;
        values[1]=denom;
        return values;
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
        if (k1==1)
            return ""+h1;
        else
            return h1+"/"+k1;
    }

}