
package com.restUnitTesting.unitTesting.model.InvoiceQuery;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InvoiceList"
})
public class Response {

    @JsonProperty("InvoiceList")
    public List<InvoiceList> invoiceList = null;

}
