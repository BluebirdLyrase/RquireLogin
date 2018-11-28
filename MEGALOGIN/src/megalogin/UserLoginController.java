/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megalogin;

/**
 *
 * @author 6030213005
 */
import static megalogin.Login_Status.Fail;
import static megalogin.Login_Status.Success;
public class UserLoginController {
     Login L = new Login();
     AccountPermissionIdentifier A = new AccountPermissionIdentifier();
   
    //void Test(){   
    //    new Introduce().setVisible(true);
    //} 
    private String Username ;
    void BtnLoginClick(String Username,String Password){
        L.SetLoginStatus(Username,Password);
        this.Username = Username ;
        LoginSuccess(L.GetLoginStatus());
        
    }
    
    
    void LoginSuccess(Login_Status LoginStatus){
        
        if(LoginStatus == Login_Status.Fail){
        LoginPanel LP = new LoginPanel();
        LP.Status.setText(": ( Login Fail");
        LP.setVisible(true); 
        }
        
        if(LoginStatus == Login_Status.Success){
            System.out.println("Username is "+this.Username);
        A.SetAccountPermission(this.Username);
        
        if(A.GetAccountPermission() == Permission.Regular)
        { new Main().setVisible(true);               }
        else{
        if(A.GetAccountPermission() == Permission.Premium)
        { new MainPro().setVisible(true);                 }
        else System.out.println("Error");
        }
        
            
        }
        
    
    }
}
