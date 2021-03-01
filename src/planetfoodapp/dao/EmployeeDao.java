package planetfoodapp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfoodapp.dbutil.DBConnection;
import planetfoodapp.pojo.Employee;

/**
 *
 * @author Lenovo User
 */
public class EmployeeDao {

    /**
     *
     * @return
     * @throws SQLException
     */
    public static String getNewID()throws SQLException{
     Connection conn=DBConnection.getConnection();//conn object;
     PreparedStatement ps= conn.prepareStatement("Select count(*) from Employees");
     ResultSet rs= ps.executeQuery();
     int id=101;
     if(rs.next())
     {
         id =id+rs.getInt(1);
           
     }
     return "E"+id;
    }

    /**
     *
     * @param empId
     * @return
     * @throws SQLException
     */
    public static boolean removeEmployee(String empId)throws SQLException {
     Connection conn = DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from employees where empid= ?");
     ps.setString(1,empId);
     int x=ps.executeUpdate();
     return (x>0);
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public static ArrayList<String> getAllEmpId() throws SQLException{
     Connection conn=DBConnection.getConnection();
     Statement st= conn.createStatement();
     ResultSet rs= st.executeQuery("select empid from employees");
     ArrayList<String> employees =new ArrayList<>();
     while(rs.next())
     {
         String empId =rs.getString(1);
         employees.add(empId);  
     }
     return employees;
   } 
      
    /**
     *
     * @param emp
     * @return
     * @throws SQLException
     */
    public static boolean addEmployee(Employee emp)throws SQLException{
   
     Connection conn=DBConnection.getConnection();//conn object;
     PreparedStatement ps= conn.prepareStatement("insert into employees values(?,?,?,?)");
     ps.setString(1,emp.getEmpId());
     ps.setString(2,emp.getEName());
     ps.setString(3,emp.getJob());
     ps.setDouble(4,emp.getSalary());
  
    int  x = ps.executeUpdate();
    return (x>0);
  }

    /**
     *
     * @param emp
     * @return
     * @throws SQLException
     */
 public static boolean updateEmployee(Employee emp) throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps= conn.prepareStatement("Update employees set ename=?,job=?,sal=? where empid=?"); 
    //ps.setString(1, emp.getEmpId());
    ps.setString(1, emp.getEName());    
    ps.setString(2, emp.getJob());
    ps.setDouble(3, emp.getSalary());
    ps.setString(4, emp.getEmpId());
    int x=ps.executeUpdate();

    return (x>0);
}

    /**
     *
     * @param empId
     * @return
     * @throws SQLException
     */
    public static HashMap<String,Employee> getEmployee(String empId) throws SQLException{
   Connection conn =DBConnection.getConnection();
   String qry="select * from employees where empid=?";
   PreparedStatement ps=conn.prepareStatement(qry);
   HashMap<String,Employee> employeesList=new HashMap<>();
   ps.setString(1,empId);
   ResultSet rs= ps.executeQuery();
   while(rs.next())
   {
       Employee emp=new Employee();
   emp.setEmpId(empId);
   emp.setEName(rs.getString("ename"));
   emp.setJob(rs.getString("job"));
   emp.setSalary(rs.getDouble("sal"));
   emp.setEmpId(rs.getString("empid"));
   employeesList.put(emp.getEmpId(),emp);
   }
   return employeesList;
 }

    /**
     *
     * @return
     * @throws SQLException
     */
public static ArrayList<Employee>getAllData()throws SQLException{
    
Connection conn=DBConnection.getConnection();
String qry="select * from employees";
Statement st=conn.createStatement();
ResultSet rs =st.executeQuery(qry);
ArrayList<Employee> employeesList=new ArrayList<Employee>();
while(rs.next())
{
Employee emp= new Employee();

emp.setEmpId(rs.getString("empid"));
emp.setEName(rs.getString("ename"));
emp.setJob(rs.getString("job"));
emp.setSalary(rs.getDouble("sal"));
employeesList.add(emp);
}
return employeesList;
}
}