/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author nvbale
 */
@Entity
public class Paciente extends Persona implements Serializable {

//    private int id_paciente;
    private boolean tiene_OS;
    private String tipo_sangre;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy = "pacient")
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(boolean tiene_OS, String tipo_sangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tiene_OS = tiene_OS;
        this.tipo_sangre = tipo_sangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

//    public int getId_paciente() {
//        return id_paciente;
//    }
//
//    public void setId_paciente(int id_paciente) {
//        this.id_paciente = id_paciente;
//    }
    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

}
