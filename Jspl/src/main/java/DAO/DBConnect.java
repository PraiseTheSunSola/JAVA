package DAO;

public class DBConnect {

		protected Connection conn;
		protected Statement st;
		protected PreparedStatement pt;
		protected ResultSet rs;
		
		protected DBConnect() {
			connect();
		}
		
		private void connect() {
			
			String user= "Eldnring";
			String password="1234";
			Stirng url="jdbc:mysql://localhost:3306/Eldnring";
			
			try {
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 conn = DriverManager.co
			}catch()
			
		}
	}
}
