package model;

import lombok.Data;

@Data
public class SensorData {
    private String id;
    private SoilData soilData;
    private LightData lightData;
}
