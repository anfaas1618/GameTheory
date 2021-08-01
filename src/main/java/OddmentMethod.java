public class OddmentMethod {
    public static void main(String[] args) {
        int r1,r2;
        int c1,c2;

        int[][] payoff=    new
                int[][]{
                {4,0},
                {0,8}};
        for (int[] ints : payoff) {
            for (int j = 0; j < payoff.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        r1=Math.abs(payoff[1][0]-payoff[1][1]);
        r2=Math.abs(payoff[0][0]-payoff[0][1]);
        c1=Math.abs(payoff[0][1]-payoff[1][1]);
        c2=Math.abs(payoff[0][0]-payoff[1][0]);
        System.out.println("r1="+r1);
        System.out.println("r2="+r2);
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println(" _ _    _ _\n" +
                "|          |\n" +
                "|  "+payoff[0][0]+"    "+payoff[0][1]+"  |  "+r1+"\n" +
                "|          | \n" +
                "|  "+payoff[1][0]+"    "+payoff[1][1]+"  |  "+r2+"\n" +
                "|_ _    _ _|\n" +
                " \n" +
                "   "+c1+"    "+c2);
        double sum=r1+r2;
        System.out.println("sum of r1 and r2 =" +sum);
        System.out.println("mixed strategty for A is " );
        System.out.println("A=[row 1, row 2]");
        System.out.println("=["+convertDecimalToFraction((double)  r1/sum)+","+convertDecimalToFraction((double)  r2/sum)+"]");
        System.out.println("*************************************************************************************************");
        sum=c1+c2;
        System.out.println("sum of c1 and c2 =" +sum);
        System.out.println("mixed strategty for B is " );
        System.out.println("B=[col 1, col 2]");
        System.out.println("=["+convertDecimalToFraction((double)  c1/sum)+","+convertDecimalToFraction((double)  c2/sum)+"]");
     String gamevalue=   calculategamevalue( payoff[0][0],c1,payoff[0][1],c2);
        System.out.println("the game value is = "+gamevalue);
    }

    private static String calculategamevalue(double payoff00, double c1, double payoff01, double c2) {
        System.out.println("\t\t\t\tr0c0 x c1 + r0c1 x c2\n" +
                "Game Value =\t----------------------\n" +
                "\t\t\t\t\t   c1 + c2");
        System.out.println("\t\t\t\t "+payoff00+" x "+c1+" + "+payoff01+" x "+c2+"\n" +
                "Game Value =\t----------------------\n" +
                "\t\t\t\t\t   "+c1+" + "+c2);
        double denominator=c1+c2;
        double numerator= (payoff00*c1)+(payoff01*c2);

        return convertDecimalToFraction(numerator/denominator);
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
