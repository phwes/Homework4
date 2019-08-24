/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id1212.homework4.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author philip
 */
@Entity
@Table(name = "EXCHANGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exchange.findAll", query = "SELECT e FROM Exchange e")
    , @NamedQuery(name = "Exchange.findByCurrency", query = "SELECT e FROM Exchange e WHERE e.currency = :currency")
    , @NamedQuery(name = "Exchange.findByValueinsek", query = "SELECT e FROM Exchange e WHERE e.valueinsek = :valueinsek")})
public class Exchange implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String currency;    
    private Integer valueinsek;

    public Exchange() {
    }

    public Exchange(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getValueinsek() {
        return valueinsek;
    }

    public void setValueinsek(Integer valueinsek) {
        this.valueinsek = valueinsek;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (currency != null ? currency.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Exchange)) {
            return false;
        }
        Exchange other = (Exchange) object;
        if ((this.currency == null && other.currency != null) || (this.currency != null && !this.currency.equals(other.currency))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id1212.homework4.model.Exchange[ currency=" + currency + " ]";
    }
    
}
