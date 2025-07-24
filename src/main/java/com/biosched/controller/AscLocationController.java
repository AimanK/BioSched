package com.biosched.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biosched.entity.AscLocation;
import com.biosched.repository.AscLocationRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/asc")
@RequiredArgsConstructor
public class AscLocationController {

    private final AscLocationRepository ascLocationRespository;

    @PostMapping
    public AscLocation create(@RequestBody AscLocation asc) {
        return ascLocationRespository.save(asc);
    }


    @GetMapping
    public List<AscLocation> getAll() {
        return ascLocationRespository.findAll();
    }
    

}
