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
public class ProcessingApplicant extends ProcessingPerson<Applicant> {

    @Override
    public List<Applicant> getEntitys() {
        return session.createQuery("from Applicant").list();
    }

    public List<Applicant> getEntitys(String condition) {
        return session.createQuery("from Applicant a where a.firstName like :condition or a.lastName like :condition").setParameter("condition", condition + "%").setMaxResults(20).list();
    }

    @Override
    protected void controlSave(Applicant entity) throws JelenaException {
        super.controlSave(entity);
        controlAddress(entity);
        controlPhoneNumber(entity);
        controlApplicantCV(entity);
        controlMotivationalLetter(entity);
    }

    @Override
    protected void controlDelete(Applicant entity) throws JelenaException {
        super.controlDelete(entity);

    }

    private void controlAddress(Applicant entity) throws JelenaException {
        if (entity.getAddress() == null || entity.getAddress().length() == 0) {
            throw new JelenaException("Address needs to be entered");
        }
        if (entity.getAddress().length() > 50) {
            throw new JelenaException("Address cannot contain more then 50 letters");

        }
    }

    private void controlPhoneNumber(Applicant entity) throws JelenaException {
        if (entity.getPhoneNumber() == null) {
            throw new JelenaException("Phone number needs to be entered");
        }

        for (char ch : entity.getPhoneNumber().toCharArray()) {

            if (!Character.isDigit(ch)) {
                throw new JelenaException("Phone number: You need to enter number");

            }

        }
    }

    private void controlApplicantCV(Applicant entity) throws JelenaException {

        if (entity.getApplicantCV() == null || entity.getApplicantCV().length() == 0) {
            throw new JelenaException("You need to enter link to applicant CV");

        }

    }

    private void controlMotivationalLetter(Applicant entity) throws JelenaException {
        if (entity.getMotivationalLetter() == null || entity.getMotivationalLetter().length() == 0) {
            throw new JelenaException("You need to enter link to motivational letter");

        }
    }
}
