/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnityPC;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Derushan
 */
@Entity
@Table(name = "user_details", catalog = "unitypc", schema = "")
@NamedQueries({
    @NamedQuery(name = "UserDetails_1.findAll", query = "SELECT u FROM UserDetails_1 u")
    , @NamedQuery(name = "UserDetails_1.findByUserID", query = "SELECT u FROM UserDetails_1 u WHERE u.userID = :userID")
    , @NamedQuery(name = "UserDetails_1.findByUserName", query = "SELECT u FROM UserDetails_1 u WHERE u.userName = :userName")
    , @NamedQuery(name = "UserDetails_1.findByPassword", query = "SELECT u FROM UserDetails_1 u WHERE u.password = :password")})
public class UserDetails_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "User_ID")
    private Integer userID;
    @Basic(optional = false)
    @Column(name = "User_Name")
    private String userName;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;

    public UserDetails_1() {
    }

    public UserDetails_1(Integer userID) {
        this.userID = userID;
    }

    public UserDetails_1(Integer userID, String userName, String password) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        Integer oldUserID = this.userID;
        this.userID = userID;
        changeSupport.firePropertyChange("userID", oldUserID, userID);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        String oldUserName = this.userName;
        this.userName = userName;
        changeSupport.firePropertyChange("userName", oldUserName, userName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserDetails_1)) {
            return false;
        }
        UserDetails_1 other = (UserDetails_1) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UnityPC.UserDetails_1[ userID=" + userID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
