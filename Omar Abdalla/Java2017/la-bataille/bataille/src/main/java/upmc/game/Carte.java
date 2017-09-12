package upmc.game;

import java.util.ArrayList;

public class Carte {
    
    private  String couleur;
    private int valeur;

    
    
    
    ArrayList<Carte> tasDeCartes=new ArrayList();
 
   // for(int i=0;i<tasDeCartes.size();i++){
        
     //   tasDeCartes.add(new Carte("bleu", 2));
       
    
    //}
    public Carte(String couleur, int valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

       
   
    public String toString() {
        return "Carte{" + "couleur=" + couleur + ", valeur=" + valeur + '}';
    }
    
}
