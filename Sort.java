import java.util.Arrays;

public class Sort{
    public static void main(String[] args){
        String[] myString ={
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };


        //print the original string
        System.out.println("original string"+Arrays.toString(myString));
        Arrays.sort(myString);
        System.out.println("new string"+Arrays.toString(myString));
    }
}

//     public static void main(String[] args){
      
//          //declaring the integer array
//          int[] my_array1 ={
//             1,7,3,9,9,9
//          };


//     //print the original numeric array
//     System.out.println("original array:"+ Arrays.toString(my_array1));     

//     Arrays.sort(my_array1);

//     //Print the sorted numeric array
//     System.out.println("sorted array:"+ Arrays.toString(my_array1));     

//     }
// }