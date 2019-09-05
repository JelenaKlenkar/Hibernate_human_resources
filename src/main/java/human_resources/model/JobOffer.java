/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Jelena
 */
@Entity
public class JobOffer extends Entity_ implements Serializable {

    private BigDecimal salary;
    private Date startingDate;
    private boolean accept;

    public JobOffer() {
        super();
    }

    public JobOffer(Integer id, BigDecimal salary, Date startingDate, boolean accept) {
        super(id);
        this.salary = salary;
        this.startingDate = startingDate;
        this.accept = accept;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public boolean isAccept() {
        return accept;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }

}
