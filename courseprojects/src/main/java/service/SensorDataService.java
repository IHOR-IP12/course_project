package service;

import model.SensorData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SensorDataService {

    private final Map<String, SensorData> sensorDataMap = new HashMap<>();

    public List<SensorData> getAllSensorData() {
        return new ArrayList<>(sensorDataMap.values());
    }

    public SensorData getSensorDataById(String id) {
        return sensorDataMap.get(id);
    }

    public SensorData createSensorData(SensorData sensorData) {
        sensorDataMap.put(sensorData.getId(), sensorData);
        return sensorData;
    }

    public SensorData updateSensorData(String id, SensorData updatedSensorData) {
        sensorDataMap.put(id, updatedSensorData);
        return updatedSensorData;
    }

    public void deleteSensorData(String id) {
        sensorDataMap.remove(id);
    }
}

