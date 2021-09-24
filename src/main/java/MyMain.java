import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MyMain {


    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] res = new int[arr.length];
        int x = 0;
        for(int i=arr.length-1; i>=0; i--) {
            res[x]=arr[i];
            x++;
        }
        return res;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};
        for(String dict : dictionary) {
            if(dict.equalsIgnoreCase(word)) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("What method?");
        String in = Scan.nextLine();
        while(!(in.equals("spellCheck") || in.equals("secondLargest") || in.equals("reverse"))) {
            System.out.println("Invalid method, say \"spellCheck\", \"secondLargest\", or \"reverse\".");
            in = Scan.nextLine();
        }
        if(in.equals("spellCheck")) {
            System.out.println("Enter a word from my dictionary.");
            if(spellCheck(Scan.nextLine())) System.out.println("Your word is spelled correctly. Good job.");
            else System.out.println("Your word is not spelled correctly.");
        }
        if(in.equals("secondLargest")) {
            System.out.println("How many numbers do you want to compare?");
            int[] nums = new int[Scan.nextInt()];
            for(int i=0; i<nums.length; i++) {
                System.out.println("Please enter element " + i + ".");
                nums[i] = Scan.nextInt();
            }
            System.out.println("The second largest input was " + secondLargest(nums) + ".");
        }
        if(in.equals("reverse")) {
            System.out.println("How many numbers would you like to input?");
            int[] nums = new int[Scan.nextInt()];
            int numIn;
            for(int i=0; i<nums.length; i++) {
                System.out.println("Please enter element " + i + ".");
                numIn = Scan.nextInt();
                nums[i] = numIn;
            }
            System.out.println("Your inputs in reversed inputted order are:");
            System.out.println(Arrays.toString(reverse(nums)));
        }
        System.out.println("Goodbye.");
    }
}
