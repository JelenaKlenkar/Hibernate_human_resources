/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.test;

import human_resources.controller.ProcessingApplicant;
import human_resources.model.Applicant;
import human_resources.utility.JelenaException;

/**
 *
 * @author Jelena
 */
public class test {
    
    public static void test() {
        
         Applicant a = new Applicant();
         
         a.setFirstName("test");
         a.setLastName("bb");
         a.setAddress("sdada 1");
         a.setApplicantCV("sdasdasddas");
         a.setEmail("asdasd@dasd.com");
         a.setMotivationalLetter("sddadasda");
         a.setPersonalIdentificationNumber("90679867186");
         a.setPhoneNumber("12345678");
         
        ProcessingApplicant processing = new ProcessingApplicant();
          
        try {
          processing.save(a);

        } catch (JelenaException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("a.getId()");
    }
    
}
