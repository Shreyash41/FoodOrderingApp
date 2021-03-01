
package planetfoodapp.pojo;

/**
 *
 * @author Lenovo User
 */
public class UserProfile {
     private static String username;
     private static String usertype;
     private static String userid;

    /**
     *
     * @return
     */
    public static String getUserid() {
        return userid;
    }

    /**
     *
     * @param userid
     */
    public static void setUserid(String userid) {
        UserProfile.userid = userid;
    }

    /**
     *
     * @return
     */
    public static String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public static void setUsername(String username) {
        UserProfile.username = username;
    }

    /**
     *
     * @return
     */
    public static String getUsertype() {
        return usertype;
    }

    /**
     *
     * @param usertype
     */
    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }
    
  
    
   
}
