import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int [][]  payoff=new
                int[][]{{20,15,12,35},
                        {25,14,8,10},
                        {40,2,10,5},
                        {-5,4,11,0}};
        int[] RowPosAndMin=RowPos(payoff,"row");
        int [][] columnpayoff= tranposematrix(payoff);
        int[] ColumnPosAndMin=RowPos(columnpayoff,"column");
        System.out.println("The row min is  "+RowPosAndMin[0]+" and at pos "+RowPosAndMin[1]);
        System.out.println("The column min is  "+ColumnPosAndMin[0]+" and at pos "+ColumnPosAndMin[1]);

        System.out.println();
        if (RowPosAndMin[0]==ColumnPosAndMin[0])
        {
            System.out.println("yay you found saddle point at ("+RowPosAndMin[1]+","+ColumnPosAndMin[1]+")");
            System.out.println("Game Value is "+payoff[RowPosAndMin[1]][ColumnPosAndMin[1]]);
        }


    }

    private static int[][] tranposematrix(int[][] payoff) {
        int transpose[][]=new int[payoff.length][payoff.length];
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose.length;j++){
                transpose[i][j]=payoff[j][i];
            }
        }
        return  transpose;
    }

    private static int[] RowPos(int[][] payoff,String side) {

        int[] fetcher = new int[payoff.length];
        int[] row=new int[2];
        for (int i = 0; i < payoff.length; i++) {
            int minmax = payoff[i][0];
            for (int j = 0; j < payoff.length; j++) {

                if (payoff[i][j] < minmax && side=="row") {
                    minmax=payoff[i][j];
                }
                if (payoff[i][j] > minmax && side=="column") {
                    minmax=payoff[i][j];
                }
            }
            fetcher[i]=minmax ;
        }
        var ref = new Object() {
            int maxmin = fetcher[0];
            int count =0;
        };
        Arrays.stream(fetcher).sequential().forEach(s->
        {
            if (s > ref.maxmin && side.equals("row")) {
                ref.maxmin =s;
                ref.count++;
            }
            if (s < ref.maxmin && side.equals("column")) {
                ref.maxmin =s;
                ref.count++;
            }
        });
        row[0]=ref.maxmin;
        row[1]=ref.count;
        return  row;
    }

}
