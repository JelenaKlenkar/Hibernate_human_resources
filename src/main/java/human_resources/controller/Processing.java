/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.utility.HibernateUtil;
import human_resources.utility.JelenaException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jelena
 */
public abstract class Processing<T> {

    protected abstract void controlSave(T entity) throws JelenaException;

    protected abstract void controlDelete(T entity) throws JelenaException;

    public abstract List<T> getEntitys();

    protected Session session;

    public Processing() {
        this.session = HibernateUtil.getSession();
    }

    public T save(T entity) throws JelenaException {
        controlSave(entity);
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        return entity;
    }

    public void delete(T entity) throws JelenaException {
        controlSave(entity);
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();

    }
}
