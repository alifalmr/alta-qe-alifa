import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kata civic adalah palindrome: "+palindrome("civic"));
        System.out.println("Kata kasur rusak adalah palindrome: "+palindrome("kasur rusak"));
        System.out.println("Kata kupu-kupu adalah palindrome: "+palindrome("kupu-kupu"));
        System.out.println("Kata singa adalah palindrome: "+palindrome("singa"));
        System.out.print("Masukkan kata lain: ");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        System.out.println("Kata "+value+" adalah palindrome: " + palindrome(value));
    }

    private static boolean palindrome(String value){
        int comparison = 0;
        boolean result = false;

        char[] parsing = value.toCharArray();
        String reversedString = new StringBuffer(value).reverse().toString();
        char[] reverseChar = reversedString.toCharArray();

        for(int i=0; i<parsing.length; i++){
            if(parsing[i] == reverseChar[i]){
                comparison++;
            }
        }

        if(comparison == parsing.length){
            result = true;
        }
        return result;
    }
}