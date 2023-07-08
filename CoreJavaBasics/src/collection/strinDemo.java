package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class strinDemo {

	

	

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        
	        Scanner input = new Scanner(System.in);
	        int numberLine= input.nextInt();
	        
	        List<Integer> list= new LinkedList<>();
	        for (int i=0;i<numberLine;i++){
	            list.add(input.nextInt());
	        }
	        int numberQuery= input.nextInt();
	   
	        for (int i=0; i<numberQuery;i++){
	           
	            String typeQuery=input.next();
	           
	            if (typeQuery.equalsIgnoreCase("Delete")){
	             
	                int x= input.nextInt();
	                int index=x-1;
	               
	                if(index<list.size()&& index>=0){
	                    System.out.println(list);
	                list.remove((index));
	                  
	                }
	                 }
	                 else if(typeQuery.equalsIgnoreCase("Insert")){
	                    int z= input.nextInt();
	                    int y=input.nextInt();
	                   
	                    int indexX=z-1;
	                     if(indexX<list.size()&& indexX>0){
	                     list.add(indexX,y); 
	                    }
	                 
	            }
	             
	        }
	     System.out.println(list);
	    }
}