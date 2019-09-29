/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.Testing;
import human_resources.utility.JelenaException;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingTesting extends Processing<Testing> {

    public List<Testing> getEntitys() {
        return session.createQuery("from Testing").list();
    }

    @Override
    protected void controlSave(Testing entity) throws JelenaException {
        controlTypeOfTesting(entity);
        controlDateOfTesting(entity);
        controlNumberOfTesting(entity);
        controlResultOfTesting(entity);
    }

    @Override
    protected void controlDelete(Testing entity) throws JelenaException {

    }

    private void controlTypeOfTesting(Testing entity) throws JelenaException {
        if (entity.getTypeOfTesting() == null || entity.getTypeOfTesting().length() == 0) {

            throw new JelenaException("Type of testing needs to be entered");
        }
        if (entity.getTypeOfTesting().length() > 100) {
            throw new JelenaException("Type of testing cannot contain more then 100 letters");
        }
    }

    private void controlDateOfTesting(Testing entity) throws JelenaException {
        if (entity.getDateOfTesting() == null || entity.getDateOfTesting().toString().length() == 0) {
            throw new JelenaException("Number of interview needs to be entered");
        }
    }

    private void controlNumberOfTesting(Testing entity) throws JelenaException {

        if (entity.getNumberOfTesting() == null || entity.getNumberOfTesting().toString().length() == 0) {
            throw new JelenaException("Number of testing needs to be entered");
        }

    }

    private void controlResultOfTesting(Testing entity) throws JelenaException {
        if (entity.getResultOfTesting() == null || entity.getResultOfTesting().toString().length() == 0) {
            throw new JelenaException("Result of testing needs to be entered");
        }
    }

}
