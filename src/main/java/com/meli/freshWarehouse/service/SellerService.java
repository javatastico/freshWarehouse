package com.meli.freshWarehouse.service;

import com.meli.freshWarehouse.dto.SellerDto;
import com.meli.freshWarehouse.exception.NotFoundException;
import com.meli.freshWarehouse.model.Seller;
import com.meli.freshWarehouse.repository.ISellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService implements ISellerService {

    @Autowired
    ISellerRepo repository;

    @Override
    public Seller getSellerById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Seller not found!"));
    }

    @Override
    public Seller insertSeller(SellerDto sellerDto) {
        return repository.save(sellerDto.toModel());
    }

    @Override
    public void deleteSeller(Long id) {
        getSellerById(id);

        repository.deleteById(id);
    }

    @Override
    public Seller updateSeller(Seller seller) {

        Seller sellerFound = getSellerById(seller.getId());
        sellerFound.setName(seller.getName());
        return repository.save(sellerFound);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
