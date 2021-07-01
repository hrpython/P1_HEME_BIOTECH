package com.hemebiotech.analytics;

public class AnalyticsCounterFinal {
/**
 * 
 * instanciation des objets pour lire trier et écrire les symptômtes dans un fichier
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadSymptomDataFromFile rd= new ReadSymptomDataFromFile("symptoms.txt");
		CountSymptoms cs = new CountSymptoms(rd.GetSymptoms());
		RecordSymptomsToFile rf =new RecordSymptomsToFile(cs.TriCompteSymptoms());
		rf.RecordToFile("result.out");

	}

}
