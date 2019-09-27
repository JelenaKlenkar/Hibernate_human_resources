/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Jelena
 */
@Entity
public class Applicant extends Person implements Serializable {

    private String address;
    private String phoneNumber;
    private String applicantCV;
    private String motivationalLetter;

    @OneToMany(mappedBy = "applicant")
    private List<JobApplication> jobApplications = new ArrayList<>();

    public Applicant() {
        super();
    }

    public Applicant(String address, String phoneNumber, String applicantCV, String motivationalLetter, Integer id, String firstName, String lastName, String email, String personalIdentificationNumber) {
        super(id, firstName, lastName, email, personalIdentificationNumber);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.applicantCV = applicantCV;
        this.motivationalLetter = motivationalLetter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getApplicantCV() {
        return applicantCV;
    }

    public void setApplicantCV(String applicantCV) {
        this.applicantCV = applicantCV;
    }

    public String getMotivationalLetter() {
        return motivationalLetter;
    }

    public void setMotivationalLetter(String motivationalLetter) {
        this.motivationalLetter = motivationalLetter;
    }

    public List<JobApplication> getJobApplications() {
        return jobApplications;
    }

    public void setJobApplications(List<JobApplication> jobApplications) {
        this.jobApplications = jobApplications;
    }

}
