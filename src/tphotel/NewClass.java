/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tphotel;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Amine
 */
public class NewClass {
    public static void main(String []args) throws Exception{
        
        
       int j=1;
       
       for(char c = 'A'; c <= 'D'; c++){
        for(int i=1;i<=7;i++){
            
        for (int z=1;z<=2;z++){
       
          post(j,i,c,10000,"Disponible");  
          j++;
        }
        }
        
        for(int i=8;i<=12;i++){
            
          for (int z=1;z<=2;z++){  
         post(j,i,c,12500,"Disponible");  
          j++;   
        }
        }
        
        for(int i=12;i<=14;i++){
            
          for (int z=1;z<=2;z++){  
         post(j,i,c,15000,"Disponible");  
          j++;   
        }
        }
        
        
       }
   
      
      
      
      
      
       
    
    }
    
    
    
    
     public static Connection con() throws SQLException{
       Connection con=null;
       try{
           
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelgazell","root","");
          
           
       }catch(HeadlessException | ClassNotFoundException | SQLException e){
           
           JOptionPane.showMessageDialog(null,e);
           
       }
       
       return  con;
       
   } 
    
     public static void post(int NumSalle,int NumEtage,char bloc,int PrixS,String Etat)throws Exception{
       
       
       
       final int var0=NumSalle;
       final int var1=NumEtage;
       final char var2=bloc;
       final int var3=PrixS;
       final String var4=Etat;
       
       
       try{
           Connection cont=con();
           PreparedStatement posted=cont.prepareStatement("INSERT INTO salle (NumSalle,NumEtage, block, PrixS, Etat) VALUES('"+var0+"','"+var1+"','"+var2+"','"+var3+"','"+var4+"')");
           posted.executeUpdate();
           
       }catch(Exception e){
          System.out.println(e);
       }
       finally{
           System.out.println("Function complited!");
       }
   }
   
    
    
}
