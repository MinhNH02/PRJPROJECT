/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhf
 */
public class Admin {
private int Adminid;
private String Adminname;

    public Admin() {
    }

    public Admin(int Adminid, String Adminname) {
        this.Adminid = Adminid;
        this.Adminname = Adminname;
    }

    public int getAdminid() {
        return Adminid;
    }

    public void setAdminid(int Adminid) {
        this.Adminid = Adminid;
    }

    public String getAdminname() {
        return Adminname;
    }

    public void setAdminname(String Adminname) {
        this.Adminname = Adminname;
    }
    

}
