package com.sparta.halls.app.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Enquiries {
    private int enquiryId;
    private String enquirerName;
    private String enquirerEmail;
    private String enquirerNumber;
    private String enquiryContent;
    private int hallId;

    @Id
    @Column(name = "enquiry_id")
    public int getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(int enquiryId) {
        this.enquiryId = enquiryId;
    }

    @Basic
    @Column(name = "enquirer_name")
    public String getEnquirerName() {
        return enquirerName;
    }

    public void setEnquirerName(String enquirerName) {
        this.enquirerName = enquirerName;
    }

    @Basic
    @Column(name = "enquirer_email")
    public String getEnquirerEmail() {
        return enquirerEmail;
    }

    public void setEnquirerEmail(String enquirerEmail) {
        this.enquirerEmail = enquirerEmail;
    }

    @Basic
    @Column(name = "enquirer_number")
    public String getEnquirerNumber() {
        return enquirerNumber;
    }

    public void setEnquirerNumber(String enquirerNumber) {
        this.enquirerNumber = enquirerNumber;
    }

    @Basic
    @Column(name = "enquiry_content")
    public String getEnquiryContent() {
        return enquiryContent;
    }

    public void setEnquiryContent(String enquiryContent) {
        this.enquiryContent = enquiryContent;
    }

    @Basic
    @Column(name = "hall_id")
    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Enquiries enquiries = (Enquiries) o;

        if (enquiryId != enquiries.enquiryId) return false;
        if (enquirerName != null ? !enquirerName.equals(enquiries.enquirerName) : enquiries.enquirerName != null)
            return false;
        if (enquirerEmail != null ? !enquirerEmail.equals(enquiries.enquirerEmail) : enquiries.enquirerEmail != null)
            return false;
        if (enquirerNumber != null ? !enquirerNumber.equals(enquiries.enquirerNumber) : enquiries.enquirerNumber != null)
            return false;
        if (!Objects.equals(enquiryContent, enquiries.enquiryContent))
            return false;
        if (!(hallId==enquiries.hallId) ) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = enquiryId;
        result = 31 * result + (enquirerName != null ? enquirerName.hashCode() : 0);
        result = 31 * result + (enquirerEmail != null ? enquirerEmail.hashCode() : 0);
        result = 31 * result + (enquirerNumber != null ? enquirerNumber.hashCode() : 0);
        result = 31 * result + (enquiryContent != null ? enquiryContent.hashCode() : 0);
        result = 31 * result + (hallId);
        return result;
    }
}
