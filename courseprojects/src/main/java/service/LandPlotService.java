package service;

import model.LandPlot;
import org.springframework.stereotype.Service;
import repository.LandPlotRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LandPlotService {

    private final LandPlotRepository landPlotRepository;

    public LandPlotService(LandPlotRepository landPlotRepository) {
        this.landPlotRepository = landPlotRepository;
    }

    public List<LandPlot> getAllLandPlots() {
        return landPlotRepository.findAll();
    }

    public LandPlot getLandPlotById(String id) {
        return landPlotRepository.findById(id).orElse(null);
    }

    public LandPlot createLandPlot(LandPlot landPlot) {
        return landPlotRepository.save(landPlot);
    }

    public LandPlot updateLandPlot(String id, LandPlot updatedLandPlot) {
        LandPlot existingLandPlot = landPlotRepository.findById(id).orElse(null);
        if (existingLandPlot != null) {
            existingLandPlot.setName(updatedLandPlot.getName());
            existingLandPlot.setArea(updatedLandPlot.getArea());
            existingLandPlot.setHumidityLevel(updatedLandPlot.getHumidityLevel());
            existingLandPlot.setIlluminationLevel(updatedLandPlot.getIlluminationLevel());
            // Оновіть інші поля, якщо потрібно

            return landPlotRepository.save(existingLandPlot);
        } else {
            return null;
        }
    }

    public void deleteLandPlot(String id) {
        landPlotRepository.deleteById(id);
    }
}
