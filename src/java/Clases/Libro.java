/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jdara
 */
public class Libro {
    
    private String code;
    private String name;
    private String paste;
    private String editorial;
    private String date;
    
    public Libro (String code, String name, String paste, String editorial, String date){
    
        this.code=code;
        this.name=name;
        this.paste=paste;
        this.editorial=editorial;
        this.date=date;
    
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaste() {
        return paste;
    }

    public void setPaste(String paste) {
        this.paste = paste;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
