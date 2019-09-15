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
    protected void controlSave(Testing entity_) throws JelenaException {
        controlTypeOfTesting(entity_);
        controlDateOfTesting(entity_);
        controlNumberOfTesting(entity_);
        controlResultOfTesting(entity_);
    }

    @Override
    protected void controlDelete(Testing entity_) throws JelenaException {

    }

    private void controlTypeOfTesting(Testing entity_) throws JelenaException {
        if (entity_.getTypeOfTesting() == null || entity_.getTypeOfTesting().length() == 0) {

            throw new JelenaException("Type of testing needs to be entered");
        }
        if (entity_.getTypeOfTesting().length() > 100) {
            throw new JelenaException("Type of testing cannot contain more then 100 letters");
        }
    }

    private void controlDateOfTesting(Testing entity_) throws JelenaException {
        if (entity_.getDateOfTesting() == null || entity_.getDateOfTesting().toString().length() == 0) {
            throw new JelenaException("Number of interview needs to be entered");
        }
    }

    private void controlNumberOfTesting(Testing entity_) throws JelenaException {

        if (entity_.getNumberOfTesting() == null || entity_.getNumberOfTesting().toString().length() == 0) {
            throw new JelenaException("Number of testing needs to be entered");
        }

    }

    private void controlResultOfTesting(Testing entity_) throws JelenaException {
        if (entity_.getResultOfTesting() == null || entity_.getResultOfTesting().toString().length() == 0) {
            throw new JelenaException("Result of testing needs to be entered");
        }
    }

}
