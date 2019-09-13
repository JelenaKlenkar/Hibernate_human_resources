/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.Interview;
import human_resources.utility.JelenaException;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingInterview extends Processing<Interview> {

    public List<Interview> getEntitys() {
        return session.createQuery("from Interview").list();
    }

    @Override
    protected void controlSave(Interview entity_) throws JelenaException {
        controlTypeOfInterview(entity_);
        controlDateOfInterview(entity_);
        controlNumberOfInterview(entity_);
    }

    @Override
    protected void controlDelete(Interview entity_) throws JelenaException {

    }

    private void controlTypeOfInterview(Interview entity_) throws JelenaException {
        if (entity_.getTypeOfInterview() == null || entity_.getTypeOfInterview().length() == 0) {

            throw new JelenaException("Type of interview needs to be entered");
        }
        if (entity_.getTypeOfInterview().length() > 50) {
            throw new JelenaException("Type of interview cannot contain more then 50 letters");
        }
    }

    private void controlDateOfInterview(Interview entity_) throws JelenaException {

    }

    private void controlNumberOfInterview(Interview entity_) throws JelenaException {

    }
}
