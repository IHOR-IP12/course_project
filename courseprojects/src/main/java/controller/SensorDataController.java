package controller;

import model.SensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.SensorDataService;

import java.util.List;

@RestController
@RequestMapping("/sensordata")
public class SensorDataController {

    private final SensorDataService sensorDataService;

    @Autowired
    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    @GetMapping
    public List<SensorData> getAllSensorData() {
        return sensorDataService.getAllSensorData();
    }

    @GetMapping(path ="/{id}")
    public SensorData getSensorDataById(@PathVariable String id) {
        return sensorDataService.getSensorDataById(id);
    }

    @PostMapping
    public SensorData createSensorData(@RequestBody SensorData sensorData) {
        return sensorDataService.createSensorData(sensorData);
    }

    @PutMapping("/{id}")
    public SensorData updateSensorData(@PathVariable String id, @RequestBody SensorData sensorData) {
        return sensorDataService.updateSensorData(id, sensorData);
    }

    @DeleteMapping("/{id}")
    public void deleteSensorData(@PathVariable String id) {
        sensorDataService.deleteSensorData(id);
    }
}
