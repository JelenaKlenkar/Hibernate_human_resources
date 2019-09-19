/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.Operator;
import human_resources.utility.JelenaException;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingOperator extends Processing<Operator> {

   

    @Override
    public List<Operator> getEntitys() {
        
    return session.createQuery("from Operator").list();
    
}
    
    public Operator getOperater(String email){
        
        return (Operator)session.createQuery("from Operator a "
                + " where a.email=:email ")
                .setParameter("email", email).uniqueResult();
        
        
    }

    @Override
    protected void controlSave(Operator entity_) throws JelenaException {
        
    }

    @Override
    protected void controlDelete(Operator entity_) throws JelenaException {
       
    }
    
}
