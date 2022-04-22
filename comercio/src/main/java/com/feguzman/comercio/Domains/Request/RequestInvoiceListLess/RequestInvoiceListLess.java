package com.feguzman.comercio.Domains.Request.RequestInvoiceListLess;

import com.feguzman.comercio.Entity.SaleForLess;

import java.util.List;

public class RequestInvoiceListLess {
    List<SaleForLess> listSaleForLess;

    public RequestInvoiceListLess(List<SaleForLess> listSaleForLess) {
        this.listSaleForLess = listSaleForLess;
    }

    public List<SaleForLess> getListSaleForLess() {
        return listSaleForLess;
    }

    public void setListSaleForLess(List<SaleForLess> listSaleForLess) {
        this.listSaleForLess = listSaleForLess;

    }
}
