package com.feguzman.comercio.Domains.Response;

public class ResponseDetailOfSaleForLess {
    private String description;
    private double costToBuy;
    private String itemName;
    private String itemType;
    private String itemMeasurementUnit;
    private int itemUnitQuantity;
    private double cost;
    private double totalCost;

    public ResponseDetailOfSaleForLess() {}

    public ResponseDetailOfSaleForLess(String description, double costToBuy, String itemName, String itemType, String itemMeasurementUnit, int itemUnitQuantity, double cost, double totalCost) {
        this.description = description;
        this.costToBuy = costToBuy;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemMeasurementUnit = itemMeasurementUnit;
        this.itemUnitQuantity = itemUnitQuantity;
        this.cost = cost;
        this.totalCost = totalCost;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getCostToBuy() {
        return costToBuy;
    }
    public void setCostToBuy(double costToBuy) {
        this.costToBuy = costToBuy;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemType() {
        return itemType;
    }
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public String getItemMeasurementUnit() {
        return itemMeasurementUnit;
    }
    public void setItemMeasurementUnit(String itemMeasurementUnit) {
        this.itemMeasurementUnit = itemMeasurementUnit;
    }
    public int getItemUnitQuantity() {
        return itemUnitQuantity;
    }
    public void setItemUnitQuantity(int itemUnitQuantity) {
        this.itemUnitQuantity = itemUnitQuantity;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
