package com.young.mall.portal.mbg.model;

public class PmsBrand {
    private Long id;

    private String name;

    private String firstLetter;

    private Integer sort;

    private Integer factoryStatus;

    private Integer showStatus;

    private Integer productCount;

    private Integer productCommentCount;

    private String logo;

    private String bigPic;

    private String brandStory;

    public PmsBrand(Long id, String name, String firstLetter, Integer sort, Integer factoryStatus, Integer showStatus, Integer productCount, Integer productCommentCount, String logo, String bigPic) {
        this.id = id;
        this.name = name;
        this.firstLetter = firstLetter;
        this.sort = sort;
        this.factoryStatus = factoryStatus;
        this.showStatus = showStatus;
        this.productCount = productCount;
        this.productCommentCount = productCommentCount;
        this.logo = logo;
        this.bigPic = bigPic;
    }

    public PmsBrand(Long id, String name, String firstLetter, Integer sort, Integer factoryStatus, Integer showStatus, Integer productCount, Integer productCommentCount, String logo, String bigPic, String brandStory) {
        this.id = id;
        this.name = name;
        this.firstLetter = firstLetter;
        this.sort = sort;
        this.factoryStatus = factoryStatus;
        this.showStatus = showStatus;
        this.productCount = productCount;
        this.productCommentCount = productCommentCount;
        this.logo = logo;
        this.bigPic = bigPic;
        this.brandStory = brandStory;
    }

    public PmsBrand() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter == null ? null : firstLetter.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic == null ? null : bigPic.trim();
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory == null ? null : brandStory.trim();
    }
}