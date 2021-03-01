package planetfoodapp.pojo;

/**
 *
 * @author Lenovo User
 */
public class Product {
     private String ProdId;
      private String CatId;
      private String ProdName;
      private Double ProdPrice;
      private String IsActive;

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
    public String getCatId() {
        return CatId;
    }

    /**
     *
     * @param CatId
     */
    public void setCatId(String CatId) {
        this.CatId = CatId;
    }

    /**
     *
     * @return
     */
    public String getProdName() {
        return ProdName;
    }

    /**
     *
     * @param ProdName
     */
    public void setProdName(String ProdName) {
        this.ProdName = ProdName;
    }

    /**
     *
     * @return
     */
    public double getProdPrice() {
        return ProdPrice;
    }

    /**
     *
     * @param ProdPrice
     */
    public void setProdPrice(double ProdPrice) {
        this.ProdPrice = ProdPrice;
    }

    /**
     *
     * @return
     */
    public String getIsActive() {
        return IsActive;
    }

    /**
     *
     * @param IsActive
     */
    public void setIsActive(String IsActive) {
        this.IsActive = IsActive;
    }
     
   
}
