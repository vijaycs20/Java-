import java.util.*;

//A program that counts words in a document, printing the most frequent.

class Main{
  public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in).useDelimiter("[^a-zA-Z]+");
    Map<String, Integer> map = new HashMap<>();
    
    while(scan.hasNext()){
      String word = scan.next().toLowerCase();
      Integer count = map.get(word);
      if(count == null)
        count = 0;
      map.put(word,count+1);
    }
    
    int max_count = 0;
    String word = "";
    for(Map.Entry<String,Integer> ent:map.entrySet())
      if(ent.getValue()>max_count){
        max_count = ent.getValue();
        word = ent.getKey();
      }
    
    System.out.println("Word : "+word+" | Frequency : "+max_count);
  }
}
