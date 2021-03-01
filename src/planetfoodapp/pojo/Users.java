
package planetfoodapp.pojo;

/**
 *
 * @author Lenovo User
 */
public class Users {
    private  static String userId ,userName,empId,password,UserType; 

    /**
     *
     * @return
     */
    public static String getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     */
    public static void setUserId(String userId) {
        Users.userId = userId;
    }

    /**
     *
     * @return
     */
    public static String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public static void setUserName(String userName) {
        Users.userName = userName;
    }

    /**
     *
     * @return
     */
    public static String getEmpId() {
        return empId;
    }

    /**
     *
     * @param empId
     */
    public static void setEmpId(String empId) {
        Users.empId = empId;
    }

    /**
     *
     * @return
     */
    public static String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public static void setPassword(String password) {
        Users.password = password;
    }

    /**
     *
     * @return
     */
    public static String getUserType() {
        return UserType;
    }

    /**
     *
     * @param UserType
     */
    public static void setUserType(String UserType) {
        Users.UserType = UserType;
    }
 
   
}    

