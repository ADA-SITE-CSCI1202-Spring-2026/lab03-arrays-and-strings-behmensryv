public class ExplodedString{

    
    public static String explodeString(String text) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            
            
            for (int j = 0; j <= i; j++) {
                result.append(text.charAt(j));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String word = "Baku";
        String exploded = explodeString(word);

        System.out.println("Original: " + word);
        System.out.println("Exploded: " + exploded);
    }
}
