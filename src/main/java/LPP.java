import java.util.Arrays;
import java.util.Scanner;

public class LPP {
    static double u1[],u2[],u3[],s1[],s2[],s3[],b[] = new double[3],cj[] = new double[6],zj[] = new double[6],cb[]=new double[3];

    static  double[][] payoff;
    public static void main(String[] args) {
        u1 =new double[3];
        u2 =new double[3];
        u3 =new double[3];
        s1 =new double[3];
        cb[0]=0;
        cb[1]=0;
        cb[2]=0;
        cj[0]=1;
        cj[1]=1;
        cj[2]=1;
        cj[3]=0;
        cj[4]=0;
        cj[5]=0;
        s1[0]=1;
        s1[1]=0;
        s1[2]=0;
        b[0]=1;
        b[1]=1;
        b[2]=1;
        s2 =new double[3];
        s2[0]=0;
        s2[1]=1;
        s2[2]=0;
        s3 =new double[3];
        s3[0]=0;
        s3[1]=0;
        s3[2]=1;

        payoff=    new
                double[][]{
                {1,-1,3},
                {3,5,-3},
                {6,2,-2}};
        for (int i = 0; i < payoff.length; i++) {
            for (int j = 0; j < payoff.length; j++) {
                System.out.print(payoff[i][j]+" ");
            }
            System.out.println("");
        }
        u1[0]=payoff[0][0];
        u2[0]=payoff[0][1];
        u3[0]=payoff[0][2];
        u1[1]=payoff[1][0];
        u2[1]=payoff[1][1];
        u3[1]=payoff[1][2];
        u1[2]=payoff[2][0];
        u2[2]=payoff[2][1];
        u3[2]=payoff[2][2];
        for (int i = 0; i < u1.length; i++) {
            System.out.print(u1[i]+ "  ");
            System.out.print(u2[i]+ "  ");
            System.out.print(u3[i]+ "  ");
            System.out.print(s1[i]+ "  ");
            System.out.print(s2[i]+ "  ");
            System.out.print(s3[i]+ "  ");
            System.out.print(b[i]+ "  ");
            System.out.println("");
        }
        //

        double sum=0;
        zj[0]=cb[0]*u1[0]+cb[1]*u1[1]+cb[2]*u1[2];
        zj[1]=cb[0]*u2[0]+cb[1]*u2[1]+cb[2]*u2[2];
        zj[2]=cb[0]*u3[0]+cb[1]*u3[1]+cb[2]*u3[2];
        zj[3]=cb[0]*s1[0]+cb[1]*s1[1]+cb[2]*s1[2];
        zj[4]=cb[0]*s2[0]+cb[1]*s2[1]+cb[2]*s2[2];
        zj[5]=cb[0]*s3[0]+cb[1]*s3[1]+cb[2]*s3[2];
        Arrays.stream(zj).forEach(s-> System.out.print(s+"  " ));

//r1->0+r3/6
        // r1->r1/3-r3*2/3
        // target -> 2*target + key*value

//        int target = 2,key = 2,c = 0;
//        float  value = (float)1/6;
        int target []=new int[3];
        int key[]=new int[3];
        int c[] =new int[3];
        double value[]= new double[3];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the value of target row");
            target[i]= sc.nextInt()-1;
            System.out.println("enter the value of  coefficient(1/0) if exist in target value R1->c*R1 + something");
            c[i]=sc.nextInt();
            System.out.println("enter the key value");
            key[i]= sc.nextInt()-1;

            double num,denom = 1;
            System.out.println("enter the value for key numerator ");
            num=sc.nextFloat();
            System.out.println("enter the value for key denom");
            denom=sc.nextFloat();
            value[i]=(double) num/denom;
        }
        System.out.println("value is "+value);
        transformation(target[0],c[0],key[0],value[0]);
        System.out.println("#####################111111111111111111########");
        printitall();
        transformation(target[1],c[1],key[1],value[1]);
        System.out.println("##################222222222222222222###########");
        printitall();
        transformation(target[2],c[2],key[2],value[2]);

        System.out.println("################33333333333333333333333##########");
        printitall();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the value of target row");
            target[i]= sc.nextInt()-1;
            System.out.println("enter the value of  coefficient(1/0) if exist in target value R1->c*R1 + something");
            c[i]=sc.nextInt();
            System.out.println("enter the key value");
            key[i]= sc.nextInt()-1;

