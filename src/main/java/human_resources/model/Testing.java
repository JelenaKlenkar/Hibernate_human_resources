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
public class Testing extends human_resources.model.Entity implements Serializable {

    private String typeOfTesting;
    private Date dateOfTesting;
    private Integer numberOfTesting;
    private Integer resultOfTesting;

    @ManyToOne
    private JobApplication jobApplications;

    public Testing() {
        super();
    }

    public Testing(Integer id, String typeOfTesting, Date dateOfTesting, Integer numberOfTesting, Integer resultOfTesting, JobApplication jobApplications) {
        super(id);
        this.typeOfTesting = typeOfTesting;
        this.dateOfTesting = dateOfTesting;
        this.numberOfTesting = numberOfTesting;
        this.resultOfTesting = resultOfTesting;
        this.jobApplications = jobApplications;
    }

    public String getTypeOfTesting() {
        return typeOfTesting;
    }

    public void setTypeOfTesting(String typeOfTesting) {
        this.typeOfTesting = typeOfTesting;
    }

    public Date getDateOfTesting() {
        return dateOfTesting;
    }

    public void setDateOfTesting(Date dateOfTesting) {
        this.dateOfTesting = dateOfTesting;
    }

    public Integer getNumberOfTesting() {
        return numberOfTesting;
    }

    public void setNumberOfTesting(Integer numberOfTesting) {
        this.numberOfTesting = numberOfTesting;
    }

    public Integer getresultOfTesting() {
        return resultOfTesting;
    }

    public void setresultOfTesting(Integer resultOfTesting) {
        this.resultOfTesting = resultOfTesting;
    }

    public JobApplication getJobApplications() {
        return jobApplications;
    }

    public void setJobApplications(JobApplication jobApplications) {
        this.jobApplications = jobApplications;
    }

    @Override
    public String toString() {
        return numberOfTesting + "." + typeOfTesting;
    }

}
