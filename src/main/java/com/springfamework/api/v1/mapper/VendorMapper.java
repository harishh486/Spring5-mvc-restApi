package com.springfamework.api.v1.mapper;

import com.springfamework.domain.Vendor;
import com.springfamework.api.v1.model.VendorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by Harish on 10/6/17.
 */
@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
