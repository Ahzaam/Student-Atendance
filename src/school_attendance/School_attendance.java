package school_attendance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import static school_attendance.attendance_ui.detid;


public class School_attendance {
    
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    
    
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        try {
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
            
        } catch (InstantiationException ex) {
            
            Logger.getLogger(School_attendance.class.getName()).log(Level.SEVERE, null, ex);
            
            
        } catch (IllegalAccessException ex) {
            
            Logger.getLogger(School_attendance.class.getName()).log(Level.SEVERE, null, ex);
           
            
        } catch (UnsupportedLookAndFeelException ex) {
            
            Logger.getLogger(School_attendance.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
       dataRead();
       new LogIn().setVisible(true);
       //new attendance_ui().setVisible(true);
       //new adding().setVisible(true);
       //new Diisplay().setVisible(true);
    }
    
    public static void dataWrite(String run)  {
        

        Connection conn = null ;
        
        try{
            
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement(); 
            
            stmt.executeUpdate(run);
            System.out.println("Data Writed "+run);
            
        }catch(SQLException e){
            
            System.out.println("Exception Happend  " + e.getMessage());
            
        }
       
            
    }
    public static void dataRead(){

       Connection conn = null ;
       
         try{
             
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
                    
            ResultSet rs = stmt.executeQuery("SELECT id FROM student_details ;");
            
            while(rs.next()) {
                
                int id = rs.getInt("id");
                System.out.print(id);
                detid(id);
               
            }

         
        }catch(SQLException e){
            
            System.out.println("Exception Happend " + e.getMessage());
        
        }

    }
    
    public static void refreshing(){
        new attendance_ui().setVisible(true);
    }

}
/*
CREATE TABLE student_details (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30),
DOB DATE NOT NULL,
address VARCHAR(50) NOT NULL,
phone VARCHAR(15) NOT NULL,
gender VARCHAR(7) NOT NULL
);
INSERT INTO student_details(name, DOB, address, phone, gender) VALUES('Anfas',	'2004-05-06', 'D72 Hapugastalawa, Nawalapitiya'	, '0775528384', 	'Male');
INSERT INTO student_details(name, DOB, address, phone, gender) VALUES('Sharfa', '2000-00-00', 'Mapakandha, Nawalapitiya', '0000000000', 'Female');
INSERT INTO student_details(name, DOB, address, phone, gender) VALUES('Ahzam',	'2001-08-01', 'D72 Hapugastalawa, Nawalapitiya', '0765506609', 'Male');
INSERT INTO student_details(name, DOB, address, phone, gender) VALUES('Arshaad', '0000-00-01', 'Mawanalla',	'0770515434', 'Male');
INSERT INTO student_details(name, DOB, address, phone, gender) VALUES('Yusrie',	'2001-00-00',	'Illavathrura, Gampola', '0763503045',	'Male');
INSERT INTO student_details(name, DOB, address, phone, gender) VALUES('Rahmaan',	'2000-02-03',	'Hemmathagama, Mavanalla',	'0767911140',	'Male');


*/

