package com.springfamework.services;

import com.springfamework.api.v1.model.VendorDTO;
import com.springfamework.api.v1.model.VendorListDTO;


/**
 * Created by Harish on 10/6/17.
 */
public interface VendorService {

    VendorDTO getVendorById(Long id);

    VendorListDTO getAllVendors();

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}
