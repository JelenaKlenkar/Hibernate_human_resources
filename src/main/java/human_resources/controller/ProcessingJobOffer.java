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
    
    public List<JobOffer> getJobOffers(){
        return session.createQuery("from JobOffer").list();
    }

    @Override
    protected void controlSave() throws JelenaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void controlDelete() throws JelenaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
