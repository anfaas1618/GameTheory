import java.util.Arrays;
import java.util.Scanner;

public class ShapelyValue {
    public static String[] testcases = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    public static String[] combimatrix;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total_elements = sc.nextInt();
        int[] arr = new int[total_elements];
        for (int i = 0; i < total_elements; i++) {
            arr[i] = i + 1;
        }
        System.out.println("arr is");
        Arrays.stream(arr).forEach(s -> System.out.println(s));
        int r = 2;
        int[] elements = new int[total_elements];
        combimatrix = new String[20];
        printCombination(arr, arr.length, r);
        String[] combi = MakeCombi(total_elements, true);
        int realCount = 0;
        for (int i = 0; i < combi.length; i++) {
            if (combi[i] != null) {
                realCount++;
            }
        }
        int[] inputs = new int[realCount + 1];
        for (int i = 0; i < inputs.length - 1; i++) {
            System.out.println("enter value for :" + combi[i]);
            inputs[i] = sc.nextInt();
        }
        System.out.println("enter the abc or abcd total value");
        inputs[realCount] = sc.nextInt();
        int total = inputs[realCount];
        System.out.println(Arrays.toString(inputs));
        combimatrix = new String[20];

        int a1, b1, c1;
        a1 = inputs[0];
        b1 = inputs[6] - a1;
        if (b1 > inputs[1])
            b1 = inputs[1];
        c1 = inputs[6] - (a1 + b1);
        if (c1 > inputs[2])
            System.out.println("error cannot solve further");
        System.out.println("ABC= (" + a1 + "," + b1 + "," + c1 + ")");
        int a2, b2, c2;
        a2 = inputs[0];
        c2 = inputs[6] - a2;
        if (c2 > inputs[1])
            c2 = inputs[2];
        b2 = inputs[6] - (a2 + c2);
        if (b2 > inputs[1])
            System.out.println("error cannot solve further");
        System.out.println("ABC= (" + a2 + "," + b2 + "," + c2 + ")");
        int a3, b3, c3;
        b3 = inputs[1];
        c3 = inputs[6] - b3;
        if (c3 > inputs[1])
            c3 = inputs[2];
        a3 = inputs[6] - (b3 + c3);
        if (a3 > inputs[0])
            System.out.println("error cannot solve further");
        System.out.println("ABC= (" + a3 + "," + b3 + "," + c3 + ")");
        int a4, b4, c4;
        b4 = inputs[1];
        a4 = inputs[6] - b4;
        if (a4 > inputs[1])
            a4 = inputs[0];
        c4 = inputs[6] - (b4 + a4);
        if (c4 > inputs[2])
            System.out.println("error cannot solve further");
        System.out.println("ABC= (" + a4 + "," + b4 + "," + c4 + ")");
        int a5, b5, c5;
        c5 = inputs[2];
        a5 = inputs[6] - c5;
        if (a5 > inputs[1])
            a5 = inputs[0];
        b5 = inputs[6] - (c5 + a5);
        if (b5 > inputs[1])
            System.out.println("error cannot solve further");
        System.out.println("ABC= (" + a5 + "," + b5 + "," + c5 + ")");
        int a6, b6, c6;
        c6 = inputs[2];
        b6 = inputs[6] - c6;
        if (b6 > inputs[1])
            b6 = inputs[1];
        a6 = inputs[6] - (c6 + b6);
        if (a6 > inputs[0])
            System.out.println("error cannot solve further");
        System.out.println("ABC= (" + a6 + "," + b6 + "," + c6 + ")");

        double sum_for_a= a1+a2+a3+a4+a5+a6;
        double ansfora=sum_for_a/6;
        double sum_for_b= b1+b2+b3+b4+b5+b6;
        double ansforb=sum_for_b/6;
        double sum_for_c= c1+c2+c3+c4+c5+c6;
        double ansforc=sum_for_c/6;
        System.out.println("a="+ansfora);
        System.out.println("b="+ansforb);
        System.out.println("c="+ansforc);
        System.out.println("**********************************");
        int aa1, bb1, cc1;
        aa1 = inputs[0];
        b1 = inputs[3] - a1;
        if (b1 > inputs[1])
            b1 = inputs[1];
        c1 = inputs[6] - (a1 + b1);
        if (c1 > inputs[2])
            System.out.println("error cannot solve further");
        System.out.println("ABC= (" + a1 + "," + b1 + "," + c1 + ")");
    }
    private static int findfact(int total_elements) {
        int fact = 1;
        for (int i = 1; i <= total_elements; i++) {
            fact=fact*i;
        }
        return  fact;
    }
    private static String[] MakeCombi(int total_elements, boolean containpairs) {
       int itteration=findfact(total_elements);

        String[] combi=new String[itteration];
        int c=0;
        for (int i = 0; i < itteration; i++) {
        if (i<total_elements) {
            combi[i] = testcases[i];
            System.out.println(combi[i]);
        }
        else if (combimatrix[c]!=null){
           String combi_with = combi[i - total_elements ];
            System.out.println("enter value for "+combimatrix[c]);
            combi[i]=combimatrix[c];
            c++;
        }
        }
return combi;
    }
    /* arr[]  ---> Input Array
   data[] ---> Temporary array to store current combination
   start & end ---> Staring and Ending indexes in arr[]
   index  ---> Current index in data[]
   r ---> Size of a combination to be printed */
  static   int count=0;
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it

        if (index == r)
        {
            int reset=0;
            StringBuilder s= new StringBuilder();
            for (int j=0; j<r; j++) {
                if (reset!=2) {
                    System.out.print(testcases[data[j] - 1] + " ");
                    s.append(testcases[data[j] - 1]);
                    reset++;
                }

            }

            combimatrix[count]=s.toString();
            System.out.println("at combi:"+combimatrix[count]+" at pos"+count);
            count++;
            System.out.println("");
            return ;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];

            combinationUtil(arr, data, i+1, end, index+1, r);

        }

    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        Arrays.stream(arr).sorted();

        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
}
