package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class RecordSymptomsToFile {
	TreeMap<String,Integer> tmIn = new TreeMap<String, Integer>();
	public RecordSymptomsToFile(TreeMap<String,Integer> tm) {
		this.tmIn=tm;
	}
public void RecordToFile() {
	
	try {
		FileWriter writer = new FileWriter ("result.out");
		 for(Map.Entry<String,Integer> m:tmIn.entrySet()){    
			 
		      writer.write(m.getKey()+" "+m.getValue()+ "\n");  
		      System.out.println(m.getKey()+" "+m.getValue());   
		      } 
		 writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		    
	}
	
	
	}
	


