package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class CountSymptoms {
List<String> symptoms = new ArrayList<String>();
TreeMap<String,Integer> SymptomOccurences = new TreeMap<String,Integer>(); 
String str;

	public CountSymptoms(List<String> list) {
		this.symptoms = list;
	}
	/**
	 * 
	 * @return TreeMap tri par ordre alphabétique des symptômes avec le nombre d'occurences
	 */
	public TreeMap<String,Integer> TriCompteSymptoms() {
		Iterator<String> it = symptoms.iterator();
		while (it.hasNext()) {
			
		str=(String) (it.next());
		
		if (SymptomOccurences.containsKey(str)){
			Integer value = SymptomOccurences.get(str);
			SymptomOccurences.replace(str, value, value+1);
			
		}else
		{
			SymptomOccurences.put(str, 1);
		}
		}
		return SymptomOccurences;
		
	}
	
}
