/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Controlador.tda.lista.ListaEnlazadaServices;

public interface InterfazDao <T> {
    public void guardar(T dato) throws Exception;
    public void modificar(T dato, Integer pos) throws Exception;
    public ListaEnlazadaServices<T> listar();
}
