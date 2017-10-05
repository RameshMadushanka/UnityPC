/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnityPC;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Derushan
 */
@Entity
@Table(name = "addproduct", catalog = "unitypc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Addproduct.findAll", query = "SELECT a FROM Addproduct a")
    , @NamedQuery(name = "Addproduct.findByPId", query = "SELECT a FROM Addproduct a WHERE a.pId = :pId")
    , @NamedQuery(name = "Addproduct.findByPSerialNO", query = "SELECT a FROM Addproduct a WHERE a.pSerialNO = :pSerialNO")
    , @NamedQuery(name = "Addproduct.findByPCategory", query = "SELECT a FROM Addproduct a WHERE a.pCategory = :pCategory")
    , @NamedQuery(name = "Addproduct.findByPName", query = "SELECT a FROM Addproduct a WHERE a.pName = :pName")
    , @NamedQuery(name = "Addproduct.findByPPrice", query = "SELECT a FROM Addproduct a WHERE a.pPrice = :pPrice")
    , @NamedQuery(name = "Addproduct.findByPAddDate", query = "SELECT a FROM Addproduct a WHERE a.pAddDate = :pAddDate")
    , @NamedQuery(name = "Addproduct.findByPQunatity", query = "SELECT a FROM Addproduct a WHERE a.pQunatity = :pQunatity")
    , @NamedQuery(name = "Addproduct.findByPAddWarMonth", query = "SELECT a FROM Addproduct a WHERE a.pAddWarMonth = :pAddWarMonth")
    , @NamedQuery(name = "Addproduct.findByPModelName", query = "SELECT a FROM Addproduct a WHERE a.pModelName = :pModelName")
    , @NamedQuery(name = "Addproduct.findByPMake", query = "SELECT a FROM Addproduct a WHERE a.pMake = :pMake")
    , @NamedQuery(name = "Addproduct.findByPType", query = "SELECT a FROM Addproduct a WHERE a.pType = :pType")})
public class Addproduct implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "P_ID")
    private Integer pId;
    @Basic(optional = false)
    @Column(name = "P_SerialNO")
    private String pSerialNO;
    @Basic(optional = false)
    @Column(name = "P_Category")
    private String pCategory;
    @Column(name = "P_Name")
    private String pName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "P_Price")
    private Float pPrice;
    @Column(name = "P_AddDate")
    @Temporal(TemporalType.DATE)
    private Date pAddDate;
    @Basic(optional = false)
    @Column(name = "P_Qunatity")
    private int pQunatity;
    @Column(name = "P_AddWarMonth")
    private Integer pAddWarMonth;
    @Column(name = "P_ModelName")
    private String pModelName;
    @Basic(optional = false)
    @Column(name = "P_Make")
    private String pMake;
    @Basic(optional = false)
    @Column(name = "P_Type")
    private String pType;

    public Addproduct() {
    }

    public Addproduct(Integer pId) {
        this.pId = pId;
    }

    public Addproduct(Integer pId, String pSerialNO, String pCategory, int pQunatity, String pMake, String pType) {
        this.pId = pId;
        this.pSerialNO = pSerialNO;
        this.pCategory = pCategory;
        this.pQunatity = pQunatity;
        this.pMake = pMake;
        this.pType = pType;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        Integer oldPId = this.pId;
        this.pId = pId;
        changeSupport.firePropertyChange("PId", oldPId, pId);
    }

    public String getPSerialNO() {
        return pSerialNO;
    }

    public void setPSerialNO(String pSerialNO) {
        String oldPSerialNO = this.pSerialNO;
        this.pSerialNO = pSerialNO;
        changeSupport.firePropertyChange("PSerialNO", oldPSerialNO, pSerialNO);
    }

    public String getPCategory() {
        return pCategory;
    }

    public void setPCategory(String pCategory) {
        String oldPCategory = this.pCategory;
        this.pCategory = pCategory;
        changeSupport.firePropertyChange("PCategory", oldPCategory, pCategory);
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        String oldPName = this.pName;
        this.pName = pName;
        changeSupport.firePropertyChange("PName", oldPName, pName);
    }

    public Float getPPrice() {
        return pPrice;
    }

    public void setPPrice(Float pPrice) {
        Float oldPPrice = this.pPrice;
        this.pPrice = pPrice;
        changeSupport.firePropertyChange("PPrice", oldPPrice, pPrice);
    }

    public Date getPAddDate() {
        return pAddDate;
    }

    public void setPAddDate(Date pAddDate) {
        Date oldPAddDate = this.pAddDate;
        this.pAddDate = pAddDate;
        changeSupport.firePropertyChange("PAddDate", oldPAddDate, pAddDate);
    }

    public int getPQunatity() {
        return pQunatity;
    }

    public void setPQunatity(int pQunatity) {
        int oldPQunatity = this.pQunatity;
        this.pQunatity = pQunatity;
        changeSupport.firePropertyChange("PQunatity", oldPQunatity, pQunatity);
    }

    public Integer getPAddWarMonth() {
        return pAddWarMonth;
    }

    public void setPAddWarMonth(Integer pAddWarMonth) {
        Integer oldPAddWarMonth = this.pAddWarMonth;
        this.pAddWarMonth = pAddWarMonth;
        changeSupport.firePropertyChange("PAddWarMonth", oldPAddWarMonth, pAddWarMonth);
    }

    public String getPModelName() {
        return pModelName;
    }

    public void setPModelName(String pModelName) {
        String oldPModelName = this.pModelName;
        this.pModelName = pModelName;
        changeSupport.firePropertyChange("PModelName", oldPModelName, pModelName);
    }

    public String getPMake() {
        return pMake;
    }

    public void setPMake(String pMake) {
        String oldPMake = this.pMake;
        this.pMake = pMake;
        changeSupport.firePropertyChange("PMake", oldPMake, pMake);
    }

    public String getPType() {
        return pType;
    }

    public void setPType(String pType) {
        String oldPType = this.pType;
        this.pType = pType;
        changeSupport.firePropertyChange("PType", oldPType, pType);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addproduct)) {
            return false;
        }
        Addproduct other = (Addproduct) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UnityPC.Addproduct[ pId=" + pId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
