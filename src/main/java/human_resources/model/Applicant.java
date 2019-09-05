/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jelena
 */
@Entity

public class Applicant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_Name")
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String personalIdentificationNumber;
    private String applicantCV;
    private String motivationalLetter;

    public Applicant() {
    }

    public Applicant(Integer id, String firstName, String lastName, String address,String phoneNumber, String email, String personalIdentificationNumber, String applicantCV, String motivationalLetter) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.personalIdentificationNumber = personalIdentificationNumber;
        this.applicantCV = applicantCV;
        this.motivationalLetter = motivationalLetter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }

    public void setPersonalIdentificationNumber(String personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
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

}
