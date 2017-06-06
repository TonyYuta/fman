package com.rhmsoft.fm;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by aolyva on 5/10/17.
 */
public class ExtData {

    /**
     * @throws FileNotFoundException
     */
    public ExtData() throws FileNotFoundException {

        File file = new File("src/main/resources/locators.properties");
        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties prop = new Properties();

        //load properties file
        try {
            prop.load(fileInput);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }






}
