package Repils;

public class Task77 {

    /*
    Create an array of integers that will store 5 elements taken from a user
    Don't print any prompt message for the user
    Then print out all the elements you have created in the first loop in reverse
    order.
    Example:
    Input:
    1
    2
    3
    4
    5
    Output:
    5
    4
    3
    2
    1
     */
/* the way teacher solved this task
public class Problem_077 {
    public static void main(String[]args){
        int []array=new int[5];
        Scanner scan=new Scanner(System.in);
        for( int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        for(int i= array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
    }
}
 */


        public static void main(String[] args){

            int [] Array = {1,2,3,4,5};


            System.out.println("Input:");
            for(int i=Array.length-1; i>=0; i--)
                System.out.println(Array[i] + "  ");
        }
    }







