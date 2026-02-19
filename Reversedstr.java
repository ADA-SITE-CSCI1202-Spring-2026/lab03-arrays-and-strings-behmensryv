public class Reversedstr {

    
    public static String reverseString(String text) {

        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));  
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        String word = "bahman";
        String result = reverseString(word);

        System.out.println("Original: " + word);
        System.out.println("Reversed: " + result);
    }
}
