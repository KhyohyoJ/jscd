package com.jscd.app.lecture.lstRegist.dto;

import java.util.Objects;

public class LstRegistDto {
    private Integer registCode;
    private String title;
    private String discription;
//    private Integer courseCode;
    private String onOff;
    private String status;
    private Integer minNum;
    private Integer maxNum;
    private String location;
    private Integer currentNum;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private String name;
    private String book;
    private String material;
    private Integer price;
    private String discount;
    private Integer lstPrice;
    private String content;
    private String attachedFile;
    private String regDate;
    private Integer firstIdNo;
    private String modifyDate;
    private Integer lastIdNo;
    private String etc;

    public LstRegistDto() {
    }

    public LstRegistDto(Integer registCode, String title, String discription, String onOff, String status, Integer minNum, Integer maxNum, Integer currentNum, String location, String startDate, String endDate, String startTime, String endTime, String name, String book, String material, Integer price, String discount, Integer lstPrice, String content, String attachedFile, String regDate, Integer firstIdNo, String modifyDate, Integer lastIdNo, String etc) {
        this.registCode = registCode;
        this.title = title;
        this.discription = discription;
        this.onOff = onOff;
        this.status = status;
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.currentNum = currentNum;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.book = book;
        this.material = material;
        this.price = price;
        this.discount = discount;
        this.lstPrice = lstPrice;
        this.content = content;
        this.attachedFile = attachedFile;
        this.regDate = regDate;
        this.firstIdNo = firstIdNo;
        this.modifyDate = modifyDate;
        this.lastIdNo = lastIdNo;
        this.etc = etc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LstRegistDto that = (LstRegistDto) o;
        return Objects.equals(registCode, that.registCode) && Objects.equals(title, that.title) && Objects.equals(discription, that.discription) && Objects.equals(onOff, that.onOff) && Objects.equals(status, that.status) && Objects.equals(minNum, that.minNum) && Objects.equals(maxNum, that.maxNum) && Objects.equals(location, that.location) && Objects.equals(currentNum, that.currentNum) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(name, that.name) && Objects.equals(book, that.book) && Objects.equals(material, that.material) && Objects.equals(price, that.price) && Objects.equals(discount, that.discount) && Objects.equals(lstPrice, that.lstPrice) && Objects.equals(content, that.content) && Objects.equals(attachedFile, that.attachedFile) && Objects.equals(regDate, that.regDate) && Objects.equals(firstIdNo, that.firstIdNo) && Objects.equals(modifyDate, that.modifyDate) && Objects.equals(lastIdNo, that.lastIdNo) && Objects.equals(etc, that.etc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registCode, title, discription, onOff, status, minNum, maxNum, location, currentNum, startDate, endDate, startTime, endTime, name, book, material, price, discount, lstPrice, content, attachedFile, regDate, firstIdNo, modifyDate, lastIdNo, etc);
    }

    public Integer getRegistCode() {
        return registCode;
    }

    public void setRegistCode(Integer registCode) {
        this.registCode = registCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getOnOff() {
        return onOff;
    }

    public void setOnOff(String onOff) {
        this.onOff = onOff;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Integer getLstPrice() {
        return lstPrice;
    }

    public void setLstPrice(Integer lstPrice) {
        this.lstPrice = lstPrice;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttachedFile() {
        return attachedFile;
    }

    public void setAttachedFile(String attachedFile) {
        this.attachedFile = attachedFile;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public Integer getFirstIdNo() {
        return firstIdNo;
    }

    public void setFirstIdNo(Integer firstIdNo) {
        this.firstIdNo = firstIdNo;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getLastIdNo() {
        return lastIdNo;
    }

    public void setLastIdNo(Integer lastIdNo) {
        this.lastIdNo = lastIdNo;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    @Override
    public String toString() {
        return "LstRegistDto{" +
                "registCode=" + registCode +
                ", title='" + title + '\'' +
                ", discription='" + discription + '\'' +
                ", onOff='" + onOff + '\'' +
                ", status='" + status + '\'' +
                ", minNum=" + minNum +
                ", maxNum=" + maxNum +
                ", currentNum=" + currentNum +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", name='" + name + '\'' +
                ", book='" + book + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", discount='" + discount + '\'' +
                ", lstPrice=" + lstPrice +
                ", content='" + content + '\'' +
                ", attachedFile='" + attachedFile + '\'' +
                ", regDate='" + regDate + '\'' +
                ", firstIdNo=" + firstIdNo +
                ", modifyDate='" + modifyDate + '\'' +
                ", lastIdNo=" + lastIdNo +
                ", etc='" + etc + '\'' +
                '}';
    }
}
