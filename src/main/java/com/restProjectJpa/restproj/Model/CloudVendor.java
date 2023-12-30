package com.restProjectJpa.restproj.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vendor_detail")
public class CloudVendor {
    @Id
    private String vendorId;
    private String Name;
    private String Address;
    private String PhoneNumber;
    private String secretId;

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String Name, String address, String phoneNumber, String secretId) {
        this.vendorId = vendorId;
        this.Name = Name;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
        this.secretId = secretId;
    }
}
