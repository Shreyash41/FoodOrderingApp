
package planetfoodapp.pojo;

/**
 *
 * @author Lenovo User
 */
public class OrderDetail {
    private String OrdId;
    private String ProdId;
    private double Quantity;
    private double Cost;

    /**
     *
     * @return
     */
    public String getOrdId() {
        return OrdId;
    }

    /**
     *
     * @param OrdId
     */
    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    /**
     *
     * @return
     */
    public String getProdId() {
        return ProdId;
    }

    /**
     *
     * @param ProdId
     */
    public void setProdId(String ProdId) {
        this.ProdId = ProdId;
    }

    /**
     *
     * @return
     */
    public double getQuantity() {
        return Quantity;
    }

    /**
     *
     * @param Quantity
     */
    public void setQuantity(double Quantity) {
        this.Quantity = Quantity;
    }

    /**
     *
     * @return
     */
    public double getCost() {
        return Cost;
    }

    /**
     *
     * @param Cost
     */
    public void setCost(double Cost) {
        this.Cost = Cost;
    }
   
 }
