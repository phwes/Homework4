/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id1212.homework4.controller;

import id1212.homework4.integration.DAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author philip
 */
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
@Stateless
public class Controller {
    @EJB
    DAO dao;
    
    public int findValueInSek(String currency){
        if(currency != null){
            return dao.findValueInSek(currency);
        }else{
            return 0;
        }
    }
}
