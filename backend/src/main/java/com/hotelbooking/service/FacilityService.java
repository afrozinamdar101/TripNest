package com.hotelbooking.service;

import com.hotelbooking.models.Facility;
import com.hotelbooking.repository.FacilityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService {
  private FacilityRepository amenityRepository;

  public FacilityService(FacilityRepository amenityRepository) {
    this.amenityRepository = amenityRepository;
  }

  public void addAmenity(Facility amenity) {
    amenityRepository.save(amenity);
  }

  public List<Facility> getAllAmenities() {
    return (List<Facility>) amenityRepository.findAll();
  }

  public Optional<Facility> getAmenityById(String name) {
    return amenityRepository.findById(name);
  }
}
