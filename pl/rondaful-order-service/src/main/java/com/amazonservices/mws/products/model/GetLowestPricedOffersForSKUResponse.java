/*******************************************************************************
 * Copyright 2009-2017 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Get Lowest Priced Offers For SKU Response
 * API Version: 2011-10-01
 * Library Version: 2017-03-22
 * Generated: Wed Mar 22 23:24:32 UTC 2017
 */
package com.amazonservices.mws.products.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * GetLowestPricedOffersForSKUResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetLowestPricedOffersForSKUResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetLowestPricedOffersForSKUResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetLowestPricedOffersForSKUResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetLowestPricedOffersForSKUResponse", propOrder={
    "getLowestPricedOffersForSKUResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetLowestPricedOffersForSKUResponse")
public class GetLowestPricedOffersForSKUResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="GetLowestPricedOffersForSKUResult")
    private GetLowestPricedOffersForSKUResult getLowestPricedOffersForSKUResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetLowestPricedOffersForSKUResult.
     *
     * @return The value of GetLowestPricedOffersForSKUResult.
     */
    public GetLowestPricedOffersForSKUResult getGetLowestPricedOffersForSKUResult() {
        return getLowestPricedOffersForSKUResult;
    }

    /**
     * Set the value of GetLowestPricedOffersForSKUResult.
     *
     * @param getLowestPricedOffersForSKUResult
     *            The new value to set.
     */
    public void setGetLowestPricedOffersForSKUResult(GetLowestPricedOffersForSKUResult getLowestPricedOffersForSKUResult) {
        this.getLowestPricedOffersForSKUResult = getLowestPricedOffersForSKUResult;
    }

    /**
     * Check to see if GetLowestPricedOffersForSKUResult is set.
     *
     * @return true if GetLowestPricedOffersForSKUResult is set.
     */
    public boolean isSetGetLowestPricedOffersForSKUResult() {
        return getLowestPricedOffersForSKUResult != null;
    }

    /**
     * Set the value of GetLowestPricedOffersForSKUResult, return this.
     *
     * @param getLowestPricedOffersForSKUResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForSKUResponse withGetLowestPricedOffersForSKUResult(GetLowestPricedOffersForSKUResult getLowestPricedOffersForSKUResult) {
        this.getLowestPricedOffersForSKUResult = getLowestPricedOffersForSKUResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForSKUResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * Set the value of ResponseHeaderMetadata.
     *
     * @param responseHeaderMetadata
     *            The new value to set.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForSKUResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        getLowestPricedOffersForSKUResult = r.read("GetLowestPricedOffersForSKUResult", GetLowestPricedOffersForSKUResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("GetLowestPricedOffersForSKUResult", getLowestPricedOffersForSKUResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetLowestPricedOffersForSKUResponse",this);
    }


    /** Default constructor. */
    public GetLowestPricedOffersForSKUResponse() {
        super();
    }

}
