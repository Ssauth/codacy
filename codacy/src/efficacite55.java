
public class efficacite55 {

    // Encoder une chaîne avec RLE
    public static String RLE(String in) {
        if (in == null || in.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char prevChar = in.charAt(0);
        int count = 1;

        for (int i = 1; i < in.length(); i++) {
            char currChar = in.charAt(i);
            if (currChar == prevChar) {
                count++;
                if (count == 10) {  // Séparer le compteur si il dépasse 9
                    result.append(9).append(prevChar);
                    count = 1;
                }
            } else {
                result.append(count).append(prevChar);
                prevChar = currChar;
                count = 1;
            }
        }
        result.append(count).append(prevChar);

        return result.toString();
    }

}