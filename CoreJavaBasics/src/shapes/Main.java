package shapes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String args[]) {
  
            List<String> tvShows= new ArrayList<>();
            
            tvShows.add("Breaking Bad");
            tvShows.add("Friends");
            tvShows.add("Breaking Bad");
            tvShows.add("Breaking Bad");
            tvShows.add("Breaking Bad");
            tvShows.add("Breaking Bad");
            tvShows.add("Breaking Bad");
            tvShows.add("Breaking Bad");
            
            Iterator<String> tv=tvShows.iterator();

            while(tv.hasNext()){
            	
            if(tv.next().equals("Friends")) {
            	   do {
            	System.out.println(tv.next());
            	   } while(tv.hasNext());
            }
        }
            
        	
    }
    }
