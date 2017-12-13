package com.springfamework.repositories;

import com.springfamework.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Harish on 10/6/17.
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
