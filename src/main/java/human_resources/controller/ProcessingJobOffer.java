/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.JobOffer;
import human_resources.utility.JelenaException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingJobOffer extends Processing<JobOffer> {

    public List<JobOffer> getEntitys() {
        return session.createQuery("from JobOffer").list();
    }

    public List<JobOffer> getEntitys(String condition) {
        return session.createQuery("from JobOffer jo where jo.Salary like :condition").setParameter("condition", condition + "%").setMaxResults(20).list();
    }

    @Override
    protected void controlSave(JobOffer entity) throws JelenaException {
        controlSalary(entity);
        controlStartingDate(entity);
        controlAccept(entity);
    }

    @Override
    protected void controlDelete(JobOffer entity) throws JelenaException {
        super.delete(entity);
    }

    private void controlSalary(JobOffer entity) throws JelenaException {
        if (entity.getSalary() == null || entity.getSalary().toString().length() == 0) {
            throw new JelenaException("Salary needs to be entered");
        }
    }

    private void controlStartingDate(JobOffer entity) throws JelenaException {
        if (entity.getStartingDate() == null) {
            return;
        }

        if (entity.getStartingDate().before(new Date())) {
            throw new JelenaException("Starting date cannot be before today");
        }

        GregorianCalendar c = (GregorianCalendar) Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.YEAR, 1);
        if (entity.getStartingDate().after(c.getTime())) {
            throw new JelenaException("Starting date cannot be one year after today ");
        }
    }

    private void controlAccept(JobOffer entity) throws JelenaException {
        //if(!entity.isAccept()){
        // throw new JelenaException("Then select not accept");
        //}
    }

}
