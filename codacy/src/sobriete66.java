
public class sobriete66 {

    public static String RLE(String in) {
        StringBuilder out = new StringBuilder("");
        int nbrLettres = 1;
        int taille = in.length();
        for (int i = 0; i < taille; i++) {
            if (i == taille - 1) {
                out.append(nbrLettres).append(in.charAt(i));
            } else if (in.charAt(i) != in.charAt(i + 1) || nbrLettres == 9) {
                out.append(nbrLettres).append(in.charAt(i));
                nbrLettres = 1;
            } else {
                nbrLettres++;
            }
        }
        return out.toString();
    }

}
