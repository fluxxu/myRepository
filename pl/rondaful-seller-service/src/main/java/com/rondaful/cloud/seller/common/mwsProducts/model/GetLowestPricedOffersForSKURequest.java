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
 * Get Lowest Priced Offers For SKU Request
 * API Version: 2011-10-01
 * Library Version: 2017-03-22
 * Generated: Wed Mar 22 23:24:32 UTC 2017
 */
package com.rondaful.cloud.seller.common.mwsProducts.model;

import com.rondaful.cloud.seller.common.mwsProducts.client.AbstractMwsObject;
import com.rondaful.cloud.seller.common.mwsProducts.client.MwsReader;
import com.rondaful.cloud.seller.common.mwsProducts.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * GetLowestPricedOffersForSKURequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetLowestPricedOffersForSKURequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetLowestPricedOffersForSKURequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplaceId",
    "sellerSKU",
    "itemCondition"
})
@XmlRootElement(name = "GetLowestPricedOffersForSKURequest")
public class GetLowestPricedOffersForSKURequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="MarketplaceId",required=true)
    private String marketplaceId;

    @XmlElement(name="SellerSKU",required=true)
    private String sellerSKU;

    @XmlElement(name="ItemCondition",required=true)
    private String itemCondition;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForSKURequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForSKURequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForSKURequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null;
    }

    /**
     * Set the value of SellerSKU, return this.
     *
     * @param sellerSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForSKURequest withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get the value of ItemCondition.
     *
     * @return The value of ItemCondition.
     */
    public String getItemCondition() {
        return itemCondition;
    }

    /**
     * Set the value of ItemCondition.
     *
     * @param itemCondition
     *            The new value to set.
     */
    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    /**
     * Check to see if ItemCondition is set.
     *
     * @return true if ItemCondition is set.
     */
    public boolean isSetItemCondition() {
        return itemCondition != null;
    }

    /**
     * Set the value of ItemCondition, return this.
     *
     * @param itemCondition
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForSKURequest withItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        marketplaceId = r.read("MarketplaceId", String.class);
        sellerSKU = r.read("SellerSKU", String.class);
        itemCondition = r.read("ItemCondition", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("MarketplaceId", marketplaceId);
        w.write("SellerSKU", sellerSKU);
        w.write("ItemCondition", itemCondition);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetLowestPricedOffersForSKURequest",this);
    }

    /** Value constructor. */
    public GetLowestPricedOffersForSKURequest(String sellerId,String marketplaceId,String sellerSKU,String itemCondition) {
        this.sellerId = sellerId;
        this.marketplaceId = marketplaceId;
        this.sellerSKU = sellerSKU;
        this.itemCondition = itemCondition;
    }    

    /** Default constructor. */
    public GetLowestPricedOffersForSKURequest() {
        super();
    }

}
