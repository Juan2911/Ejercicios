package com.feguzman.comercio.Domains.Request.RequestInvoiceListDestail;

import com.feguzman.comercio.Entity.DetailOfSaleForLess;

import java.util.List;

public class RequestInvoiceListDetail {
    List<DetailOfSaleForLess> listDetailOfSaleForLess;

    public RequestInvoiceListDetail(List<DetailOfSaleForLess> listDetailOfSaleForLess) {
        this.listDetailOfSaleForLess = listDetailOfSaleForLess;
    }

    public List<DetailOfSaleForLess> getListDetailOfSaleForLess() {
        return listDetailOfSaleForLess;
    }

    public void setListDetailOfSaleForLess(List<DetailOfSaleForLess> listDetailOfSaleForLess) {
        this.listDetailOfSaleForLess = listDetailOfSaleForLess;
    }
}
