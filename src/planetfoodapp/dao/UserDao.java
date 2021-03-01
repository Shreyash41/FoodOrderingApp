package planetfoodapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import planetfoodapp.dbutil.DBConnection;
import planetfoodapp.pojo.Users;

/**
 *
 * @author Lenovo User
 */
public class UserDao {
    
    /**
     *
     * @param user
     * @return
     * @throws SQLException
     */
    public static String validateUser(Users user)throws SQLException{
        Connection conn= DBConnection.getConnection();
        String qry = "Select username  from Users where USERID=? and PASSWORD=? and USERTYPE=?";
        PreparedStatement ps= conn.prepareStatement(qry);
        ps.setString(1,Users.getUserId());
        ps.setString(2,Users.getPassword());
        ps.setString(3,Users.getUserType());
        ResultSet rs;
        rs = ps.executeQuery();
        String username = null;
        if(rs.next())
        {
          username=rs.getString(1);
        }
     return username;
    }
            
    /**
     *
     * @param users
     * @return
     * @throws SQLException
     */
    public static boolean addUsers(Users users)throws SQLException{
     Connection conn=DBConnection.getConnection();//conn object;
     PreparedStatement ps= conn.prepareStatement("insert into users values(?,?,?,?,?)");
     ps.setString(1,users.getUserId());
     ps.setString(2,users.getUserName());
     ps.setString(3,users.getEmpId());
     ps.setString(4,users.getPassword());
     ps.setString(5,users.getUserType());
      
     int  x = ps.executeUpdate();
     PreparedStatement ps1= conn.prepareStatement("update employees set job=? where empid=?");
     ps1.setString(1,users.getUserType());
     ps1.setString(2,users.getEmpId());
     int x1=ps1.executeUpdate();
    return (x>0);
   }
   
    /**
     *
     * @param userId
     * @return
     * @throws SQLException
     */
  public static HashMap<String,Users> getUserId(String userId) throws SQLException{
   Connection conn =DBConnection.getConnection();
   String qry="select * from users where userid=?";
   PreparedStatement ps=conn.prepareStatement(qry);
   HashMap<String,Users> usersList=new HashMap<>();
   ps.setString(1,userId);
   ResultSet rs= ps.executeQuery();
  while(rs.next())
  {
   Users user=new Users();
   user.setUserId(userId);
   user.setUserName(rs.getString("username"));
   user.setEmpId(rs.getString("empid"));
   user.setPassword(rs.getString("password"));
   user.setUserType(rs.getString("usertype"));
   usersList.put(user.getUserId(),user);
   }
   return usersList;
 }
    
    /**
     *
     * @param userId
     * @return
     * @throws SQLException
     */
    public static boolean removeUser(String userId)throws SQLException{
     Connection conn = DBConnection.getConnection();
     PreparedStatement ps = conn.prepareStatement("delete from users where userid=?");
     ps.setString(1,userId);
     int x=ps.executeUpdate();
     return (x>0);
    }

}
   
   


