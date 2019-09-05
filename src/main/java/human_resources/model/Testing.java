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
public class Testing extends Entity_ implements Serializable {

    private String typeOfTesting;
    private Date dateOfTesting;
    private Integer numberOfTesting;
    private Integer ResultOfTesting;

    public Testing() {
        super();
    }

    public Testing(Integer id, String typeOfTesting, Date dateOfTesting, Integer numberOfTesting, Integer ResultOfTesting) {
        super(id);
        this.typeOfTesting = typeOfTesting;
        this.dateOfTesting = dateOfTesting;
        this.numberOfTesting = numberOfTesting;
        this.ResultOfTesting = ResultOfTesting;
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

}
