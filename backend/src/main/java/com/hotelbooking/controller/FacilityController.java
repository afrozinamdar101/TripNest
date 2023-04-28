package com.hotelbooking.controller;

import com.hotelbooking.models.Facility;
import com.hotelbooking.service.FacilityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://cmpe273projectf.s3-website-us-east-1.amazonaws.com/"}, maxAge = 40000)
public class AmenityController {

    private final FacilityService FacilityService;

    public AmenityController(FacilityService FacilityService) {
        this.FacilityService = FacilityService;
    }

    @PostMapping("/amenities")
    public void addAmenity(@RequestBody Amenity amenity) {
        FacilityService.addAmenity(amenity);
    }

    @GetMapping("/amenities")
    public List<Amenity> getAllAmenities() {
        return FacilityService.getAllAmenities();
    }

    @GetMapping("/amenities/{id}")
    public Optional<Amenity> getAmenityById(@PathVariable String name)  {
        return FacilityService.getAmenityById(name);
    }
}
