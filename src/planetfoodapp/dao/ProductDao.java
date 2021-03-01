package planetfoodapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfoodapp.dbutil.DBConnection;
import planetfoodapp.pojo.Product;

/**
 *
 * @author Lenovo User
 */
public class ProductDao{

    /**
     *
     * @return
     * @throws SQLException
     */
    public static ArrayList<Product>getMenuList()throws SQLException{
        Connection conn=DBConnection.getConnection();
        ArrayList<Product>menulist=new ArrayList<>();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select prod_name,prod_price from products where active='Y'");
        while(rs.next())
        {
            Product p=new Product();
            p.setProdName(rs.getString("prod_name"));
            p.setProdPrice(rs.getDouble("prod_price"));
            menulist.add(p);
        }
        return menulist;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public static String getNewID()throws SQLException{
     Connection conn=DBConnection.getConnection();//conn object;
     PreparedStatement ps= conn.prepareStatement("Select count(*) from Products");
     ResultSet rs= ps.executeQuery();
     int id=101;
     if(rs.next())
     {
         id =id+rs.getInt(1);
           
     }
     return "P"+id;
 }
  
    /**
     *
     * @param p
     * @return
     * @throws SQLException
     */
    public static boolean addProduct(Product p)throws SQLException{
   
    Connection conn=DBConnection.getConnection();//conn object;
     PreparedStatement ps= conn.prepareStatement("insert into Products values(?,?,?,?,?)");
     ps.setString(1,p.getProdId());
     ps.setString(2,p.getCatId());
     ps.setString(3,p.getProdName());
     ps.setDouble(4,p.getProdPrice());
     ps.setString(5,p.getIsActive());
     int  x = ps.executeUpdate();
    return (x>0);
  }

    /**
     *
     * @param catId
     * @return
     * @throws SQLException
     */
    public static HashMap<String,Product> getProductByCategory(String catId) throws SQLException{
   Connection conn =DBConnection.getConnection();
   String qry="select * from products where cat_id=?";
   PreparedStatement ps=conn.prepareStatement(qry);
   HashMap<String,Product> productList=new HashMap<>();
   ps.setString(1,catId);
   ResultSet rs= ps.executeQuery();
   while(rs.next())
   {
       Product p=new Product();
   
   p.setCatId(catId);
   p.setProdId(rs.getString("prod_id"));
   p.setProdName(rs.getString("prod_name"));
   p.setProdPrice(rs.getDouble("prod_price"));
   p.setIsActive(rs.getString("active"));
   productList.put(p.getProdId(), p);
   }
   return productList;
 }

    /**
     *
     * @return
     * @throws SQLException
     */
    public static ArrayList<Product>getAllData()throws SQLException{
Connection conn=DBConnection.getConnection();
String qry="select * from products";
Statement st=conn.createStatement();
ResultSet rs =st.executeQuery(qry);
ArrayList<Product> productList=new ArrayList<Product>();
while(rs.next())
{
Product p= new Product();
p.setCatId(rs.getString("cat_id"));
p.setProdId(rs.getString("prod_id"));
p.setProdName(rs.getString("prod_name"));
p.setProdPrice(rs.getDouble("prod_price"));
p.setIsActive(rs.getString("active"));
productList.add(p);
}
return productList;
}

    /**
     *
     * @param p
     * @return
     * @throws SQLException
     */
    public static boolean updateProduct(Product p) throws SQLException{
 Connection conn=DBConnection.getConnection();
 PreparedStatement ps= conn.prepareStatement("Update products set cat_id=?,prod_name=?,prod_price=?,active=? where prod_id=?"); 
ps.setString(1, p.getCatId());
ps.setString(2, p.getProdName());
ps.setDouble(3, p.getProdPrice());
ps.setString(4, p.getIsActive());
ps.setString(5, p.getProdId());
int x=ps.executeUpdate();

return (x>0);

}

    /**
     *
     * @param prodId
     * @return
     * @throws SQLException
     */
    public static boolean removeProduct(String prodId)throws SQLException {
     Connection conn = DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update Products set active='N' where prod_id=?");
     ps.setString(1, prodId);
     int x=ps.executeUpdate();
     return (x>0);
 }

    /**
     *
     * @param catId
     * @return
     * @throws SQLException
     */
    public static HashMap <String ,String> getActiveProductsByCategory(String catId)throws SQLException{
 Connection conn = DBConnection.getConnection();
 String qry= "Select prod_name,prod_id from products where cat_id=? and active='Y'";
 PreparedStatement ps= conn.prepareStatement(qry);
 ps.setString(1,catId);
 ResultSet rs=ps.executeQuery();
 HashMap<String,String> productList=new HashMap<>();
 while(rs.next()){
     String prodName =rs.getString("prod_name");
     String prodId = rs.getString("prod_id");
     productList.put(prodName,prodId);
 }
 return productList;
}
}