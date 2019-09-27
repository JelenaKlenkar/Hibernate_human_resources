/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.test;

import human_resources.controller.Processing;
import human_resources.controller.ProcessingApplicant;
import human_resources.model.Applicant;
import human_resources.utility.HibernateUtil;
import human_resources.utility.JelenaException;

/**
 *
 * @author Jelena
 */
public class TestApplicant {

    public static void test() {

        Applicant a = new Applicant();

        a.setAddress("Vijenac Ivana Meštrovića 50");

        ProcessingApplicant processing = new ProcessingApplicant();

        try {
            a = processing.save(a);

        } catch (JelenaException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("a.getId()");

        Applicant update = HibernateUtil.getSession().get(Applicant.class, 1);

        update.setPhoneNumber("012345678");
        try {
            processing.save(update);

        } catch (JelenaException e) {
            System.out.println(e.getMessage());
        }

        for (Applicant applicant : processing.getEntitys()) {
            System.out.println(applicant.getId() + ": " + applicant.getAddress());
            try {
                processing.delete(a);
            } catch (JelenaException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
