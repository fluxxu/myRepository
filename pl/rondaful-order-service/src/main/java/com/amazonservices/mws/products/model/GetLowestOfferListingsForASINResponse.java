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
 * Get Lowest Offer Listings For ASIN Response
 * API Version: 2011-10-01
 * Library Version: 2017-03-22
 * Generated: Wed Mar 22 23:24:32 UTC 2017
 */
package com.amazonservices.mws.products.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * GetLowestOfferListingsForASINResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetLowestOfferListingsForASINResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetLowestOfferListingsForASINResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetLowestOfferListingsForASINResult" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetLowestOfferListingsForASINResponse", propOrder={
    "getLowestOfferListingsForASINResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetLowestOfferListingsForASINResponse")
public class GetLowestOfferListingsForASINResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="GetLowestOfferListingsForASINResult")
    private List<GetLowestOfferListingsForASINResult> getLowestOfferListingsForASINResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetLowestOfferListingsForASINResult.
     *
     * @return The value of GetLowestOfferListingsForASINResult.
     */
    public List<GetLowestOfferListingsForASINResult> getGetLowestOfferListingsForASINResult() {
        if (getLowestOfferListingsForASINResult==null) {
            getLowestOfferListingsForASINResult = new ArrayList<GetLowestOfferListingsForASINResult>();
        }
        return getLowestOfferListingsForASINResult;
    }

    /**
     * Set the value of GetLowestOfferListingsForASINResult.
     *
     * @param getLowestOfferListingsForASINResult
     *            The new value to set.
     */
    public void setGetLowestOfferListingsForASINResult(List<GetLowestOfferListingsForASINResult> getLowestOfferListingsForASINResult) {
        this.getLowestOfferListingsForASINResult = getLowestOfferListingsForASINResult;
    }

    /**
     * Clear GetLowestOfferListingsForASINResult.
     */
    public void unsetGetLowestOfferListingsForASINResult() {
        this.getLowestOfferListingsForASINResult = null;
    }

    /**
     * Check to see if GetLowestOfferListingsForASINResult is set.
     *
     * @return true if GetLowestOfferListingsForASINResult is set.
     */
    public boolean isSetGetLowestOfferListingsForASINResult() {
        return getLowestOfferListingsForASINResult != null && !getLowestOfferListingsForASINResult.isEmpty();
    }

    /**
     * Add values for GetLowestOfferListingsForASINResult, return this.
     *
     * @param getLowestOfferListingsForASINResult
     *             New values to add.
     *
     * @return This instance.
     */
    public GetLowestOfferListingsForASINResponse withGetLowestOfferListingsForASINResult(GetLowestOfferListingsForASINResult... values) {
        List<GetLowestOfferListingsForASINResult> list = getGetLowestOfferListingsForASINResult();
        for (GetLowestOfferListingsForASINResult value : values) {
            list.add(value);
        }
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
    public GetLowestOfferListingsForASINResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public GetLowestOfferListingsForASINResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        getLowestOfferListingsForASINResult = r.readList("GetLowestOfferListingsForASINResult", GetLowestOfferListingsForASINResult.class);
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
        w.writeList("GetLowestOfferListingsForASINResult", getLowestOfferListingsForASINResult);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetLowestOfferListingsForASINResponse",this);
    }


    /** Default constructor. */
    public GetLowestOfferListingsForASINResponse() {
        super();
    }

}
