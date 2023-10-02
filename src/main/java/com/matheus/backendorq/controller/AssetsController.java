package com.matheus.backendorq.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.backendorq.model.Asset;
import com.matheus.backendorq.repository.AssetRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/assets")
@AllArgsConstructor
public class AssetsController {

    private final AssetRepository assetRepository;

    @GetMapping
    public List<Asset> listAll() {
        return assetRepository.findAll();
    }
}
