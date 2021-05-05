import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public abstract class apotek extends javax.swing.JFrame implements pencarian{
    void query(String stmt,String error){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            cn.createStatement().executeUpdate(stmt);        
        } catch (SQLException ex) {
            if (error.isEmpty()) {
                JOptionPane.showMessageDialog(null,ex);
            }else if(error == "noError"){
                //sengaja tidak diisi
            } else{              
                JOptionPane.showMessageDialog(null,error);
            }         
        } 
    }
    
    String[] queryString(String stmt,String error){   
        String ar[] = null;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            ResultSet rs = cn.createStatement().executeQuery(stmt); 
            while(rs.next() ){
                
                //ar[] = rs.getString(1);
            }
        } catch (SQLException ex) {
            if (error.isEmpty()) {
                JOptionPane.showMessageDialog(null,ex);
            }else if(error == "noError"){
                //sengaja tidak diisi
            } else{              
                JOptionPane.showMessageDialog(null,error);
            }         
        } 
        
        return ar;
    }
    
   
}