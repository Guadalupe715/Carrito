package Modelo;

import java.sql.*;

public class Pedido {

    int Id_Pedido;
    int Id_Cliente;
    Date Fecha;
    double Total;
    String Estado;

    public Pedido() {
    }

    public Pedido(int Id_Pedido, int Id_Cliente, Date Fecha, double Total, String Estado) {
        this.Id_Pedido = Id_Pedido;
        this.Id_Cliente = Id_Cliente;
        this.Fecha = Fecha;
        this.Total = Total;
        this.Estado = Estado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
