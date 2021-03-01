package planetfoodapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfoodapp.dbutil.DBConnection;
import planetfoodapp.pojo.Category;

/**
 *
 * @author Lenovo User
 */
public class CategoryDao{

    /**
     *
     * @return
     * @throws SQLException
     */
    public static HashMap<String,String> getAllCategoryId() throws SQLException{
         Connection conn=DBConnection.getConnection();
            Statement st= conn.createStatement();
            ResultSet rs= st.executeQuery("select cat_name,cat_id from categories");
            HashMap<String,String> categories =new HashMap<>();
            while(rs.next())
            {
            String catName =rs.getString(1);
            String catId =rs.getString(2);
            categories.put(catName,catId);  
            }
        return categories;
   } 
   
    /**
     *
     * @return
     * @throws SQLException
     */
    public static ArrayList<Category>getAllData()throws SQLException{
        Connection conn=DBConnection.getConnection();
        String qry="select * from categories";
        Statement st=conn.createStatement();
        ResultSet rs =st.executeQuery(qry);
         ArrayList<Category> categoryList=new ArrayList<>();
        while(rs.next())
        {
            Category c= new Category();
            c.setCatid(rs.getString("cat_id"));
            c.setCatname(rs.getString("cat_name"));
            categoryList.add(c);
        }
    return categoryList;
    }
   
    /**
     *
     * @param c
     * @return
     * @throws SQLException
     */
    public static boolean addCategory(Category c)throws SQLException{
   
            Connection conn=DBConnection.getConnection();//conn object;
            PreparedStatement ps= conn.prepareStatement("insert into categories values(?,?)");
            ps.setString(1,c.getCatid());
            ps.setString(2,c.getCatname());
  
            int  x = ps.executeUpdate();
        return (x>0);
    }
   
    /**
     *
     * @param c
     * @return
     * @throws SQLException
     */
    public static boolean updateCategory(Category c) throws SQLException{
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps= conn.prepareStatement("Update categories set cat_name=? where cat_id=?");

            ps.setString(1,c.getCatname());
            ps.setString(2,c.getCatid());
            int x=ps.executeUpdate();

        return (x>0);
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public static String getNewID()throws SQLException{
             Connection conn=DBConnection.getConnection();//conn object;
              PreparedStatement ps= conn.prepareStatement("Select count(*) from categories");
              ResultSet rs= ps.executeQuery();
                 int id=101;
                 if(rs.next())
                    {
                        id =id+rs.getInt(1);
           
                    }
        return "C"+id;
    }
}
