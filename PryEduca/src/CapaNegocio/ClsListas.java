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
public class ClsListas {
    public ClsEstudiante []lstest;
    public ClsMateria []lstmat;
    public int numeroest;
    public int numeromat;
    public ClsListas (){
        lstest=new ClsEstudiante[50];
        lstmat=new ClsMateria[50];
        numeroest=0;
        numeromat=0;
    }
}
