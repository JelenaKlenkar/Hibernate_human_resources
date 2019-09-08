/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.utility.HibernateUtil;
import human_resources.utility.JelenaException;
import org.hibernate.Session;

/**
 *
 * @author Jelena
 */
public abstract class Processing<T> {

    protected abstract void controlSave() throws JelenaException;

    protected abstract void controlDelete() throws JelenaException;

    protected Session session;

    public Processing() {
        this.session = HibernateUtil.getSession();
    }

    public T save(T entity_) throws JelenaException {
        controlSave();
        session.beginTransaction();
        session.save(entity_);
        session.getTransaction().commit();
        return entity_;
    }

    public void delete(T entity_) throws JelenaException {
        controlSave();
        session.beginTransaction();
        session.delete(entity_);
        session.getTransaction().commit();

    }
}
