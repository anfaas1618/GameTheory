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
        System.out.println("**********************************************************");


    }
}
