/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.Interview;
import human_resources.utility.JelenaException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingInterview extends Processing<Interview> {

    public List<Interview> getEntitys() {
        return session.createQuery("from Interview").list();
    }
    public List<Interview> getEntitys(String condition) {
        return session.createQuery("from Interview i where i.typeOfInterview like :condition").setParameter("condition", condition + "%").setMaxResults(20).list();
    }
    @Override
    protected void controlSave(Interview entity) throws JelenaException {
        controlTypeOfInterview(entity);
        controlDateOfInterview(entity);
        controlNumberOfInterview(entity);
    }

    @Override
    protected void controlDelete(Interview entity) throws JelenaException {

    }

    private void controlTypeOfInterview(Interview entity) throws JelenaException {
        if (entity.getTypeOfInterview() == null || entity.getTypeOfInterview().length() == 0) {

            throw new JelenaException("Type of interview needs to be entered");
        }
        if (entity.getTypeOfInterview().length() > 50) {
            throw new JelenaException("Type of interview cannot contain more then 50 letters");
        }
    }

    private void controlDateOfInterview(Interview entity) throws JelenaException {
        if (entity.getDateOfInterview() == null || entity.getDateOfInterview().toString().length() == 0) {

            throw new JelenaException("Date of interview needs to be entered");
        }
    }

    private void controlNumberOfInterview(Interview entity) throws JelenaException {
        if (entity.getNumberOfInterview() == null || entity.getNumberOfInterview().toString().length() == 0) {
            throw new JelenaException("Number of interview needs to be entered");
        }
    }
}
