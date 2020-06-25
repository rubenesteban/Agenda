/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Usuario
 */
public class ClsMateria {
    private String _nombre;
    private int _numest;

    public ClsMateria(String nombre, int numest) {
        this._nombre = nombre;
        this._numest=numest;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getNumest() {
        return _numest;
    }

    public void setNumest(int _numest) {
        this._numest = _numest;
    }
}
