package com.restProjectJpa.restproj.Repository;

import com.restProjectJpa.restproj.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAccess extends JpaRepository<CloudVendor, String> {
}
