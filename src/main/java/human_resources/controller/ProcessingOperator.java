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
public class ProcessingOperator extends ProcessingPerson<Operator> {

   

    @Override
    public List<Operator> getEntitys() {
        
    return session.createQuery("from Operator").list();
    
}
    public List<Operator> getEntitys(String condition) {
        return session.createQuery("from Operator o where o.firstName like :condition or o.lastName like :condition").setParameter("condition","%" +condition + "%").setMaxResults(20).list();
    }
    
    public Operator getOperater(String email){
        
        return (Operator)session.createQuery("from Operator a "
                + " where a.email=:email ")
                .setParameter("email", email).uniqueResult();
        
        
    }

    @Override
    protected void controlSave(Operator entity) throws JelenaException {
        controlPassword(entity);
    }

    @Override
    protected void controlDelete(Operator entity) throws JelenaException {
       
    }

    private void controlPassword(Operator entity) throws JelenaException {
        if (entity.getPassword()== null || entity.getPassword().length() == 0) {

            throw new JelenaException("Password needs to be entered");

        }
    }
    
}
