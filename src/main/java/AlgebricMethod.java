import java.util.Arrays;

public class AlgebricMethod {
    public static void main(String[] args) {
        int a1,b1,c1;
        int a2,b2,c2;
        int[][] payoff=    new
                int[][]{
                        {3,4,-2},
                        {-3,0,1},
                        {-1,-4,2}};
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

    }

}