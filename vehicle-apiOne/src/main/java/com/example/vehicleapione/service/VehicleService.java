package com.example.vehicleapione.service;
import com.example.vehicleapione.bean.Vehicle;
import com.example.vehicleapione.dao.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepo;
    @Autowired
    public VehicleService(VehicleRepository vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }
    // Create Vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicleRepo.save(vehicle);
    }
    // Get Vehicle
    public Optional<Vehicle> getVehicle(Long vehicleId){
        return vehicleRepo.findById(vehicleId);
    }

    // Get Vehicles
    public List<Vehicle> getVehicles(){
        return vehicleRepo.findAll();
    }
    // Get Vehicle By GroupId
    public List<Vehicle> getVehiclesById(Long groupId){
        return vehicleRepo.getVehiclesByGroupId(groupId);
    }
    // Update Vehicle Group iD
    public void updateVehicleGroupId(Long vehicleId, Long groupId){
        Vehicle vehicle = vehicleRepo.findById(vehicleId).get();
        vehicle.setGroupId(groupId);
        vehicleRepo.save(vehicle);
    }
    // Update Vehicle State and assigne time
    public Vehicle updateVehicleState(Long vehicleId, boolean state,int time){
        Vehicle vehicle = vehicleRepo.findById(vehicleId).get();
        vehicle.setAvailable(state);
        vehicle.setAvailableIn(time);
        vehicleRepo.save(vehicle);
        return vehicle;
    }


    // Remove Vehicle
    public void removeVehicle(Long vehicleId) {
        vehicleRepo.deleteById(vehicleId);
    }
}
