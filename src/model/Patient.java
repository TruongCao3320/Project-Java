/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author conme
 */
public class Patient implements Serializable{
    public String patientID;
    public  String patientName;
    public Date birthday;
    public Boolean gender;
    public String occupation;
    public String workplace;
    public String phone;
    public String address;
    public String healthInsuranceNumber;
    public String symptom;

    public Patient(){
        
    }
    public Patient(String patientID, String patientName, Date birthday, Boolean gender, String occupation, String workplace, String phone, String address, String healthInsuranceNumber, String symptom) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.birthday = birthday;
        this.gender = gender;
        this.occupation = occupation;
        this.workplace = workplace;
        this.phone = phone;
        this.address = address;
        this.healthInsuranceNumber = healthInsuranceNumber;
        this.symptom = symptom;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

   /* public Boolean getGender() {
        return gender;
    }*/

    public boolean isGender(){
        return gender;
    }
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }

    public void setHealthInsuranceNumber(String healthInsuranceNumber) {
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
    
    public Vector toList(){
        Vector p = new Vector();
        p.add(this.patientID);
        p.add(this.patientName);
        p.add(this.birthday);
        p.add(this.gender);
        p.add(this.occupation);
        p.add(this.workplace);
        p.add(this.phone);
        p.add(this.address);
        p.add(this.healthInsuranceNumber);
        p.add(this.symptom);
        
        return p;
    }
}

