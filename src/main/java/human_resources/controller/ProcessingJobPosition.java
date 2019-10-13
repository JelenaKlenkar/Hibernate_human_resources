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
    public List<JobPosition> getEntitys(String condition) {
        return session.createQuery("from JobPosition j where j.nameOfJobPosition like :condition ").setParameter("condition", condition + "%").setMaxResults(20).list();
    }
    @Override
    protected void controlSave(JobPosition entity) throws JelenaException {
        controlNameOfJobPosition(entity);
        controlJobDescription(entity);
    }

    @Override
    protected void controlDelete(JobPosition entity) throws JelenaException {
     
    }

    private void controlNameOfJobPosition(JobPosition entity) throws JelenaException {
        if (entity.getNameOfJobPosition() == null || entity.getNameOfJobPosition().length() == 0) {

            throw new JelenaException("Name of job position needs to be entered");

        }
        if (entity.getNameOfJobPosition().length() > 100) {
            throw new JelenaException("Name of job position cannot contain more then 100 characters");
        }
    }

    private void controlJobDescription(JobPosition entity) throws JelenaException {
        if (entity.getJobDescription() == null || entity.getJobDescription().length() == 0) {

            throw new JelenaException("Job description needs to be entered");

        }
        if (entity.getJobDescription().length() > 500) {
            throw new JelenaException("Job description cannot contain more then 500 characters");
        }
    }

}
