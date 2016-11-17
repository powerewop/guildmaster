import java.sql.*;

/**
 * Created by Gleb on 16.11.2016.
 */
public class DBConnect {

    public static void main(String[] args)

    {
        try

        {
            String host = "jdbc:mysql://85.234.8.57:3306/world_objects";
            String username = "root";
            String passwd = "gh0gktibyf";
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex){
                System.out.println(ex.getMessage());
            }
            Connection con = DriverManager.getConnection(host, username, passwd);

            String query = "select * from terrain";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("Terrains:");

            while(rs.next()){
                String name = rs.getString("name");

                System.out.println(name);
            }

        } catch (
                SQLException err)

        {
            System.out.println("SQLException: " + err.getMessage());
            System.out.println("SQLState: " + err.getSQLState());
            System.out.println("VendorError: " + err.getErrorCode());
        }
    }
}
