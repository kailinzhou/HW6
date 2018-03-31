/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kzhou8
 */
public class Countries {
 private int countryID;
 private String countryName;
 private int population;
 private String region;
 private String countryLanguage;
 
  public Countries() {
        this.countryID = 0;
        this.countryName = "";
        this.population = 0;
        this.region = "";
        this.countryLanguage = "";
    }
    public Countries(int countryID, String countryName, int population, String region, String countryLanguage) {
        this.countryID = countryID;
        this.countryName = countryName;
        this.population = population;
        this.region = region;
        this.countryLanguage = countryLanguage;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(String countryLanguage) {
        this.countryLanguage = countryLanguage;
    }

    @Override
    public String toString() {
        return "Countries{" + "countryID=" + countryID + ", countryName=" + countryName + ", population=" + population + ", region=" + region + ", countryLanguage=" + countryLanguage + '}';
    }
 
}
