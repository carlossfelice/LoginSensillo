
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class ControladoraPersistencia {
    UsuarioJpaController usuJpa=new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
//        List<Usuario> listaUsuario=usuJpa.findUsuarioEntities();
//        return listaUsuario;
            return usuJpa.findUsuarioEntities();
    }
    
}
