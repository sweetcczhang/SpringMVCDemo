package cn.edu.bupt.springmvc.web.model;

public class Merchant {
    private Long merchantId;

    private String userId;

    private String merchantName;

    private String merchantSecurityPasswd;

    private Byte merchantState;

    private Byte merchantLevel;

    private Byte merchantPayment;

    private Byte merchantIsVerified;

    public Merchant() {
    }

    public Merchant(String userId, String merchantName, String merchantSecurityPasswd, Byte merchantState, Byte merchantLevel, Byte merchantPayment, Byte merchantIsVerified) {
        this.userId = userId;
        this.merchantName = merchantName;
        this.merchantSecurityPasswd = merchantSecurityPasswd;
        this.merchantState = merchantState;
        this.merchantLevel = merchantLevel;
        this.merchantPayment = merchantPayment;
        this.merchantIsVerified = merchantIsVerified;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantSecurityPasswd() {
        return merchantSecurityPasswd;
    }

    public void setMerchantSecurityPasswd(String merchantSecurityPasswd) {
        this.merchantSecurityPasswd = merchantSecurityPasswd == null ? null : merchantSecurityPasswd.trim();
    }

    public Byte getMerchantState() {
        return merchantState;
    }

    public void setMerchantState(Byte merchantState) {
        this.merchantState = merchantState;
    }

    public Byte getMerchantLevel() {
        return merchantLevel;
    }

    public void setMerchantLevel(Byte merchantLevel) {
        this.merchantLevel = merchantLevel;
    }

    public Byte getMerchantPayment() {
        return merchantPayment;
    }

    public void setMerchantPayment(Byte merchantPayment) {
        this.merchantPayment = merchantPayment;
    }

    public Byte getMerchantIsVerified() {
        return merchantIsVerified;
    }

    public void setMerchantIsVerified(Byte merchantIsVerified) {
        this.merchantIsVerified = merchantIsVerified;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "merchantId=" + merchantId +
                ", userId='" + userId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantSecurityPasswd='" + merchantSecurityPasswd + '\'' +
                ", merchantState=" + merchantState +
                ", merchantLevel=" + merchantLevel +
                ", merchantPayment=" + merchantPayment +
                ", merchantIsVerified=" + merchantIsVerified +
                '}';
    }
}