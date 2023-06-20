package model;

import lombok.Data;

@Data
public class LandPlot {
    private String id;
    private String name;
    private double area;
    private double humidityLevel;
    private double illuminationLevel;
    // Додайте інші необхідні поля

    public LandPlot(String id, String name, double area, double humidityLevel, double illuminationLevel) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.humidityLevel = humidityLevel;
        this.illuminationLevel = illuminationLevel;
        // Ініціалізуйте інші поля, якщо потрібно
    }

    // Геттери та сеттери для всіх полів

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getHumidityLevel() {
        return humidityLevel;
    }

    public void setHumidityLevel(double humidityLevel) {
        this.humidityLevel = humidityLevel;
    }

    public double getIlluminationLevel() {
        return illuminationLevel;
    }

    public void setIlluminationLevel(double illuminationLevel) {
        this.illuminationLevel = illuminationLevel;
    }

    // Додайте інші геттери та сеттери для інших полів, якщо потрібно
}
