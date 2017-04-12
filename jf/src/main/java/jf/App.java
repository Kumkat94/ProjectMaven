package jf;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.apache.commons.collections.CollectionUtils;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;


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
		        CSVWriter writer= new CSVWriter(new FileWriter("data-filtered.csv"));
			        for(String[] line: myEntries){
	
			        	List<String> Liste =Arrays.asList(line);
			        	Vector<String> out = new Vector<String>();
			        	CollectionUtils.select(Liste, new MonPredicat(), out);
			        	System.out.println("OUT:" + out);
			        	
			        	String[] aEcrire = out.toArray(new String[0]);
			        	writer.writeNext(aEcrire);
			        	
			        	for(String val: Liste){
			        		
			        			monmax=max(monmax,Integer.parseInt(val));
			        	}
			        }
			   reader.close();
			   writer.close();
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