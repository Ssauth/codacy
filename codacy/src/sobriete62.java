

//mange ton /2

public class sobriete62{

    // Méthode pour effectuer une compression RLE simple
    public static String RLE(String in){
        String str="";
        char lastChar=in.charAt(0); // Premier caractère de la chaîne
        int cpt=0; // Compteur pour le nombre de répétitions

        // Parcourt chaque caractère de la chaîne d'entrée
        for(int i=0;i<in.length ();i++) {
            // Si le caractère actuel est différent du précédent ou si le compteur atteint 9
            if(lastChar!=in.charAt(i) || cpt>=9) {
                str+=cpt+"" +lastChar; // Ajoute le compteur et le caractère au résultat
                lastChar=in.charAt(i); // Met à jour le dernier caractère
                cpt=0; // Réinitialise le compteur
            }
            cpt++;
        }
        str+=cpt+"" +lastChar; // Ajoute le dernier groupe de caractères au résultat
        return str;
    }


}
