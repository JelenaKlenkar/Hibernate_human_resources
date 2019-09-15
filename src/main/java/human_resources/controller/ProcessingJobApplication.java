/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.JobApplication;
import human_resources.utility.JelenaException;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingJobApplication extends Processing<JobApplication> {

    public List<JobApplication> getEntitys() {
        return session.createQuery("from JobApplication").list();
    }

    @Override
    protected void controlSave(JobApplication entity_) throws JelenaException {
        controlDateOfReceive(entity_);
        controlTimeOfReceive(entity_);
        controlNumberOfApplication(entity_);
    }

    @Override
    protected void controlDelete(JobApplication entity_) throws JelenaException {

    }

    private void controlDateOfReceive(JobApplication entity_) throws JelenaException {
        if (entity_.getDateOfReceive() == null || entity_.getDateOfReceive().toString().length() == 0) {
            throw new JelenaException("Date of receive needs to be entered");
        }
    }

    private void controlTimeOfReceive(JobApplication entity_) throws JelenaException {
        if (entity_.getTimeOfReceive() == null || entity_.getTimeOfReceive().toString().length() == 0) {
            throw new JelenaException("Time of receive needs to be entered");
        }
    }

    private void controlNumberOfApplication(JobApplication entity_) throws JelenaException {
        if (entity_.getNumberOfApplication() == null || entity_.getNumberOfApplication().toString().length() == 0) {
            throw new JelenaException("Number of application needs to be entered");
        }
    }
}
