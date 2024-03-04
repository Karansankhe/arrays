public class Sum {
    public static void main(String[] args){
        int[] my_arry = {1,2,3,5,6,7,7,7,8,8,8};


        int sum = 0;

        for(int i:my_arry)
        sum = sum + i;

        System.err.println("sum"+sum);
    }
}
