/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.view;

import javax.swing.JFrame;

/**
 *
 * @author Jelena
 */
public abstract class JelenaView<T> extends JFrame {

    protected abstract void load();

    protected abstract void save(T entity);

    protected abstract boolean control(T entity);

    protected abstract void setValues(T entity);
}
