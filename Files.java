import java.io.*;
import java.util.*;

public class Files{
  
  String filename = "readme.txt";
  public Files(String s){
    this.filename = s;
  
  }
  
  public writeOver(String s){
  try{
    PrintWriter printed = new PrintWriter(filename);
    //printed.write(s);
    printed.print(s);
    printed.close();
    } catch (Exception e){
    System.err.print(e);
    }
  }
  
  public String readFile(){
    try{
      String temp = "";
      Scanner les = new Scanner(new File(filname));
      while (les.hasNextLine()){
        temp += les.nextLine();
        if(les.hasNextLine()){temp += "\n"}
       }
    }catch (Exception e){System.err.print(e);}
    return temp;
  }
  
}
