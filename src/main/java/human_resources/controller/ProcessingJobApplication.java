/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.Applicant;
import human_resources.model.JobApplication;
import human_resources.utility.JelenaException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingJobApplication extends Processing<JobApplication> {

    public List<JobApplication> getEntitys() {
        return session.createQuery("from JobApplication").list();
    }
  

    public List<JobApplication> getEntitys(String condition) {
        return session.createQuery("from JobApplication ja where cast(ja.numberOfApplication as string) like :condition or concat(ja.applicant.firstName,ja.applicant.lastName) like :condition").setParameter("condition","%" +condition + "%").setMaxResults(20).list();
    }

    @Override
    protected void controlSave(JobApplication entity) throws JelenaException {
        controlDateAndTimeOfReceive(entity);
        controlNumberOfApplication(entity);
    }

    @Override
    protected void controlDelete(JobApplication entity) throws JelenaException {
        super.delete(entity);
     
    }

    private void controlNumberOfApplication(JobApplication entity) throws JelenaException {
        if (entity.getNumberOfApplication() == null || entity.getNumberOfApplication().toString().length() == 0) {
            throw new JelenaException("Number of application needs to be entered");
        }
    }

    private void controlDateAndTimeOfReceive(JobApplication entity) throws JelenaException {
        if(entity.getDateAndTimeOfReceive()==null){
            return;
        }
                
    }
}
