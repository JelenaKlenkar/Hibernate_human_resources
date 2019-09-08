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
public class Testing extends Entity_ implements Serializable {

    private String typeOfTesting;
    private Date dateOfTesting;
    private Integer numberOfTesting;
    private Integer ResultOfTesting;

    @ManyToOne
    private JobApplication jobApplications;

    public Testing() {
        super();
    }

    public Testing(String typeOfTesting, Date dateOfTesting, Integer numberOfTesting, Integer ResultOfTesting, JobApplication jobApplications, Integer id) {
        super(id);
        this.typeOfTesting = typeOfTesting;
        this.dateOfTesting = dateOfTesting;
        this.numberOfTesting = numberOfTesting;
        this.ResultOfTesting = ResultOfTesting;
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

    public Integer getResultOfTesting() {
        return ResultOfTesting;
    }

    public void setResultOfTesting(Integer ResultOfTesting) {
        this.ResultOfTesting = ResultOfTesting;
    }

    public JobApplication getJobApplications() {
        return jobApplications;
    }

    public void setJobApplications(JobApplication jobApplications) {
        this.jobApplications = jobApplications;
    }

}
