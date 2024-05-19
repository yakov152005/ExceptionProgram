import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {// קליטת קלט כל עוד הוא תקין
    public static void main(String[] args) {
        int size = 0;
        boolean ifNumOk = false;

        while (!ifNumOk){
            try {
                System.out.println("Enter number of elements: ");
                size = s.nextInt();
                if (size < 0 ){
                    throw  new Exception("Size must be positive..");
                }
                ifNumOk = true;
            }catch (InputMismatchException e ){
                System.out.println("You were asked to enter a number..");
                s.next(); //לנקות את הקלט
            }
            catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        int[] arr = new int[size];
        ifNumOk = false;
        while (!ifNumOk){
            try {
                System.out.println("Enter a " + size + " numbers --->");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = s.nextInt();
                }
                ifNumOk = true;
            }catch (InputMismatchException e){
                System.out.println("You were asked to enter a number..");
                s.next();
            }
        }
        System.out.println("The numbers: " + Arrays.toString(arr));
    }
    public static Scanner s = new Scanner(System.in);
}
