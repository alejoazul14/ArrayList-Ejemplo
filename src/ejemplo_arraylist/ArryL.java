/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo_arraylist;

/**
 *
 * @author Lavendaño
 */
public class ArryL {
    
    private int id;
    private String nom;
 
    public ArryL(int cant, String nom){
        this.id = cant;
        this.nom  = nom;        
    }
 
    public int getId() {
        return id;
    }
 
    public String getNom() {
        return nom;
    }
 
    public void setNom(String d) {
        this.nom = d;        
    }    
    
    
}
