import java.util.Scanner;
 
public class Task10 {
        
    public static int  []A = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static String []R = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
    
    public static String ArabicToRom(int num){
        int i = 12;
        String result = "";
        while (num > 0) {
            while (A[i] > num){
                i--;
            }
            result += R[i];
            num -= A[i];
            
        }
        return result;
    }
    
    public static void main(String[] args) {
        int number; 
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        String romanNumber = ArabicToRom(number);
        System.out.println(romanNumber);
    }
}