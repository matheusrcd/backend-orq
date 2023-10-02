package com.matheus.backendorq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheus.backendorq.model.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long>{
    
}
