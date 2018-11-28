package megalogin;
import static megalogin.Permission.Regular;
import static megalogin.Permission.Premium;
public class AccountPermissionIdentifier {
private final String[] AUsername = new String[]{"Robin","Popo"};
private final Permission[] APermission = new Permission[]{Regular,Premium};  
    private Permission AccountPermission;
    public void SetAccountPermission(String Account){
        System.out.println("Begin SetAP");
        int i;
           for(i = 0 ; i<= 1;i++){ 
               System.out.println("Loop");
               
    if( Account.equals(AUsername[i])){
        AccountPermission = APermission[i];
        System.out.println("finish SetAP");
        break;                  
    }}}
    public Permission GetAccountPermission(){
        System.out.println("finish GetAP");
    return AccountPermission ;
    }
}
