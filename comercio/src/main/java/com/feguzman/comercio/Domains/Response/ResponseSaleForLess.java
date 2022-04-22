package com.feguzman.comercio.Domains.Response;

import java.util.Date;

public class ResponseSaleForLess {
    private String distributorName;
    private String userName;
    private String clientName;
    private int factureNumber;
    private Date factureDate;
    private double totalOfSaleForLess;

    public ResponseSaleForLess() {}

    public ResponseSaleForLess(String distributorName, String userName, String clientName, int factureNumber, Date factureDate, double totalOfSaleForLess) {
        this.distributorName = distributorName;
        this.userName = userName;
        this.clientName = clientName;
        this.factureNumber = factureNumber;
        this.factureDate = factureDate;
        this.totalOfSaleForLess = totalOfSaleForLess;
    }

    public String getDistributorName() {
        return distributorName;
    }
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public int getFactureNumber() {
        return factureNumber;
    }
    public void setFactureNumber(int factureNumber) {
        this.factureNumber = factureNumber;
    }
    public Date getFactureDate() {
        return factureDate;
    }
    public void setFactureDate(Date factureDate) {
        this.factureDate = factureDate;
    }
    public double getTotalOfSaleForLess() {
        return totalOfSaleForLess;
    }
    public void setTotalOfSaleForLess(double totalOfSaleForLess) {
        this.totalOfSaleForLess = totalOfSaleForLess;
    }
}
