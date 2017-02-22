/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.airqualitymonitoringsystem.hardware;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Sensor {

    public static List<SensorData> readFile(String filename) throws IOException {
        
        List<SensorData> output = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader(filename));
        
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            SensorData data = new SensorData(nextLine[0], nextLine[1], nextLine[2],
                    nextLine[3]);

            if (nextLine.length >=5) {
                   
                data.setSerialNumber(nextLine[4]);
                data.setSensorLifeExpiry(nextLine[5]);
                data.setOverrangeExposure(nextLine[6]);
            }

            output.add(data);
        }
        return output;
    }
}
