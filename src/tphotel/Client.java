/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tphotel;

import java.sql.Date;

/**
 *
 * @author Amine
 */
public class Client {
    private int id;
    private String nom,prenom,date,lieu,nationalite,profession,mdp;
    public Client(int id,String nom,String prenom,String date,String lieu,String nationalite,String profession,String mdp){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;  
        this.date=date;
        this.lieu=lieu;
        this.nationalite=nationalite;
        this.profession=profession;
        this.mdp=mdp;
    }
    public int getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    
    public String getPrenom(){
        return prenom;
    }
    public String getdate(){
        return date;
    }
    
    public String getlieu(){
        return lieu;
    }
    
    
    public String getNationalite(){
        return nationalite;
    }
    
    public String getProfession(){
        return profession;
    }
    
    
    public String getmdp(){
        return mdp;
    }
    
}
