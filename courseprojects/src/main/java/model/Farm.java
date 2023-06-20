package model;

import lombok.Data;

import java.util.List;

@Data
public class Farm {
    private String id;
    private List<LandPlot> landPlots;
    private List<SensorData> sensorDataList;
}