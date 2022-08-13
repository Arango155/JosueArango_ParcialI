
package Clases;

public class Book {
    private String code;
    private String name;
    private String paste;
    private String editorial;
    private String date;
  
    
    public Book(String codigo, String nombre, String correo, String direccion, String date){
        this.code=codigo;
        this.name=nombre;
        this.paste=correo;
        this.editorial=direccion;     
        this.date=date;
    }
    
    public Book (){
        this.name="Alumno de ejemplo";
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
