/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Jelena
 */
@Entity
public class JobApplication extends Entity_ implements Serializable {

    private Date dateOfReceive;
    private Date timeOfReceive;
    private Integer numberOfApplication;

    public JobApplication() {
        super();
    }

    public JobApplication(Integer id, Date dateOfReceive, Date timeOfReceive, Integer numberOfApplication) {
        super(id);
        this.dateOfReceive = dateOfReceive;
        this.timeOfReceive = timeOfReceive;
        this.numberOfApplication = numberOfApplication;
    }

    public JobApplication(Date dateOfReceive, Date timeOfReceive, Integer numberOfApplication, Integer id) {
        super(id);
        this.dateOfReceive = dateOfReceive;
        this.timeOfReceive = timeOfReceive;
        this.numberOfApplication = numberOfApplication;
    }

    public Date getDateOfReceive() {
        return dateOfReceive;
    }

    public void setDateOfReceive(Date dateOfReceive) {
        this.dateOfReceive = dateOfReceive;
    }

    public Date getTimeOfReceive() {
        return timeOfReceive;
    }

    public void setTimeOfReceive(Date timeOfReceive) {
        this.timeOfReceive = timeOfReceive;
    }

    public Integer getNumberOfApplication() {
        return numberOfApplication;
    }

    public void setNumberOfApplication(Integer numberOfApplication) {
        this.numberOfApplication = numberOfApplication;
    }

}
