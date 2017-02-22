/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.airqualitymonitoringsystem.hardware;

/**
 *
 * @author Administrator
 */
public class SensorData {

    private String fname;
    private String time;
    private String carbonMonoxide;
    private String warningLevel;
    private String serialNumber = "";
    private String sensorLifeExpiry = "";
    private String overrangeExposure = "";

    SensorData(String fname, String time, String carbonMonoxide, String warningLevel) {
        this.fname = fname;
        this.time = time;
        this.carbonMonoxide = carbonMonoxide;
        this.warningLevel = warningLevel;

    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the carbonMonoxide
     */
    public String getCarbonMonoxide() {
        return carbonMonoxide;
    }

    /**
     * @param carbonMonoxide the carbonMonoxide to set
     */
    public void setCarbonMonoxide(String carbonMonoxide) {
        this.carbonMonoxide = carbonMonoxide;
    }

    /**
     * @return the warningLevel
     */
    public String getWarningLevel() {
        return warningLevel;
    }

    /**
     * @param warningLevel the warningLevel to set
     */
    public void setWarningLevel(String warningLevel) {
        this.warningLevel = warningLevel;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the sensorLifeExpiry
     */
    public String getSensorLifeExpiry() {
        return sensorLifeExpiry;
    }

    /**
     * @param sensorLifeExpiry the sensorLifeExpiry to set
     */
    public void setSensorLifeExpiry(String sensorLifeExpiry) {
        this.sensorLifeExpiry = sensorLifeExpiry;
    }

    /**
     * @return the overrangeExposure
     */
    public String getOverrangeExposure() {
        return overrangeExposure;
    }

    /**
     * @param overrangeExposure the overrangeExposure to set
     */
    public void setOverrangeExposure(String overrangeExposure) {
        this.overrangeExposure = overrangeExposure;
    }

    @Override
    public String toString() {
        return "fname:" + fname + "\n"
                + "time:" + time + "\n"
                + "carbonMonoxide:" + carbonMonoxide + "\n"
                + "warningLevel:" + warningLevel + "\n"
                + "serialNumber:" + serialNumber + "\n"
                + "sensorLifeExpiry:" + sensorLifeExpiry + "\n"
                + "overrangeExposure:" + overrangeExposure + "\n";
    }

}
