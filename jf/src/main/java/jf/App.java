package jf;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int max(int a,int b){
		return a>b?a:b;
		//return a; // Le stagiaire est passe par la
	}
	public static void main( String[] args )
    {  	
    	
    	int result;
    	System.out.println( "Hello World!" );
        System.out.println("Je test ma classe App");
        result=max(4,5);
        System.out.println("Resultat de ma fonction Max: "+result);
       
        int monmax=0;

        try{
        	CSVReader reader = new CSVReader(new FileReader("data.csv"));
        
	        try{	
		        List<String[]> myEntries=reader.readAll();

			        for(String[] line: myEntries){
			        	for(String val: line){
			        		
			        			monmax=max(monmax,Integer.parseInt(val));
			        	}
			        }
		        }
		        catch(IOException e){
		        	System.out.println("Problème readAll()");
		        }
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
        System.out.println("Le Max est:"+monmax);
    }
	
}