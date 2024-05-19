import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) { // finally בלוק
        int[] arr = {1,2,3};
        System.out.println("Enter index for check in the arr --->");
        int index = s.nextInt();
        System.out.println("Is " + index +" valid index? " + isValidIndex(arr,index));
    }
    public static boolean isValidIndex(int[] arr,int index){
        try {
            int temp = arr[index];
            return true;
        }catch (IndexOutOfBoundsException e){
            System.out.println("The Index Out of boundx");
            return false;
        }
        finally {
            System.out.println("Exiting function.");
        }
    }

    public static Scanner s = new Scanner(System.in);
}
