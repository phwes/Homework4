/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id1212.homework4.integration;

import id1212.homework4.model.Exchange;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author philip
 */
@Stateless
public class DAO {
    @PersistenceContext(unitName = "myPU")
    EntityManager em;
   
    public int findValueInSek(String currency){
        Exchange res = em.find(Exchange.class, currency);
        return res.getValueinsek();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
