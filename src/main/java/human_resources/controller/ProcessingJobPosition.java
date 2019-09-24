/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.JobPosition;
import human_resources.utility.JelenaException;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingJobPosition extends Processing<JobPosition> {

    public List<JobPosition> getEntitys() {
        return session.createQuery("from JobPosition").list();
    }

    @Override
    protected void controlSave(JobPosition entity_) throws JelenaException {
        controlNameOfJobPosition(entity_);
        controlJobDescription(entity_);
    }

    @Override
    protected void controlDelete(JobPosition entity_) throws JelenaException {

    }

    private void controlNameOfJobPosition(JobPosition entity_) throws JelenaException {
        if (entity_.getNameOfJobPosition() == null || entity_.getNameOfJobPosition().length() == 0) {

            throw new JelenaException("Name of job position needs to be entered");

        }
        if (entity_.getNameOfJobPosition().length() > 100) {
            throw new JelenaException("Name of job position cannot contain more then 100 characters");
        }
    }

    private void controlJobDescription(JobPosition entity_) throws JelenaException {
        if (entity_.getJobDescription() == null || entity_.getJobDescription().length() == 0) {

            throw new JelenaException("Job description needs to be entered");

        }
        if (entity_.getJobDescription().length() > 500) {
            throw new JelenaException("Job description cannot contain more then 500 characters");
        }
    }

}
