
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

/**
 *
 * @author kzhou8
 */
public class ReadQuery {
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
    Properties props= new Properties();
    InputStream instr= getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String ur1=props.getProperty("server.name");
    String username=props.getProperty("user.name");
    String password =props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn=DriverManager.getConnection(ur1,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void doRead(){
        try {
            String query="Select * from Countries";
            PreparedStatement ps=conn.prepareStatement(query);
            this.results=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getHTMLTable(){
        String table="";
        table+="<table>";
        try {
            while(this.results.next()){
                Countries country=new Countries();
                country.setCountryID(this.results.getInt("countryID"));
                country.setCountryName(this.results.getString("CountryName"));
                country.setPopulation(this.results.getInt("Population"));
                country.setRegion(this.results.getString("Region"));
                country.setCountryLanguage(this.results.getString("CountryLanguage"));
                
                table+="<tr>";
                table+="<td>";
                table+= country.getCountryID();
                table+="</td>";
                
                table+="<td>";
                table+= country.getCountryName();
                table+="</td>";
                
                table+="<td>";
                table+= country.getPopulation();
                table+="</td>";   
                
                table+="<td>";
                table+= country.getRegion();
                table+="</td>";
                
                table+="<td>";
                table+= country.getCountryLanguage();
                table+="</td>";
                
                table+="<td>";
                table+="<a href=delete?countryID="+country.getCountryID()+">Delete</a>";
                table+="</td>";
                table+="</tr>";
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        table+="</table>";
                return table;
    }
}
