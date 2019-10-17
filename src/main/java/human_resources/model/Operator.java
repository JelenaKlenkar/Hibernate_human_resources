/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Jelena
 */
@Entity
public class Operator extends Person implements Serializable {

    private String password;

    public Operator() {
        super();
    }

    public Operator(String password, Integer id, String firstName, String lastName, String email, String personalIdentificationNumber) {
        super(id, firstName, lastName, email, personalIdentificationNumber);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.getFirstName() + " " + super.getLastName();
    }

}
