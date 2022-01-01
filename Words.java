
import java.util.*;
import javax.swing.JOptionPane;
public class Words {
 private ArrayList<String> wordle ;
   public Words(){
      wordle = new ArrayList<String>();
      }
   public void addWord(String str){
      wordle.add(str);
      }
      public void addWords(int num){
         for(int i = 0; i<num; i++){
  
            String str = JOptionPane.showInputDialog("Enter a word: ");
            addWord(str);
            }
         }
         
         public void display(){
            System.out.println(wordle);
            }
            
            public boolean removeWord(int index){
               if(index > -1 && index < wordle.size()){
                  wordle.remove(index);
                   return true;
                  }
                  else{
                    return false;
                    }
               }
               
               public int search (String str){
               int position = -1;
               for (String s: wordle){
                  if(str.equalsIgnoreCase(s)){
                     position = wordle.indexOf(s);
                     }
                  }
                  return position;
               }
               
               public void removeEveryOther(){
                   double size = Math.ceil(wordle.size()/2);
                
                  for(int count = 0; count < (int) size; count++){
                    wordle.remove(count);
                    }
                  
                  }
  public static void main(String[] args) {
      Words stuff = new Words();
      stuff.addWord("Louie");
      stuff.addWord(" the ");
      stuff.addWord("Laker");
      stuff.removeEveryOther();
      stuff.display();
      System.out.println(stuff.search("Pear"));
      
   }
}


