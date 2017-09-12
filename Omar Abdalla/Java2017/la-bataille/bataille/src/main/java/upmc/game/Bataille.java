package upmc.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Bataille
{
  public static void main(String[] args)
  {
    System.out.println("C'est le jeu de la bataille!\n");
    System.out.print("Veuillez entrer un choix : ");
    System.out.flush();
    Scanner console = new Scanner(System.in);
    String choice = console.nextLine();
    System.out.println("\nL'utilisateur a choisi : \"" + choice + "\"");
    System.out.println("C'est terminé :-(\n\nIl n'y a pas beaucoup de fonctionnalités...");
    
    
    
   /* ArrayList<Carte> tasDeCartes=new ArrayList();
 
    for(int i=0;i<tasDeCartes.size();i++){
        
        tasDeCartes.add(new Carte("bleu", 2));
     */   
      Carte unecarte=new Carte("rouge", 2);
      System.out.println(unecarte);
  
    }
  
}
