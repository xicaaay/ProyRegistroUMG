package BACKEND;

public class clsPersona {

    // CONSTRUCTOR
    public clsPersona() {
    }

    public clsPersona(String CUI, String Nombre) {
        this.CUI = CUI;
        this.Nombre = Nombre;
    }

    public clsPersona(String CUI, String Nombre, String sexo, String Correo) {
        this.CUI = CUI;
        this.Nombre = Nombre;
        this.sexo = sexo;
        this.Correo = Correo;
    }
    
    
    
    // ATRIBUTOS Y VARIABLES GLOBALES
    String CUI;
    String Nombre;
    String sexo;
    String Correo;
    
    // MÉTODOS

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    

    public String getCUI() {
        return CUI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCorreo() {
        return Correo;
    }
    
}