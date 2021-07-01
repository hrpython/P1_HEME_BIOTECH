package src.com.hemebiotech.analytics;
/**
 * 
 *@author hraza
 *@version 0.0
 *
 *Classe permettant de combiner nom du symptôme et occurences de celui-ci
 *Comprend une méthode de comparaison
 */
public class disease_count_simple implements Comparable<disease_count_simple>{
	
	 String name;
	 int nombre;
	 /**
	  * 
	  * @param name
	  * nom du symptôme
	  * @param nombre
	  * nombre celui de l'occurence du symptôme
	  */
	 public disease_count_simple(String name, int nombre) {
		 this.name=name;
		 this.nombre=nombre;
		
	}
/**
 * @param d
 * d est un objet disease_count comparé à l'instance
 * Comparaison pour le tri dans le TreeSet
 * 
 */
	
	 public int compareTo(disease_count_simple d) {
		 return name.toString().compareTo(d.name.toString());
	 }
}
