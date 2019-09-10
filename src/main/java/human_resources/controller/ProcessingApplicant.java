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

    private void controlFirstName(Applicant entity_) {

        if (entity_.getFirstName() != null) {
            entity_.setFirstName(entity_.getFirstName().trim());
        }
        if (entity_.getFirstName() == null || entity_.getFirstName().length() == 0) {
            try {
                throw new JelenaException("First name needs to be entered");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }
        }
        if (entity_.getFirstName().length() > 50) {
            try {
                throw new JelenaException("First name cannot contain more then 50 letters");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }
        }

    }

    private void controlLastName(Applicant entity_) {

        if (entity_.getLastName() != null) {
            entity_.setLastName(entity_.getLastName().trim());
        }
        if (entity_.getLastName() == null || entity_.getLastName().length() == 0) {
            try {
                throw new JelenaException("Last name needs to be entered");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }
        }
        if (entity_.getLastName().length() > 50) {
            try {
                throw new JelenaException("Last name cannot contain more then 50 letters");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }
        }

    }

    private void controlAddress(Applicant entity_) {
        if (entity_.getAddress() == null || entity_.getAddress().length() == 0) {
            try {
                throw new JelenaException("Address needs to be entered");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }
        }
        if (entity_.getAddress().length() > 50) {
            try {
                throw new JelenaException("Address cannot contain more then 50 letters");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void controlPhoneNumber(Applicant entity_) {
        if (entity_.getPhoneNumber() == null) {
            try {
                throw new JelenaException("Phone number needs to be entered");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }

        }

        for (char ch : entity_.getPhoneNumber().toCharArray()) {

            if (!Character.isDigit(ch)) {
                try {
                    throw new JelenaException("You need to enter number");
                } catch (JelenaException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

    private void controlEmail(Applicant entity_) {
        if (entity_.getEmail() == null || entity_.getEmail().length() == 0) {
            try {
                throw new JelenaException("Email needs to be entered");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }
        }
        if (entity_.getEmail() != null) {
            entity_.setEmail(entity_.getEmail().trim());
        }
    }

    private void controlPersonalIdentificationNumber(Applicant entity_) {
        if (entity_.getPersonalIdentificationNumber() != null) {
            entity_.setPersonalIdentificationNumber(entity_.getPersonalIdentificationNumber().trim());
        }
        if (entity_.getPersonalIdentificationNumber() == null) {
            try {
                throw new JelenaException("Personal identification number needs to be entered");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }

        }

        for (char ch : entity_.getPersonalIdentificationNumber().toCharArray()) {

            if (!Character.isDigit(ch)) {
                try {
                    throw new JelenaException("You need to enter personal identification number");
                } catch (JelenaException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

    private void controlApplicantCV(Applicant entity_) {

        if (entity_.getApplicantCV() == null || entity_.getApplicantCV().length() == 0) {
            try {
                throw new JelenaException("You need to enter link to your CV");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }

        }
    }

    private void controlMotivationalLetter(Applicant entity_) {
        if (entity_.getMotivationalLetter() == null || entity_.getMotivationalLetter().length() == 0) {
            try {
                throw new JelenaException("You need to enter link to your motivational letter");
            } catch (JelenaException ex) {
                ex.printStackTrace();
            }
        }
    }
}
