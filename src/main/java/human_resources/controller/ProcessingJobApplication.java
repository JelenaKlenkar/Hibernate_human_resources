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
    protected void controlSave(JobApplication entity) throws JelenaException {
        controlDateOfReceive(entity);
        controlTimeOfReceive(entity);
        controlNumberOfApplication(entity);
    }

    @Override
    protected void controlDelete(JobApplication entity) throws JelenaException {

    }

    private void controlDateOfReceive(JobApplication entity) throws JelenaException {
        if (entity.getDateOfReceive() == null || entity.getDateOfReceive().toString().length() == 0) {
            throw new JelenaException("Date of receive needs to be entered");
        }
    }

    private void controlTimeOfReceive(JobApplication entity) throws JelenaException {
        if (entity.getTimeOfReceive() == null || entity.getTimeOfReceive().toString().length() == 0) {
            throw new JelenaException("Time of receive needs to be entered");
        }
    }

    private void controlNumberOfApplication(JobApplication entity) throws JelenaException {
        if (entity.getNumberOfApplication() == null || entity.getNumberOfApplication().toString().length() == 0) {
            throw new JelenaException("Number of application needs to be entered");
        }
    }
}
