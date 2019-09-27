/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.test;

import human_resources.controller.ProcessingOperator;
import human_resources.model.Operator;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Jelena
 */
public class TestOperator {

    public static void test() {

        Operator o = new Operator();

        o.setPassword(BCrypt.hashpw("ja", BCrypt.gensalt()));

        ProcessingOperator processing = new ProcessingOperator();

        try {
            processing.save(o);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(o.getId());

    }

}
