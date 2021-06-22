package src.com.hemebiotech.analytics;
/**
 * 
 *@author hraza
 *@version 0.0
 *
 *Classe permettant de combiner nom du symptôme et occurences de celui-ci
 *Comprend une méthode de comparaison
 */
public class disease_count implements Comparable<disease_count>{
	
	 String name;
	 int nombre;
	 public disease_count(String name, int nombre) {
		 this.name=name;
		 this.nombre=nombre;
		
	}
/**
 * @param Comparaison pour le tri dans le TreeSet
 * 
 */
	
	 public int compareTo(disease_count d) {
		 return name.toString().compareTo(d.name.toString());
	 }
}
