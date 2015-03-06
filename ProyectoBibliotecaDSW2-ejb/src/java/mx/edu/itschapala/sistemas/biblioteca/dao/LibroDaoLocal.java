/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Libro;

/**
 *
 * @author Admin
 */
@Local
public interface LibroDaoLocal {

    void crear(Libro libro);

    void editar(Libro libro);

    void remover(Libro libro);

    Libro buscarPorId(Object id);

    List<Libro> buscarTodos();

    List<Libro> buscarPorRango(int[] range);

    int contar();
    
}
