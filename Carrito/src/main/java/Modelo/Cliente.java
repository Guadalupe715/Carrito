
package Modelo;


public class Cliente {
    int id_Cliente;
    String Nombres;
    int Telefono;
    String Email;
    String Direccion;
    int Estado;

    public Cliente() {
    }

    public Cliente(int id_Cliente, String Nombres, int Telefono, String Email, String Direccion, int Estado) {
        this.id_Cliente = id_Cliente;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Estado = Estado;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
}
