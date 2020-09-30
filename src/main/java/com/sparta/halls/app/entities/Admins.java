package com.sparta.halls.app.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admins {
    private int adminId;
    private String adminFirstname;
    private String adminLastname;
    private String adminEmail;
    private String adminPhoneno;
    private String adminRole;

    @Id
    @Column(name = "admin_id")
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "admin_firstname")
    public String getAdminFirstname() {
        return adminFirstname;
    }

    public void setAdminFirstname(String adminFirstname) {
        this.adminFirstname = adminFirstname;
    }

    @Basic
    @Column(name = "admin_lastname")
    public String getAdminLastname() {
        return adminLastname;
    }

    public void setAdminLastname(String adminLastname) {
        this.adminLastname = adminLastname;
    }

    @Basic
    @Column(name = "admin_email")
    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Basic
    @Column(name = "admin_phoneno")
    public String getAdminPhoneno() {
        return adminPhoneno;
    }

    public void setAdminPhoneno(String adminPhoneno) {
        this.adminPhoneno = adminPhoneno;
    }

    @Basic
    @Column(name = "admin_role")
    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admins admins = (Admins) o;

        if (adminId != admins.adminId) return false;
        if (adminFirstname != null ? !adminFirstname.equals(admins.adminFirstname) : admins.adminFirstname != null)
            return false;
        if (adminLastname != null ? !adminLastname.equals(admins.adminLastname) : admins.adminLastname != null)
            return false;
        if (adminEmail != null ? !adminEmail.equals(admins.adminEmail) : admins.adminEmail != null) return false;
        if (adminPhoneno != null ? !adminPhoneno.equals(admins.adminPhoneno) : admins.adminPhoneno != null)
            return false;
        if (adminRole != null ? !adminRole.equals(admins.adminRole) : admins.adminRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId;
        result = 31 * result + (adminFirstname != null ? adminFirstname.hashCode() : 0);
        result = 31 * result + (adminLastname != null ? adminLastname.hashCode() : 0);
        result = 31 * result + (adminEmail != null ? adminEmail.hashCode() : 0);
        result = 31 * result + (adminPhoneno != null ? adminPhoneno.hashCode() : 0);
        result = 31 * result + (adminRole != null ? adminRole.hashCode() : 0);
        return result;
    }
}
