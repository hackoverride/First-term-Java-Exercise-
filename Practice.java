import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
import java.io.*; //inneholder File, FileWriter og PrintWriter.
import java.util.*; //inneholder Scanner

/* cast automatically:
* byte -> short -> char -> int -> long -> float -> double
* cast manually:
* double -> float -> long -> int -> char -> short -> byte 
*/

public class Practice{
  
  public static void main(String[] args){
    System.out.println("Practice");
    
    String innput = showInputDialog("Anngi filnavn");
    showMessageDialog(null, "filbehandling ferdig, ok!");
    
    
  }
  
  
  //EZgraphics metoder:
  const int WIDTH = 400;
  const int HEIGHT = WIDTH;
  makeWindow("tittel", WIDTH, HEIGHT);
  drawRectangle(startX, startY, lengdeX, lengdeY);
  fillRectangle(startX, startY, lengdeX, lengdeY);
  drawCircle(plassX, plassY, radius); //plasser midt-punktet
  setFont("Arial", 20);
  drawString("teksten", posX, posY);
  setColor(255,255,255); // setter fargen
  drawLine(posX, posY, endX, endY); //setter en linje.
  
  
  
  public static int antallPositiveTall(int[] tab){
      int antall = 0;
      for ( int i = 0; i < tab.length; i++ ){
        if ( tab[i] > 0 ){
          antall++;
        }
        return antall;
      }
    }
  
  public static int[] leggTil(int[] samling){
    int[] temp = new int[samling.length+1];
    for ( int i = 0; i < samling.length; i++ ){
      if ( i < samling.length ) {
      temp[i] = samling[i];} else {temp[i] = 0;}
      
    }
    return temp;
  }
  
  
  


}
