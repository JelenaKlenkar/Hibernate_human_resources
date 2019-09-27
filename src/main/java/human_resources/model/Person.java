/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Jelena
 */
@MappedSuperclass
public abstract class Person extends human_resources.model.Entity {

    private String firstName;
    private String lastName;
    private String email;
    private String personalIdentificationNumber;

    public Person() {
        super();
    }

    public Person(Integer id, String firstName, String lastName, String email, String personalIdentificationNumber) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.personalIdentificationNumber = personalIdentificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }

    public void setPersonalIdentificationNumber(String personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
