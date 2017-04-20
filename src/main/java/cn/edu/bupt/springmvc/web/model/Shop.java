package cn.edu.bupt.springmvc.web.model;

import java.util.Date;

public class Shop {
    private Long shopId;

    private String shopName;

    private String shopIntroduction;

    private Byte shopType;

    private String shopCover;

    private Long merchantId;

    private String merchantName;

    private Byte shopState;

    private Date shopCreateDate;

    private Date shopUpdateDate;

    private Byte shopIsDelete;

    private String shopLocateProvince;

    private String shopLocateCity;

    private String shopLocateArea;

    private Byte shopIsOpen;

    public Shop() {
    }

    public Shop(String shopName, String shopIntroduction, Byte shopType, String shopCover, Long merchantId, String merchantName, Byte shopState, Date shopCreateDate, Date shopUpdateDate, Byte shopIsDelete, String shopLocateProvince, String shopLocateCity, String shopLocateArea, Byte shopIsOpen) {
        this.shopName = shopName;
        this.shopIntroduction = shopIntroduction;
        this.shopType = shopType;
        this.shopCover = shopCover;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.shopState = shopState;
        this.shopCreateDate = shopCreateDate;
        this.shopUpdateDate = shopUpdateDate;
        this.shopIsDelete = shopIsDelete;
        this.shopLocateProvince = shopLocateProvince;
        this.shopLocateCity = shopLocateCity;
        this.shopLocateArea = shopLocateArea;
        this.shopIsOpen = shopIsOpen;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopIntroduction() {
        return shopIntroduction;
    }

    public void setShopIntroduction(String shopIntroduction) {
        this.shopIntroduction = shopIntroduction == null ? null : shopIntroduction.trim();
    }

    public Byte getShopType() {
        return shopType;
    }

    public void setShopType(Byte shopType) {
        this.shopType = shopType;
    }

    public String getShopCover() {
        return shopCover;
    }

    public void setShopCover(String shopCover) {
        this.shopCover = shopCover == null ? null : shopCover.trim();
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public Byte getShopState() {
        return shopState;
    }

    public void setShopState(Byte shopState) {
        this.shopState = shopState;
    }

    public Date getShopCreateDate() {
        return shopCreateDate;
    }

    public void setShopCreateDate(Date shopCreateDate) {
        this.shopCreateDate = shopCreateDate;
    }

    public Date getShopUpdateDate() {
        return shopUpdateDate;
    }

    public void setShopUpdateDate(Date shopUpdateDate) {
        this.shopUpdateDate = shopUpdateDate;
    }

    public Byte getShopIsDelete() {
        return shopIsDelete;
    }

    public void setShopIsDelete(Byte shopIsDelete) {
        this.shopIsDelete = shopIsDelete;
    }

    public String getShopLocateProvince() {
        return shopLocateProvince;
    }

    public void setShopLocateProvince(String shopLocateProvince) {
        this.shopLocateProvince = shopLocateProvince == null ? null : shopLocateProvince.trim();
    }

    public String getShopLocateCity() {
        return shopLocateCity;
    }

    public void setShopLocateCity(String shopLocateCity) {
        this.shopLocateCity = shopLocateCity == null ? null : shopLocateCity.trim();
    }

    public String getShopLocateArea() {
        return shopLocateArea;
    }

    public void setShopLocateArea(String shopLocateArea) {
        this.shopLocateArea = shopLocateArea == null ? null : shopLocateArea.trim();
    }

    public Byte getShopIsOpen() {
        return shopIsOpen;
    }

    public void setShopIsOpen(Byte shopIsOpen) {
        this.shopIsOpen = shopIsOpen;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopIntroduction='" + shopIntroduction + '\'' +
                ", shopType=" + shopType +
                ", shopCover='" + shopCover + '\'' +
                ", merchantId=" + merchantId +
                ", merchantName='" + merchantName + '\'' +
                ", shopState=" + shopState +
                ", shopCreateDate=" + shopCreateDate +
                ", shopUpdateDate=" + shopUpdateDate +
                ", shopIsDelete=" + shopIsDelete +
                ", shopLocateProvince='" + shopLocateProvince + '\'' +
                ", shopLocateCity='" + shopLocateCity + '\'' +
                ", shopLocateArea='" + shopLocateArea + '\'' +
                ", shopIsOpen=" + shopIsOpen +
                '}';
    }
}