package src.com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.TreeSet;

public class AnalyticsCounter {
	public static TreeSet<disease_count> liste_maladie_compte= new TreeSet<disease_count>();
	public static TreeSet<String> liste_maladie = new TreeSet<String>();
	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();
		disease_count dc = null;
		int count = 0;
		
		while (line != null) {
			if (liste_maladie.contains(line)){
				Iterator<disease_count> itr=liste_maladie_compte.iterator();  
				while(itr.hasNext()){
					 	dc = itr.next();
					   if (dc.name.equals(line)){
						   count = dc.nombre;
						   liste_maladie_compte.remove(dc);
						   liste_maladie_compte.add(new disease_count(line, count+1));
						   break;
					  }
				}
			
			
				}
			 				
			 else
			{
				liste_maladie.add(line);
				liste_maladie_compte.add(new disease_count(line, 1));
			}
		
			line = reader.readLine();
		}
		
		FileWriter writer = new FileWriter ("result.out");
		Iterator<disease_count> itr=liste_maladie_compte.iterator();  
		while(itr.hasNext()){
			 	dc = itr.next();
			 	writer.write(dc.name+" "+dc.nombre+ "\n");
			   System.out.println(dc.name+" "+dc.nombre);
			  
				
				
				
				   
			   }
		writer.close();}
	
	
	}

