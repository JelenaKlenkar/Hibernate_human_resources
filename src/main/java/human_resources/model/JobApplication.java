/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jelena
 */
@Entity
public class JobApplication extends human_resources.model.Entity implements Serializable {

    private Date dateAndTimeOfReceive;
    private Integer numberOfApplication;

    @ManyToOne
    private Applicant applicant;

    @ManyToOne
    private JobPosition jobposition;

    public JobApplication() {
        super();
    }

    public JobApplication(Integer id, Date dateAndTimeOfReceive, Integer numberOfApplication, Applicant applicant, JobPosition jobposition) {
        super(id);
        this.dateAndTimeOfReceive = dateAndTimeOfReceive;
        this.numberOfApplication = numberOfApplication;
        this.applicant = applicant;
        this.jobposition = jobposition;
    }

    public Date getDateAndTimeOfReceive() {
        return dateAndTimeOfReceive;
    }

    public void setDateAndTimeOfReceive(Date dateAndTimeOfReceive) {
        this.dateAndTimeOfReceive = dateAndTimeOfReceive;
    }

    public Integer getNumberOfApplication() {
        return numberOfApplication;
    }

    public void setNumberOfApplication(Integer numberOfApplication) {
        this.numberOfApplication = numberOfApplication;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public JobPosition getJobposition() {
        return jobposition;
    }

    public void setJobposition(JobPosition jobposition) {
        this.jobposition = jobposition;
    }

    @Override
    public String toString() {
        return "" + numberOfApplication;
    }

}
