import java.sql.*;

public class DBConnect3 {
	 public static void main(String[] args) throws Exception {

         /* 1) PostgreSQL的连接信息 */
         Connection con; 
         Statement st;

         String url = "jdbc:postgresql://localhost:5432/shop";
         String user = "postgres";
         String password = "test"; 

         /* 2) 定义JDBC驱动 */
         Class.forName("org.postgresql.Driver"); 

         /* 3) 连接PostgreSQL */
         con = DriverManager.getConnection(url, user, password); 
         st = con.createStatement(); 

         /* 4) 执行SELECT语句 */
         int delcnt = st.executeUpdate("DELETE FROM Product");

         /* 5) 在画面中显示结果 */
         System.out.print(delcnt+" 行已删除"); 

         /* 6) 切断与PostgreSQL的连接 */ 
         st.close();
         con.close(); 
    }
}
