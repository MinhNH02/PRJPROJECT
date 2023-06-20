/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;


/**
 *
 * @author minhf
 */
public class UserDBContext extends DBContext{
     public User get(String username, String password) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "select Username, Password, isStudent from [User]\n"
                + "  WHERE [username] = ?\n"
                + "  AND [password] = ?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            rs = stm.executeQuery();
            
            if(rs.next())
            {
                User s = new User();
                s.setUsername(rs.getString("Username"));
                s.setIsStudent(rs.getBoolean("isStudent"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                rs.close();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
        
    }
}
