/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author Ivan Flavano
 */

import java.awt.Color;
import java.io.*;
import java.util.*;
public class SettingsClass {
    
    
    //Settings for FILE DATASOURCE
    //Settings for COLOR THEME
    //Contains the STACK for the Data Source
    
    private static File fl_DataSource = new File("Data.tcd");
    
    
    
    
    
    // -------------------------- ACCESSORS -------------------------- //
    
    
    public static File getDataSource(){
        return fl_DataSource;
    }
    
    // -------------------------- MUTATORS -------------------------- //
    
    
    
    public static void setDataSource(File newFile){
        fl_DataSource = newFile;
    }
    public static void setDataSource(String newStrFile){
        fl_DataSource = new File(newStrFile);
    }
    
    
    
    
    
    
    
    
}
