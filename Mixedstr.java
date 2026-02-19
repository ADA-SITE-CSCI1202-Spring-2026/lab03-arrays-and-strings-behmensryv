public class Mixedstr {

    public static String swapFirstLast(String sentence) {

        String[] words = sentence.split(" ");  

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (word.length() > 1) {

                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);

                String middle = word.substring(1, word.length() - 1);

                result.append(last)
                      .append(middle)
                      .append(first);

            } else {
                
                result.append(word);
            }

            result.append(" ");
        }

        return result.toString().trim(); 
    }

    public static void main(String[] args) {

        String input = "This is PP2 Fall 2021";
        String output = swapFirstLast(input);

        System.out.println("In : " + input);
        System.out.println("Out: " + output);
    }
}
