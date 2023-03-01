package com.example.vehicleapione.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class VehicleRoute {
    private Vehicle vehicle;
    private Route route;
}
