package controller;

import model.LandPlot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.LandPlotService;

import java.util.List;
@RestController
@RequestMapping("/landplots")
public class LandPlotController {

    private final LandPlotService landPlotService;

    public LandPlotController(LandPlotService landPlotService) {
        this.landPlotService = landPlotService;
    }

    @GetMapping
    public List<LandPlot> getAllLandPlots() {
        return landPlotService.getAllLandPlots();
    }

    @GetMapping("/{id}")
    public LandPlot getLandPlotById(@PathVariable String id) {
        return landPlotService.getLandPlotById(id);
    }

    @PostMapping
    public LandPlot createLandPlot(@RequestBody LandPlot landPlot) {
        return landPlotService.createLandPlot(landPlot);
    }

    @PutMapping("/{id}")
    public LandPlot updateLandPlot(@PathVariable String id, @RequestBody LandPlot landPlot) {
        return landPlotService.updateLandPlot(id, landPlot);
    }

    @DeleteMapping("/{id}")
    public void deleteLandPlot(@PathVariable String id) {
        landPlotService.deleteLandPlot(id);
    }
}
