package megalogin;
 //@author 6030213005
import megalogin.Main.MainController;


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
        int MaxGB = 0;
        String Name = "Error";
        boolean UpgradeBtn = false;
        if(this.LoginStatus == Login_Status.Fail){
        LoginPanel LP = new LoginPanel();
        LP.Status.setText(": ( Login Fail");
        LP.setVisible(true); 
        }
        
        
        MainController m = new MainController();
        AccountPermissionIdentifier A = new AccountPermissionIdentifier();
        if(this.LoginStatus == Login_Status.Success){         
        System.out.println("Username is "+this.Username);
        A.SetAccountPermission(this.Username);
        AccountPermission = A.GetAccountPermission();
        
        if(AccountPermission == Permission.Regular)
        {
            MaxGB = 35 ;
            Name = "Robin [Regular]";
            UpgradeBtn = true ;   
        }
        else{
            
        if(AccountPermission == Permission.Premium)
        {
            MaxGB = 1000 ;
            Name = "Popo [Premium]";
            UpgradeBtn = false ;  ;
                            }
        else System.out.println("Error");
        }
        m.StartMain(MaxGB,Name,UpgradeBtn);
        
        }  
    }
}
