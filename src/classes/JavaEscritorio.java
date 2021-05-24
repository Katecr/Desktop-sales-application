
package classes;

import Forms.frmLogin;

public class JavaEscritorio {

    public static void main(String[] args) {
        
        //Create the data object
        Data myData = new Data();
        
        //We call the login form
        frmLogin myLogin = new frmLogin();
        myLogin.setData(myData);
        myLogin.setLocationRelativeTo(null);
        myLogin.setVisible(true);
    }
    
}
