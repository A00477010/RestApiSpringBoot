package com.restProjectJpa.restproj.Service.ImplmentsService;

import com.restProjectJpa.restproj.Model.CloudVendor;
import com.restProjectJpa.restproj.Repository.RepositoryAccess;
import com.restProjectJpa.restproj.Service.CloudVendorService;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    public CloudVendorServiceImpl(RepositoryAccess repositoryAccess) {
        this.repositoryAccess = repositoryAccess;
    }

    RepositoryAccess repositoryAccess;

    @Override
    public CloudVendor getVendor(String CloudVendorId) {
        return repositoryAccess.findById(CloudVendorId).get();

    }

    @Override
    public void createVendor(CloudVendor vendor) {
        repositoryAccess.save(vendor);

    }

    @Override
    public void updateVendor(CloudVendor vendor) {
        repositoryAccess.save(vendor);
    }

    @Override
    public String deleteVendor(String CloudVendorId) {
        repositoryAccess.deleteById(CloudVendorId);
        return "Vendor deleted sucessfully";
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return repositoryAccess.findAll();

    }
}
