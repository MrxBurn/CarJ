package com.carj.carj.Repositories;

import com.carj.carj.Models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    
}
