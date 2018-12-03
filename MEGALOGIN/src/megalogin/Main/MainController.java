/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megalogin.Main;

import megalogin.Main.Upload.Upload;

public class MainController {
    
    private double GBUsed = 0 ;
    private double MaxGB ;
    private int MaxGBshow;
    private Main m = new Main();
    private Upload u = new Upload();
    
    public void DownloadBtnClick(){}
    
    public void UploadBtnClick(){
    
        
        u.setVisible(true);        
    //GBUsed = u.GetGBUsedResult();
    }
    
    public void HistoryBtnClick(){
    
    }
    
    private void ButtonChecker(){
    
    
    }
    
    private void MainVisible(){
        m.storage.setText("used storage "+GBUsed+" GB of "+MaxGBshow+" GB");
        m.setVisible(true);
        
    }
    
    public void StartMain(int MaxGB,String Name,boolean UpgradeBtn){
            this.MaxGB = new Double(MaxGB);
            MaxGBshow = MaxGB;
            m.name.setBorder(javax.swing.BorderFactory.createTitledBorder
            (null, Name, 
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
            javax.swing.border.TitledBorder.DEFAULT_POSITION, 
            new java.awt.Font("Tahoma", 0, 24)));
            m.storage.setText("used storage "+GBUsed+" GB of "+MaxGBshow+" GB");
            m.Upgrade.setVisible(UpgradeBtn);
            m.setVisible(true);
    }
    
    
}
