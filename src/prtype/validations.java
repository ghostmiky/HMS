
package prtype;

import javax.swing.JOptionPane;


public class validations {
 
  public boolean vcus(String name){
        boolean con1 = false;
          if(name.isEmpty()){
              con1 = false;
              JOptionPane.showMessageDialog(null,"One or more fields are empty");
              
              return con1;
              
          }  
          else
              return true;
                 }
   public boolean vnum(String number){
        boolean c = false;
       
       
        return c;
   }
    
}

