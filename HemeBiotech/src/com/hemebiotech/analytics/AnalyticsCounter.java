package src.com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * @author hraza
 *Utilisation de deux TreeSet permettant le tri automatique suivant la méthode de la classe disease_count
 *liste symptome pour déterminer si le symptome a déjà été pris en compte
 *liste symptome occurence pour compter le nombre d'apparition de ce symptôme
 */
public class AnalyticsCounter {
	public static TreeSet<disease_count> liste_symptome_occurence= new TreeSet<disease_count>();
	public static TreeSet<String> liste_symptome = new TreeSet<String>();
	public static void main(String args[]) throws Exception {
	BufferedReader reader = null;
	String line ="";
		try{
			reader = new BufferedReader (new FileReader("symptoms.txt"));
		
		}catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		try {
		line = reader.readLine();
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		disease_count dc = null;
		int count = 0;
		
		while (line != null) {
			if (liste_symptome.contains(line)){
				Iterator<disease_count> itr=liste_symptome_occurence.iterator();  
				while(itr.hasNext()){
					 	dc = itr.next();
					 	/**
					 	 * on recherche si le symptôme est déjà pris en compte dans la liste symptôme si non on l'ajoute dans la liste
					 	 * symptome et on ajoute un objet disease_count(line,1) dans la liste symptôme occurence
					 	 * si oui on le retire de la liste symptôme occurence et on ajoute un objet disease_count(line, count+1)
					 	 *  dans la liste symptôme occurence
					 	 * 
					 	 */
					   if (dc.name.equals(line)){
						   count = dc.nombre;
						   liste_symptome_occurence.remove(dc);
						   liste_symptome_occurence.add(new disease_count(line, count+1));
						   break;
					  }
				}
			
			
				}
			 				
			 else
			{
				liste_symptome.add(line);
				liste_symptome_occurence.add(new disease_count(line, 1));
			}
		
			line = reader.readLine();
		}
		
		FileWriter writer = new FileWriter ("result.out");
		Iterator<disease_count> itr=liste_symptome_occurence.iterator();  
		while(itr.hasNext()){
			 	dc = itr.next();
			 	writer.write(dc.name+" "+dc.nombre+ "\n");
			   System.out.println(dc.name+" "+dc.nombre);
			  
				
				
				
				   
			   }
		writer.close();}
	
	
	}

