package com.hotelbooking.controller;

import com.hotelbooking.models.Facility;
import com.hotelbooking.service.FacilityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://cmpe273projectf.s3-website-us-east-1.amazonaws.com/"}, maxAge = 40000)
public class FacilityController {

    private final FacilityService FacilityService;

    public FacilityController(FacilityService FacilityService) {
        this.FacilityService = FacilityService;
    }

    @PostMapping("/amenities")
    public void addFacility(@RequestBody Facility Facility) {
        FacilityService.addFacility(Facility);
    }

    @GetMapping("/amenities")
    public List<Facility> getAllAmenities() {
        return FacilityService.getAllAmenities();
    }

    @GetMapping("/amenities/{id}")
    public Optional<Facility> getFacilityById(@PathVariable String name)  {
        return FacilityService.getFacilityById(name);
    }
}
