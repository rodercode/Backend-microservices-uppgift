package com.example.vehicleapione.bean;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Route {
    private long id;
    private String startLocation;
    private String endLocation;
    private int travelTime;

}
