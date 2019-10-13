/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources;

import human_resources.test.InitialInsert;
import human_resources.test.TestApplicant;
import human_resources.test.TestJobApplication;
import human_resources.test.TestOperator;
import human_resources.utility.HibernateUtil;
import human_resources.view.Authorisation;
import human_resources.view.SplashScreen;

/**
 *
 * @author Jelena
 */
public class Start {
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        //TestOperator.test();
        //new Authorisation().setVisible(true);
        new SplashScreen().setVisible(true);
        //TestApplicant.test();
        
        //InitialInsert.run();
       //TestJobApplication.test();
    }
    
}
