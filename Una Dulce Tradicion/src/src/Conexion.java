package src;

//Estas son las librer�as que se ocupan para trabajar con SQL Server
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.io.*;
public class Conexion
{
	//Se usa un driver de tipo 4
	static String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	//En la URL se indica el subprotocolo, la direcci�n IP o local y el puerto (por default 1434), as� como el nombre de la BD
	static String URL="jdbc:sqlserver://localhost:1433;databaseName=cafeteria";

	static String user="sa";
	static String pass="sa";
	
	static Connection con=null;
	static Statement stmt = null;
	static ResultSet rs = null;

	/*public static void main(String arg[])throws IOException, ClassNotFoundException, SQLException
	{
		registrarJDBC();
		conexion();
		cerrarConexion(con);
	}*/
		
	public static void registrarJDBC()throws IOException, ClassNotFoundException, SQLException
	{
		try 
		{ 
			//Se carga el driver
			Class.forName(Driver); 
			System.out.println("El driver se ha cargado con exito");
		} 
		catch(java.lang.ClassNotFoundException e) 
		{ 
			System.out.println("Problemas al cargar el driver "); 
			System.out.println(e.getMessage()); 
		}
	}

	public static Connection conexion()
	{
		try 
		{ 
			//Se hace la conexi�n a la base de datos ya creada
			con = DriverManager.getConnection(URL,user,pass);
			System.out.println("La conexion a la base de datos creada se ha realizado con exito");
		} 
		catch(SQLException e) 
		{ 
			System.out.print("Error: "+e.getMessage());
		}
		return con;
	}
	
	public static void cerrarConexion(Connection con)throws SQLException
	{
		try {
			if(con!=null)con.close();
			System.out.println("Conexion cerrada");
		} 
		catch (SQLException e) {
			System.out.print("Error: "+e.getMessage());
		}
	}
        public static ResultSet Consulta(String consulta){
            Connection c = conexion();
            Statement st;
            try{
                st=c.createStatement();
                ResultSet resp = st.executeQuery(consulta);
                return resp;
            }
            catch(SQLException e){
                
            }
            return null;
        }
        public static void Enviar(String cadena){
            Connection c = conexion();
            Statement st;
            try{
                st=c.createStatement();
                int res = st.executeUpdate(cadena);
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
}