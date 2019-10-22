package ro.library.library;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaPostgreSqlLVersion {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/library";
        String username = "postgres";
        String password = "[!T@ni@_1979]";


        try (Connection con = DriverManager.getConnection ( url, username, password );
             Statement st = con.createStatement ();
             ResultSet rs = st.executeQuery ( "SELECT * from AUTHORITY " )) {

            while (rs.next ()) {
                System.out.println ( rs.getString ( 1 ) );

            }
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger ( JavaPostgreSqlLVersion.class.getName () );
            lgr.log ( Level.SEVERE, ex.getMessage (), ex );
            }
        }

    }