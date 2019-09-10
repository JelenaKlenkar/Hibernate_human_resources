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
    
    public List<JobPosition> getEntitys(){
        return session.createQuery("from JopPosition").list();
    }

    @Override
    protected void controlSave(JobPosition entity_) throws JelenaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void controlDelete(JobPosition entity_) throws JelenaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
