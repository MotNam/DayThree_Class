
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Main {
/*
Create a program that reads from standard input a string and prints
the count of the words that starts with a vowel.
Skipping all the words that don’t start with a vowel and print it as an error. (edited)
 */

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phrase");


        String phrase = input.nextLine().toLowerCase();
        String[] eachWord = phrase.split(" ");
        int count = 0;

        char vowel1 = 'a';
        char vowel2 = 'e';
        char vowel3 = 'i';
        char vowel4 = 'o';
        char vowel5 = 'u';
        for (int i = 0; i < eachWord.length; i++) {
            char firstChar = eachWord[i].charAt(0);
            if (firstChar == vowel1 || firstChar == vowel2 || firstChar == vowel3 || firstChar == vowel4 ||
                    firstChar == vowel5) {
                count++;
            } else {
                System.err.println(eachWord[i] + "  does not start with a vowel");
            }
        }
        System.out.println("Total words starting with vowel: " + count);

      /*  System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Please enter your surname");
        String surname = input.nextLine();

        System.out.println("Please enter your age");
        int age = input.nextInt();
        while (age <= 0 || age > 130) {
            System.err.println("Age is incorrect, input age");
            age = input.nextInt();
        }

        if (age > 18) {
            System.out.println("Welcome " + name + " " + surname + ", your age is " + age);
        } else {
            System.out.println("Access not allowed");
        }*/

        System.out.println("=====Day_3 Filewriter excercise======\n");

        //Create a program who reads the file called oscar_age_female.csv who have this columns
        // Index, Year, Age, Name, Movie in format csv read it print it in a
        // new file called result.txt in the following format.


        File file = new File("oscar_age_female.csv");
        FileWriter fileWriter = new FileWriter("result.txt", false);
        Scanner reader = new Scanner(file);

        reader.nextLine();

        while (reader.hasNextLine()) {
            String oscarsList = reader.nextLine();
            String[] eachLineWord = oscarsList.split(",");
            fileWriter.write("Name: " + eachLineWord[3] + "\n");
            fileWriter.write("Year: " + eachLineWord[1] + "\n");
            fileWriter.write("Age: " + eachLineWord[2] + "\n");
            fileWriter.write("Movie: " + eachLineWord[4] + "\n");
            fileWriter.write("=======================");


            /* System.out.println("Movie: " + eachLineWord[4]);
            System.out.println("Year: " + eachLineWord[1]);
            System.out.println("=============");*/

        }
        fileWriter.close();


    }

}

