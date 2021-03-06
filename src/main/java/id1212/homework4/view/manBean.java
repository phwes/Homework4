/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id1212.homework4.view;

import id1212.homework4.controller.Controller;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.Conversation;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author philip
 * 
 * A managed bean that handles the interaction with JSF 
 */

@Named(value = "manBean")
@ConversationScoped
public class manBean implements Serializable{
    @EJB
    Controller controller;
    
    @Inject
    private Conversation conversation;
  
    private int fromValue;
    private String fromCurrency;
    private String toCurrency;
    private double result = 0.0;

    private void startConversation(){
        if(conversation.isTransient()){
            conversation.begin();
        }
    }
    
    public int getFromValue() {
        return fromValue;
    }

    public void setFromValue(int fromValue) {
        this.fromValue = fromValue;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public void conversion(){
        startConversation();
        double toCurrVal = (double) controller.findValueInSek(toCurrency);
        double fromCurrVal = (double) controller.findValueInSek(fromCurrency);
        
        result = ((double)fromValue*fromCurrVal)/toCurrVal;
    }

    public double getResult(){
        return result;
    }
    
}
