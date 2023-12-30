package com.restProjectJpa.restproj.Service;

import com.restProjectJpa.restproj.Model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public CloudVendor getVendor(String CloudVendorId);

    public void createVendor(CloudVendor vendor);

    public void updateVendor(CloudVendor vendor);

    public String deleteVendor(String CloudVendorId);

    public List<CloudVendor> getAllCloudVendors();

}
