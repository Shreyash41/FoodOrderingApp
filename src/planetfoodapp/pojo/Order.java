
package planetfoodapp.pojo;

/**
 *
 * @author Lenovo User
 */
public class Order {
    private String ordId;
    private String ordDate;
    private double gst;
    private double gstAmount;
    private double discount;
    private double ordAmount;
    private double grandTotal;
    private String userId;

    /**
     *
     * @return
     */
    public String getOrdId() {
        return ordId;
    }

    /**
     *
     * @param ordId
     */
    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    /**
     *
     * @return
     */
    public String getOrdDate() {
        return ordDate;
    }

    /**
     *
     * @param ordDate
     */
    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    /**
     *
     * @return
     */
    public double getGst() {
        return gst;
    }

    /**
     *
     * @param gst
     */
    public void setGst(double gst) {
        this.gst = gst;
    }

    /**
     *
     * @return
     */
    public double getGstAmount() {
        return gstAmount;
    }

    /**
     *
     * @param gstAmount
     */
    public void setGstAmount(double gstAmount) {
        this.gstAmount = gstAmount;
    }

    /**
     *
     * @return
     */
    public double getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     *
     * @return
     */
    public double getOrdAmount() {
        return ordAmount;
    }

    /**
     *
     * @param ordAmount
     */
    public void setOrdAmount(double ordAmount) {
        this.ordAmount = ordAmount;
    }

    /**
     *
     * @return
     */
    public double getGrandTotal() {
        return grandTotal;
    }

    /**
     *
     * @param grandTotal
     */
    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    /**
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
  
}
