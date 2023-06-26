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
private String aemail;
private String aphonenumber;
private String aadress;
private String aimage;

    public Admin() {
    }

    public Admin(int Adminid, String Adminname, String aemail, String aphonenumber, String aadress, String aimage) {
        this.Adminid = Adminid;
        this.Adminname = Adminname;
        this.aemail = aemail;
        this.aphonenumber = aphonenumber;
        this.aadress = aadress;
        this.aimage = aimage;
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

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    public String getAphonenumber() {
        return aphonenumber;
    }

    public void setAphonenumber(String aphonenumber) {
        this.aphonenumber = aphonenumber;
    }

    public String getAadress() {
        return aadress;
    }

    public void setAadress(String aadress) {
        this.aadress = aadress;
    }

    public String getAimage() {
        return aimage;
    }

    public void setAimage(String aimage) {
        this.aimage = aimage;
    }
    

    
}
