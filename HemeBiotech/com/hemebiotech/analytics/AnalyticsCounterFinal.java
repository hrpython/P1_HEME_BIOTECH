package com.hemebiotech.analytics;

public class AnalyticsCounterFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReadSymptomDataFromFile rd= new ReadSymptomDataFromFile("symptoms.txt");
CountSymptoms cs = new CountSymptoms(rd.GetSymptoms());
ShowSymptoms ss = new ShowSymptoms(cs.TriCompteSymptoms());
ss.Affiche();
RecordSymptomsToFile rf =new RecordSymptomsToFile(cs.TriCompteSymptoms());
rf.RecordToFile();

	}

}
