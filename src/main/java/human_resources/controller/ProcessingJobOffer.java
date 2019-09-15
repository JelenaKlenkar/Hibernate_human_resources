/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.JobOffer;
import human_resources.utility.JelenaException;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingJobOffer extends Processing<JobOffer> {
    
    public List<JobOffer> getEntitys(){
        return session.createQuery("from JobOffer").list();
    }

    @Override
    protected void controlSave(JobOffer entity_) throws JelenaException {
        controlSalary(entity_);
        controlStartingDate(entity_);
        controlAccept(entity_);
    }

    @Override
    protected void controlDelete(JobOffer entity_) throws JelenaException {
        
    }

    private void controlSalary(JobOffer entity_) throws JelenaException {
        if (entity_.getSalary() == null || entity_.getSalary().toString().length() == 0) {
            throw new JelenaException("Salary needs to be entered");
        }
    }

    private void controlStartingDate(JobOffer entity_) throws JelenaException{
        if (entity_.getStartingDate() == null || entity_.getStartingDate().toString().length() == 0) {
            throw new JelenaException("Starting date needs to be entered");
        }
    }

    private void controlAccept(JobOffer entity_) throws JelenaException {
       
    }
    
}
