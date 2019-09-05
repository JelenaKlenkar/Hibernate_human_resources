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
public class Interview extends Entity_ implements Serializable {

    private String typeOfInterview;
    private Date dateOfInterview;
    private Integer numberOfInterview;

    public Interview() {
        super();
    }

    public Interview(Integer id, String typeOfInterview, Date dateOfInterview, Integer numberOfInterview) {
        super(id);
        this.typeOfInterview = typeOfInterview;
        this.dateOfInterview = dateOfInterview;
        this.numberOfInterview = numberOfInterview;
    }

    public String getTypeOfInterview() {
        return typeOfInterview;
    }

    public void setTypeOfInterview(String typeOfInterview) {
        this.typeOfInterview = typeOfInterview;
    }

    public Date getDateOfInterview() {
        return dateOfInterview;
    }

    public void setDateOfInterview(Date dateOfInterview) {
        this.dateOfInterview = dateOfInterview;
    }

    public Integer getNumberOfInterview() {
        return numberOfInterview;
    }

    public void setNumberOfInterview(Integer numberOfInterview) {
        this.numberOfInterview = numberOfInterview;
    }

}
