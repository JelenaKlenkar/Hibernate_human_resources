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
    protected void controlSave(JobOffer entity) throws JelenaException {
        controlSalary(entity);
        controlStartingDate(entity);
        controlAccept(entity);
    }

    @Override
    protected void controlDelete(JobOffer entity) throws JelenaException {
        
    }

    private void controlSalary(JobOffer entity) throws JelenaException {
        if (entity.getSalary() == null || entity.getSalary().toString().length() == 0) {
            throw new JelenaException("Salary needs to be entered");
        }
    }

    private void controlStartingDate(JobOffer entity) throws JelenaException{
        if (entity.getStartingDate() == null || entity.getStartingDate().toString().length() == 0) {
            throw new JelenaException("Starting date needs to be entered");
        }
    }

    private void controlAccept(JobOffer entity) throws JelenaException {
       
    }
    
}
