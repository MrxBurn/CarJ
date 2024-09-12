package com.carj.carj.Controllers;

import com.carj.carj.Models.Vehicle;
import com.carj.carj.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping("/addVehicle")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle, @RequestParam UUID userId) {
        vehicleService.addVehicleToUser(userId, vehicle);

        returneaza si userId in response
        return vehicle;
    }


}
