package com.restProjectJpa.restproj.Controller;

import com.restProjectJpa.restproj.Model.CloudVendor;
import com.restProjectJpa.restproj.Service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/getVendor")
public class CloudVendorApiController {
    CloudVendor cloudVendor;
    CloudVendorService cloudVendorService;

    public CloudVendorApiController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
 //Getting details of a specific cloudVendor
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getVendor(vendorId);
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.deleteVendor(vendorId);
    }
    //Getting details of all vendors
    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloundVendor) {
        cloudVendorService.createVendor(cloundVendor);
        return "Vendor created";

    }
    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloundVendor) {
        cloudVendorService.updateVendor(cloundVendor);
        return "Vendor updated";

    }



}
