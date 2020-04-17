import java.util.Arrays;
import java.util.Scanner;
/*
* create an array that can hold 10 words
* create a string data type with a value(temp)
* open a "for" loop and write conditions, that the array is equal to 10 should not exceed 10
* Ask the user to enter words ten times
* create another "for" loop and print out the orginal order of array with the specific condition
* create a "for" loop and write conditions
* If the original order of the array is greater than 0 compare to the condition we wrote in the "for"loop
* we compare the array order if is greater than 0
* print in ascending order from lower number to the larger
* create "for" loop and write a condition if the arrays start with the vowel
* print out array that starts with the vowel
* */

public class dictionaryword {
    public static void main(String[] args) {
        //create array
        String words[] = new String[10];
        String temp;

        Scanner input = new Scanner(System.in);

        //for loop
        for (int x = 0; x < words.length; x++) {
            System.out.println("Enter 10 words: ");
            words[x] = input.nextLine();

        }
        System.out.println("Original Order: ");
        for (int x=0; x<words.length; x++){
            System.out.print(words[x] + " ");
        }
        System.out.println();
        for(int x=0; x<words.length; x++){
            for(int y=x+1; y<words.length; y++){
                if(words[x].compareToIgnoreCase(words[y]) > 0){
                    temp = words[x];
                    words[x]=words[y];
                    words[y]=temp;
                }
            }
        }
        System.out.println("Alphabetic order: ");
        for (int x=0; x<words.length; x++){
            System.out.print(words[x] + " ");
        }
        System.out.println();
        for(int x=0; x<words.length; x++){
            for(int y=x+1; y<words.length; y++){
                if(words[x].compareToIgnoreCase(words[y]) < 0){
                    temp = words[x];
                    words[x]=words[y];
                    words[y]=temp;
                }
            }
        }
        //write the array in reverse order
        System.out.println("Reverse alphabetical order: ");
        for (int x=0; x<words.length; x++){
            System.out.print(words[x] + " ");
        }
        //checking words that start with vowel
        System.out.println();
        System.out.println("Words that starts with a vowel: ");
        for(int x=0; x<words.length; x++){
            if(words[x].charAt(0) == 'a' || words[x].charAt(0) == 'A' ||
                    words[x].charAt(0) == 'e'|| words[x].charAt(0) == 'E' ||
                    words[x].charAt(0)=='i'|| words[x].charAt(0) == 'I' ||
                    words[x].charAt(0) == 'o' || words[x].charAt(0) == 'O' ||
                    words[x].charAt(0) == 'u' || words[x].charAt(0) == 'U'){
                System.out.print(words[x] + " ");

            }
        }

    }
}
