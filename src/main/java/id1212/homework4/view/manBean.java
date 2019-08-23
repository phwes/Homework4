/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id1212.homework4.view;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author philip
 */
@Named(value = "manBean")
@Dependent
public class manBean {
    private String name;
    private Integer valueInSek;
    /**
     * Creates a new instance of manBean
     */
    public manBean() {
    }
    
private int fromValue;
    private String fromCurrency;
    private String toCurrency;


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

    }

    public int getResult(){
        return 10;
    }
    
}
