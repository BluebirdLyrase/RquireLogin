/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megalogin;
import static megalogin.Login_Status.Fail;
import static megalogin.Login_Status.Success;

/**
 *
 * @author 6030213005
 */
public class Login {
 private final String[] AUsername = new String[]{"Robin","Popo"};
 private final String[] APassword = new String[]{"1234","5678" };
 private Login_Status Loginstatus;
 private String Username ;
 
 public void SetLoginStatus(String Usrn,String Pss)    {
     for(int i = 0 ; i<= 1;i++){
   if(Usrn.equals(AUsername[i]) && Pss.equals(APassword[i])) 
   {
       this.Loginstatus = Success ;
       this.Username = Usrn ;
       break;
   }
   else this.Loginstatus = Fail ;
   }    
     

 
}
 
 public Login_Status GetLoginStatus() {
   return Loginstatus ;
 }

}