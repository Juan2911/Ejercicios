package com.feguzman.comercio.Controller.DetailPost;

import com.feguzman.comercio.Domains.Request.RequestInvoiceListLess.RequestInvoiceListLess;
import com.feguzman.comercio.Domains.Response.ResponseSaleForLess;
import com.feguzman.comercio.Processors.Service.CreateSaleForLessProcessors;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControllerLessPost {

    @Autowired
    public CreateSaleForLessProcessors createSaleForLessProcessorsImpl;

    @PostMapping(value = "/SaleForLess", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<ResponseSaleForLess>> saleLess(@RequestBody RequestInvoiceListLess requestInvoiceListLess) {
    //List<ResponseSaleForLess> responseSaleForLesses = (List<ResponseSaleForLess>) createSaleForLessProcessorsImpl.listSaleForLess(requestInvoiceListLess);
        return null; //new ResponseEntity<>(responseSaleForLesses, HttpStatus.OK);
    }
}
