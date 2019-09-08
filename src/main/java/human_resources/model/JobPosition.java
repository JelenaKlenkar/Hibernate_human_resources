/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Jelena
 */
@Entity
public class JobPosition extends Entity_ implements Serializable {

    private String nameOfJobPosition;
    private String jobDescription;

    public JobPosition() {
        super();
    }

    public JobPosition(String nameOfJobPosition, String jobDescription, Integer id) {
        super(id);
        this.nameOfJobPosition = nameOfJobPosition;
        this.jobDescription = jobDescription;
    }

    public String getNameOfJobPosition() {
        return nameOfJobPosition;
    }

    public void setNameOfJobPosition(String nameOfJobPosition) {
        this.nameOfJobPosition = nameOfJobPosition;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

}
