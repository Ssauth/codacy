

public class efficacite62{


    public static String RLE(String in){
        // Initialisation de la variable de longueur et de compteur des charactères
        int len=in.length(), cpt=0;

        // Si le String passé en paramêtre est vide
        if(len==0){
            // On retourne un String vide
            return "";
        }

        // On itialise un Objet StringBuilder classe optimisée semblable à String
        // On initialise sa longueur à la longueur du String plutôt que la longueur par défault(16) pour éviter une perte de 
        // temps lors de l'ajout de charactères 
        StringBuilder str=new StringBuilder(len);
        // On initialise la variable du charactère que l'on compte actuellement
		char lastChar=in.charAt(0);
        // Puis une variable pour le charactère actuel lorsque l'on parcours le String
        char charAt;

        // On parcours le String
		for(int i=0;i<len;i++) {

            // On sauvegarde le charactère actuel
			charAt=in.charAt(i);

            // Si ce dernier est différent du précédent ou si le compteur atteint 9 
			if(lastChar!=charAt || cpt>=9) {

                // On ajoute le charactère précédé par son nombre d'apparition
                str.append(cpt);
                str.append(lastChar);

                // On mémorise le nouveau charactère
                lastChar=charAt;
                // Et l'on réinitialise le compteur
                cpt=0;
            }

            // Dans tous les cas l'on incrémente le compteur
            cpt++;
		}

        // On sauvegarde le dernier charactère et son nombre d'apparition qui n'est pas traité par le code précédent
        str.append(cpt);
        str.append(lastChar);
        
        // Enfin l'on convertit le StringBuilder en String
		return new String(str);
    }


}

