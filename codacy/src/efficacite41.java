


public class efficacite41{
    public static String RLE(String in){
        if (in.isEmpty() || in == null)
            return "";

        int length, i, ctChar;
        char currentChar, chars[]; 
        
        
        StringBuilder out = new StringBuilder();

        chars = in.toCharArray();
        length = chars.length;
        currentChar = chars[0]; 
        ctChar = 1; // Compte le nombre d'une lettre
        

        for ( i = 1 ; i < length ; i++ ){
            if ( currentChar != in.charAt(i) || ctChar >= 9 ){
                out.append(ctChar).append(currentChar);
                currentChar = chars[i];
                ctChar = 1;
            } else{
                ctChar++;
            }
        }
        out.append(ctChar).append(currentChar);
        return out.toString();
    }


}

