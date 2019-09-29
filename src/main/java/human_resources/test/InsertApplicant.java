/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.test;

import human_resources.controller.ProcessingApplicant;
import human_resources.model.Applicant;
import human_resources.utility.JelenaException;
import human_resources.utility.Utility;

/**
 *
 * @author Jelena
 */
public class InsertApplicant {
    
    public static void run(int total) {
        
        ProcessingApplicant processing = new ProcessingApplicant();
        Applicant a;
        
        for (int i = 0; i < total; i++) {
            a = new Applicant();
            a.setFirstName("Applicant");
            a.setLastName("" + i);
            a.setAddress("a 1");
            a.setEmail("aaa@gag.com");
            a.setPhoneNumber("01234567");
            a.setPersonalIdentificationNumber(Utility.getPersonalIdentificationNumber());
            a.setApplicantCV("https://resume.io/?gclid=EAIaIQobChMI8OOlptP25AIVA-R3Ch1mzQKIEAAYAiAAEgKXMvD_BwE");
            a.setMotivationalLetter("http://ecs.ihu.edu.gr/co/employment-business-letters/example-motivation-letter");
            
            try {
                a = processing.save(a);
                
                System.out.println("Save " + a.getId());
                
            } catch (JelenaException ex) {
                System.out.println(ex.getMessage());
            }
            
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException ex) {
                
            }
        }
        
    }
    
}
