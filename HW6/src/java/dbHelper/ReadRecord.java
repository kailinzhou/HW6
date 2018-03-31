/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Countries;


public class ReadRecord {
    private Connection conn;
    private ResultSet results;
    private Countries country=new Countries();
    private int countryID;
    public ReadRecord(int countryID){
    
    Properties props= new Properties();
    InputStream instr= getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String ur1=props.getProperty("server.name");
    String username=props.getProperty("user.name");
    String password =props.getProperty("user.password");
    
    this.countryID=countryID;
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn=DriverManager.getConnection(ur1,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
 
    public void doRead() {
        
        try {
            //set up a string to hold our query
            String query = "SELECT * FROM Countries WHERE CountryID = ?";
            //create a preparedstatement using our query string
            PreparedStatement ps = conn.prepareStatement(query);
            //fill in the preparedstatement
            ps.setInt(1,countryID);
            //execute the query
            this.results = ps.executeQuery();
            
            this.results.next();
            
            country.setCountryID(this.results.getInt("countryID"));
            country.setCountryName(this.results.getString("countryName"));
            country.setPopulation(this.results.getInt("population"));
            country.setRegion(this.results.getString("region"));
            country.setCountryLanguage(this.results.getString("countryLanguage"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public Countries getCountryID(){
        
        return this.country;
    }
}