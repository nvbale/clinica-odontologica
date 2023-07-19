package logica;

import persistencia.ControladoraPersistencia;

/**
 *
 * @author nvbale
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(int id, String usuario, String contrasenia, String rol) {
        Usuario usu = new Usuario(id, usuario, contrasenia, rol);
        controlPersis.crearUsuario(usu);
    }

}