            double num,denom = 1;
            System.out.println("enter the value for key numerator ");
            num=sc.nextFloat();
            System.out.println("enter the value for key denom");
            denom=sc.nextFloat();
            value[i]=(double) num/denom;
        }
        System.out.println("value is "+value);
        transformation(target[0],c[0],key[0],value[0]);
        System.out.println("#####################111111111111111111########");
        printitall();
        transformation(target[1],c[1],key[1],value[1]);
        System.out.println("##################222222222222222222###########");
        printitall();
        transformation(target[2],c[2],key[2],value[2]);

        System.out.println("################33333333333333333333333##########");
        printitall();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the value of target row");
            target[i]= sc.nextInt()-1;
            System.out.println("enter the value of  coefficient(1/0) if exist in target value R1->c*R1 + something");
            c[i]=sc.nextInt();
            System.out.println("enter the key value");
            key[i]= sc.nextInt()-1;

            double num,denom = 1;
            System.out.println("enter the value for key numerator ");
            num=sc.nextFloat();
            System.out.println("enter the value for key denom");
            denom=sc.nextFloat();
            value[i]=(double) num/denom;
        }
        System.out.println("value is "+value);
        transformation(target[0],c[0],key[0],value[0]);
        System.out.println("#####################111111111111111111########");
        printitall();
        transformation(target[1],c[1],key[1],value[1]);
        System.out.println("##################222222222222222222###########");
        printitall();
        transformation(target[2],c[2],key[2],value[2]);

        System.out.println("################33333333333333333333333##########");
        printitall();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the value of target row");
            target[i]= sc.nextInt()-1;
            System.out.println("enter the value of  coefficient(1/0) if exist in target value R1->c*R1 + something");
            c[i]=sc.nextInt();
            System.out.println("enter the key value");
            key[i]= sc.nextInt()-1;

            double num,denom = 1;
            System.out.println("enter the value for key numerator ");
            num=sc.nextFloat();
            System.out.println("enter the value for key denom");
            denom=sc.nextFloat();
            value[i]=(double) num/denom;
        }
        System.out.println("value is "+value);
        transformation(target[0],c[0],key[0],value[0]);
        System.out.println("#####################111111111111111111########");
        printitall();
        transformation(target[1],c[1],key[1],value[1]);
        System.out.println("##################222222222222222222###########");
        printitall();
        transformation(target[2],c[2],key[2],value[2]);

        System.out.println("################33333333333333333333333##########");
        printitall();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the value of target row");
            target[i]= sc.nextInt()-1;
            System.out.println("enter the value of  coefficient(1/0) if exist in target value R1->c*R1 + something");
            c[i]=sc.nextInt();
            System.out.println("enter the key value");
            key[i]= sc.nextInt()-1;

            double num,denom = 1;
            System.out.println("enter the value for key numerator ");
            num=sc.nextFloat();
            System.out.println("enter the value for key denom");
            denom=sc.nextFloat();
            value[i]=(double) num/denom;
        }
        System.out.println("value is "+value);
        transformation(target[0],c[0],key[0],value[0]);
        System.out.println("#####################111111111111111111########");
        printitall();
        transformation(target[1],c[1],key[1],value[1]);
        System.out.println("##################222222222222222222###########");
        printitall();
        transformation(target[2],c[2],key[2],value[2]);

        System.out.println("################33333333333333333333333##########");
        printitall();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the value of target row");
            target[i]= sc.nextInt()-1;
            System.out.println("enter the value of  coefficient(1/0) if exist in target value R1->c*R1 + something");
            c[i]=sc.nextInt();
            System.out.println("enter the key value");
            key[i]= sc.nextInt()-1;

            double num,denom = 1;
            System.out.println("enter the value for key numerator ");
            num=sc.nextFloat();
            System.out.println("enter the value for key denom");
            denom=sc.nextFloat();
            value[i]=(double) num/denom;
        }
        System.out.println("value is "+value);
        transformation(target[0],c[0],key[0],value[0]);
        System.out.println("#####################111111111111111111########");
        printitall();
        transformation(target[1],c[1],key[1],value[1]);
        System.out.println("##################222222222222222222###########");
        printitall();
        transformation(target[2],c[2],key[2],value[2]);

        System.out.println("################33333333333333333333333##########");
        printitall();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the value of target row");
            target[i]= sc.nextInt()-1;
            System.out.println("enter the value of  coefficient(1/0) if exist in target value R1->c*R1 + something");
            c[i]=sc.nextInt();
            System.out.println("enter the key value");
            key[i]= sc.nextInt()-1;

            double num,denom = 1;
            System.out.println("enter the value for key numerator ");
            num=sc.nextFloat();
            System.out.println("enter the value for key denom");
            denom=sc.nextFloat();
            value[i]=(double) num/denom;
        }
        System.out.println("value is "+value);
        transformation(target[0],c[0],key[0],value[0]);
        System.out.println("#####################111111111111111111########");
        printitall();
        transformation(target[1],c[1],key[1],value[1]);
        System.out.println("##################222222222222222222###########");
        printitall();
        transformation(target[2],c[2],key[2],value[2]);

        System.out.println("################33333333333333333333333##########");
        printitall();

    }
    public static void printitall() {
        for (int i = 0; i < u1.length; i++) {
            System.out.print(convertDecimalToFraction(u1[i])+" ");
            System.out.print(convertDecimalToFraction(u2[i])+" ");
            System.out.print(convertDecimalToFraction(u3[i])+" ");
            System.out.print(convertDecimalToFraction(s1[i])+" ");
            System.out.print(convertDecimalToFraction(s2[i])+" ");
            System.out.print(convertDecimalToFraction(s3[i])+" ");
            System.out.print(convertDecimalToFraction(b[i])+"  ");
            System.out.println("");
        }
    }

    private static void transformation(int target, int c, int key, double value) {
        System.out.println("***************************************");
        u1[target]= (c*u1[target]+u1[key]*value);
        u2[target]= (c*u2[target]+u2[key]*value);
        u3[target]= (c*u3[target]+u3[key]*value);
        s1[target]= (c*s1[target]+s1[key]*value);
        s2[target]= (c*s2[target]+s2[key]*value);
        s3[target]= (c*s3[target]+s3[key]*value);
        b[target]= (c*b[target]+b[key]*value);
        System.out.println("tally");

//        System.out.print(convertDecimalToFraction(u1[target])+" ");
//        System.out.print(convertDecimalToFraction(u2[target])+" ");
//        System.out.print(convertDecimalToFraction(u3[target])+" ");
//        System.out.print(convertDecimalToFraction(s1[target])+" ");
//        System.out.print(convertDecimalToFraction(s2[target])+" ");
//        System.out.print(convertDecimalToFraction(s3[target])+" ");


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