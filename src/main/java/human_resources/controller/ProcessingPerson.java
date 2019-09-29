/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.Applicant;
import human_resources.model.Person;
import human_resources.utility.JelenaException;

/**
 *
 * @author Jelena
 */
public abstract class ProcessingPerson<T extends Person> extends Processing<T> {

    @Override
    protected void controlSave(T entity) throws JelenaException {
        controlFirstName(entity.getFirstName());
        controlLastName(entity.getLastName());
        controlEmail(entity.getEmail());
        controlPersonalIdentificationNumber(entity.getPersonalIdentificationNumber());
    }

    @Override
    protected void controlDelete(T entity) throws JelenaException {

    }

    protected void controlFirstName(String firstName) throws JelenaException {
        if (firstName != null) {
            firstName.trim();
        }

        if (firstName == null || firstName.length() == 0) {
            throw new JelenaException("First name needs to be entered");

        }
        if (firstName.length() > 50) {
            throw new JelenaException("First name cannot contain more then 50 letters");

        }

    }

    protected void controlLastName(String lastName) throws JelenaException {
        if (lastName != null) {
            lastName.trim();
        }

        if (lastName == null || lastName.length() == 0) {
            throw new JelenaException("Last name needs to be entered");

        }
        if (lastName.length() > 50) {
            throw new JelenaException("Last name cannot contain more then 50 letters");

        }
    }

    protected void controlEmail(String email) throws JelenaException {
        if (email == null || email.length() == 0) {
            throw new JelenaException("Email needs to be entered");

        }
        if (email != null) {
            email.trim();
        }
    }

    protected void controlPersonalIdentificationNumber(String personalIdentificationNumber) throws JelenaException {
        /*if (personalIdentificationNumber != null) {
            personalIdentificationNumber.trim();
        }
        if (personalIdentificationNumber == null) {
            throw new JelenaException("Personal identification number needs to be entered");
        }*/

        if (personalIdentificationNumber.length() != 11) {
            throw new JelenaException("Personal identification number needs to have 11 digits");
        }

        try {
            Long.parseLong(personalIdentificationNumber);
        } catch (NumberFormatException e) {
            throw new JelenaException("PersonalIdentificationNumber contains character which is not number");
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(personalIdentificationNumber.substring(i, i + 1));
            a = a % 10;
            if (a == 0) 
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int control = 11 - a;
        if (control == 10) {
            control = 0;
        }

        if (control != Integer.parseInt(personalIdentificationNumber.substring(10))) {
            throw new JelenaException("Incorrect personal identification number");
        }
    }
}
