package com.carj.carj.Services;

import com.carj.carj.Models.User;
import com.carj.carj.Models.Vehicle;
import com.carj.carj.Repositories.UserRepository;
import com.carj.carj.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    public void addVehicleToUser(UUID userId, Vehicle vehicle) {
        User user = userRepository.getById(userId);

        vehicle.setUser(user);

        vehicleRepository.save(vehicle);
    }

}
