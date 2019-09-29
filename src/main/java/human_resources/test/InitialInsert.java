/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.test;

import human_resources.controller.ProcessingApplicant;
import human_resources.controller.ProcessingJobPosition;
import human_resources.controller.ProcessingOperator;
import human_resources.model.Applicant;
import human_resources.model.JobPosition;
import human_resources.model.Operator;
import human_resources.utility.JelenaException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Jelena
 */
public class InitialInsert {

    public static void run() {
        Applicant a = new Applicant();

        a.setAddress("Market Street,New York");
        a.setPhoneNumber("0123455678");
        a.setApplicantCV("https://resume.io/?gclid=EAIaIQobChMI8OOlptP25AIVA-R3Ch1mzQKIEAAYAiAAEgKXMvD_BwE");
        a.setMotivationalLetter("http://ecs.ihu.edu.gr/co/employment-business-letters/example-motivation-letter");

        ProcessingApplicant processing = new ProcessingApplicant();

        try {
            a = processing.save(a);
        } catch (JelenaException ex) {
            System.out.println(ex.getMessage());

        }

        JobPosition jp = new JobPosition();

        jp.setNameOfJobPosition("Java developer");
        jp.setJobDescription("Designing and developing high-volume,low-latency applications for mission-critical systems and delivering high-availability and performance.Contributing in all phases of the development lifecycle. Writing well designed, testable, efficient code.");

        ProcessingJobPosition processingjp = new ProcessingJobPosition();
        try {
            jp = processingjp.save(jp);
        } catch (JelenaException ex) {
            System.out.println(ex.getMessage());

        }
        Operator o = new Operator();

        o.setFirstName("Jelena");
        o.setLastName("Klenkar");
        o.setEmail("jelena.klenkar@gmail.com");
        o.setPassword(BCrypt.hashpw("ja", BCrypt.gensalt()));

        ProcessingOperator processingo = new ProcessingOperator();
        try {
            o = processingo.save(o);
        } catch (JelenaException ex) {
            System.out.println(ex.getMessage());

        }
        
        System.out.println("Finished");
    }

}
