package com.sparta.halls.app.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enquiries {
    private int enquiryId;
    private String enquirerName;
    private String enquirerEmail;
    private String enquirerNumber;
    private String enquiryContent;
    private Integer hallId;
    private Integer enquiryTypeId;
    private Integer publicRoomId;

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
    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    @Basic
    @Column(name = "enquiry_type_id")
    public Integer getEnquiryTypeId() {
        return enquiryTypeId;
    }

    public void setEnquiryTypeId(Integer enquiryTypeId) {
        this.enquiryTypeId = enquiryTypeId;
    }

    @Basic
    @Column(name = "public_room_id")
    public Integer getPublicRoomId() {
        return publicRoomId;
    }

    public void setPublicRoomId(Integer publicRoomId) {
        this.publicRoomId = publicRoomId;
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
        if (enquiryContent != null ? !enquiryContent.equals(enquiries.enquiryContent) : enquiries.enquiryContent != null)
            return false;
        if (hallId != null ? !hallId.equals(enquiries.hallId) : enquiries.hallId != null) return false;
        if (enquiryTypeId != null ? !enquiryTypeId.equals(enquiries.enquiryTypeId) : enquiries.enquiryTypeId != null)
            return false;
        if (publicRoomId != null ? !publicRoomId.equals(enquiries.publicRoomId) : enquiries.publicRoomId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = enquiryId;
        result = 31 * result + (enquirerName != null ? enquirerName.hashCode() : 0);
        result = 31 * result + (enquirerEmail != null ? enquirerEmail.hashCode() : 0);
        result = 31 * result + (enquirerNumber != null ? enquirerNumber.hashCode() : 0);
        result = 31 * result + (enquiryContent != null ? enquiryContent.hashCode() : 0);
        result = 31 * result + (hallId != null ? hallId.hashCode() : 0);
        result = 31 * result + (enquiryTypeId != null ? enquiryTypeId.hashCode() : 0);
        result = 31 * result + (publicRoomId != null ? publicRoomId.hashCode() : 0);
        return result;
    }
}
