package exercises;
import java.util.Scanner;
public class StringSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A SEARCH TERM: ");
        String searchTerm = input.next();
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        boolean contains = firstSentence.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println(contains);

        if (contains) {
            int index = firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            int length = searchTerm.length();
            String editedFirstHalf = firstSentence.substring(0, index);
            String editedSecondHalf = firstSentence.substring(index + length);
            String finalString = editedFirstHalf + editedSecondHalf;
            System.out.println(finalString);
        }
    }

}
