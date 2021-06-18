
package finalproject;

/**
 *
 * @author saadw
 */
public class Finalproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filePath="login1music.wav";
        Login musicObject=new Login();
        musicObject.playMusic(filePath);
        
        /*try{
            FileWriter fw=new FileWriter("Record.txt");
            PrintWriter pw=new PrintWriter(fw);
            pw.close();
            }
        catch (IOException ex){
            
        }
                */
                
        userpannel up=new userpannel();
        userrecord ur=new userrecord();
        createuser cu=new createuser();
        AdminPannel ap=new AdminPannel();            
    load load=new load();
    load.setVisible(true);
    Login login=new Login();
    adminlogin al=new adminlogin();
    try
    {
        for(int i=0;i<=100;i++)
        {
            Thread.sleep(40);
            load.jLabel1.setText(Integer.toString(i)+"%");
        load.loadingbar.setValue(i);
        if(i==100){
            load.setVisible(false);
            login.setVisible(true);
        }
        }
    }
        catch(Exception e){
            
        }
                
            
    
    
    }
    
}
