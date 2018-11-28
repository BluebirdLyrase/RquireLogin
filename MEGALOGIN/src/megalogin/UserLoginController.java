package megalogin;
 //@author 6030213005
public class UserLoginController {
        private String Username ;
        private Login_Status LoginStatus;
        private Permission AccountPermission;
    void Back(){   
    new Introduce().setVisible(true);
    } 
    void BtnLoginClick(String Username,String Password){
        Login L = new Login();
        L.SetLoginStatus(Username,Password);
        this.Username = Username ;
        LoginSuccess(L.GetLoginStatus());
    }
    private void LoginSuccess(Login_Status LoginStatus){
        this.LoginStatus = LoginStatus;
        if(this.LoginStatus == Login_Status.Fail){
        LoginPanel LP = new LoginPanel();
        LP.Status.setText(": ( Login Fail");
        LP.setVisible(true); 
        }
        Main m = new Main();
        AccountPermissionIdentifier A = new AccountPermissionIdentifier();
        if(this.LoginStatus == Login_Status.Success){
            System.out.println("Username is "+this.Username);
        A.SetAccountPermission(this.Username);
        AccountPermission = A.GetAccountPermission();
        if(AccountPermission == Permission.Regular)
        { 
            m.name.setBorder(javax.swing.BorderFactory.createTitledBorder
                (null, "Robin [Regular]", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24)));
            m.storage.setText("used storage 1.42 mb of 35 GB");
            m.Upgrade.setVisible(true);
            m.setVisible(true);               
        }
        else{
            
        if(AccountPermission == Permission.Premium)
        { 
            m.name.setBorder(javax.swing.BorderFactory.createTitledBorder
                (null, "Popo [Premium]", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24)));
            m.storage.setText("used storage 3 GB of 1 TB");
            m.Upgrade.setVisible(false);
            m.setVisible(true);
                            }
        else System.out.println("Error");
        }       
        }  
    }
}
