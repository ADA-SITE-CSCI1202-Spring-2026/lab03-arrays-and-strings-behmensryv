import java.util.Arrays;

public class SortingStr {

    
    public static String sortString(String text) {

        char[] chars = text.toCharArray();  

        Arrays.sort(chars);                 
        return new String(chars);           
    }

    public static void main(String[] args) {

        String word = "baku";
        String sorted = sortString(word);

        System.out.println("Original: " + word);
        System.out.println("Sorted: " + sorted);
    }
}
