package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class ShowSymptoms {
	TreeMap<String,Integer> tmIn = new TreeMap<String, Integer>();
	
public ShowSymptoms(TreeMap<String,Integer> tm) {
	this.tmIn=tm;
}
public void Affiche() {
	 for(Map.Entry m:tmIn.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }     
}
}
