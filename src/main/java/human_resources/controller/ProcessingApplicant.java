/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.Applicant;
import human_resources.utility.JelenaException;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingApplicant extends Processing<Applicant> {

    @Override
    public List<Applicant> getEntitys() {
        return session.createQuery("from Applicant").list();
    }

    @Override
    protected void controlSave(Applicant entity_) throws JelenaException {
        controlFirstName(entity_);
        controlLastName(entity_);
        controlAddress(entity_);
        controlPhoneNumber(entity_);
        controlEmail(entity_);
        controlPersonalIdentificationNumber(entity_);
        controlApplicantCV(entity_);
        controlMotivationalLetter(entity_);
    }

    @Override
    protected void controlDelete(Applicant entity_) throws JelenaException {

    }

    private void controlFirstName(Applicant entity_) throws JelenaException {
        if (entity_.getFirstName() != null) {
            entity_.setFirstName(entity_.getFirstName().trim());
        }

        if (entity_.getFirstName() == null || entity_.getFirstName().length() == 0) {

            throw new JelenaException("First name needs to be entered");

        }
        if (entity_.getFirstName().length() > 50) {
            throw new JelenaException("First name cannot contain more then 50 letters");
        }
    }

    private void controlLastName(Applicant entity_) throws JelenaException {
        if (entity_.getLastName() != null) {
            entity_.setLastName(entity_.getLastName().trim());
        }

        if (entity_.getLastName() == null || entity_.getLastName().length() == 0) {
            throw new JelenaException("Last name needs to be entered");

        }
        if (entity_.getLastName().length() > 50) {
            throw new JelenaException("Last name cannot contain more then 50 letters");

        }

    }

    private void controlAddress(Applicant entity_) throws JelenaException {
        if (entity_.getAddress() == null || entity_.getAddress().length() == 0) {
            throw new JelenaException("Address needs to be entered");
        }
        if (entity_.getAddress().length() > 50) {
            throw new JelenaException("Address cannot contain more then 50 letters");

        }
    }

    private void controlPhoneNumber(Applicant entity_) throws JelenaException {
        if (entity_.getPhoneNumber() == null) {
            throw new JelenaException("Phone number needs to be entered");
        }

        for (char ch : entity_.getPhoneNumber().toCharArray()) {

            if (!Character.isDigit(ch)) {
                throw new JelenaException("You need to enter number");

            }

        }
    }

    private void controlEmail(Applicant entity_) throws JelenaException {
        if (entity_.getEmail() == null || entity_.getEmail().length() == 0) {
            throw new JelenaException("Email needs to be entered");

        }
        if (entity_.getEmail() != null) {
            entity_.setEmail(entity_.getEmail().trim());
        }
    }

    private void controlPersonalIdentificationNumber(Applicant entity_) throws JelenaException {
        if (entity_.getPersonalIdentificationNumber() != null) {
            entity_.setPersonalIdentificationNumber(entity_.getPersonalIdentificationNumber().trim());
        }
        if (entity_.getPersonalIdentificationNumber() == null) {
            throw new JelenaException("Personal identification number needs to be entered");
        }

        if (entity_.getPersonalIdentificationNumber().length() != 11) {
            throw new JelenaException("Personal identification number needs to have 11 digits");
        }

        try {
            Long.parseLong(entity_.getPersonalIdentificationNumber());
        } catch (NumberFormatException e) {
            throw new JelenaException("PersonalIdentificationNumber contains character which is not number");
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(entity_.getPersonalIdentificationNumber().substring(i, i + 1));
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int control = 11 - a;
        if (control == 10) {
            control = 0;
        }

        if (control != Integer.parseInt(entity_.getPersonalIdentificationNumber().substring(10))) {
            throw new JelenaException("Incorrect personal identification number");
        }
    }

    private void controlApplicantCV(Applicant entity_) throws JelenaException {

        if (entity_.getApplicantCV() == null || entity_.getApplicantCV().length() == 0) {
            throw new JelenaException("You need to enter link to applicant CV");

        }

    }

    private void controlMotivationalLetter(Applicant entity_) throws JelenaException {
        if (entity_.getMotivationalLetter() == null || entity_.getMotivationalLetter().length() == 0) {
            throw new JelenaException("You need to enter link to motivational letter");

        }
    }
}
