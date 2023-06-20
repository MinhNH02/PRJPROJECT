/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author minhf
 */
public class StudentDBContext extends DBContext{
    public Student get(int id) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "Select id,studentrollnumber,fullname,gender,email,phone_number,[address],[image] From Student\n"
                    + "where id = ?";
            boolean a = connection.isClosed();
            stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("Id"));
                s.setStudentrollnumber(rs.getString("StudentRollNumber"));
                s.setFullname(rs.getString("Full Name"));
                s.setGender(rs.getString("Gender"));
                s.setEmail(rs.getString("Email"));
                s.setPhone_number(rs.getString("Phone_number"));
                s.setAddress(rs.getString("Address"));     
                s.setImage(rs.getString("Immage"));     
                return s;
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
