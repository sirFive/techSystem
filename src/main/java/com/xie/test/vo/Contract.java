package com.xie.test.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {
    private Integer id;

    private String connumber;

    /**
     * 客户信息
     */
    private Customer customer;

    private String goodsname;

    /**
     * 规格
     */
    private String specifications;

    /**
     * 数量
     */
    private String quantity;

    /**
     * 单价
     */
    private BigDecimal unitprice;

    /**
     * 包装要求
     */
    private String packing;

    /**
     * 产地
     */
    private String plapro;
    
    /**
     * 装运时间
     */
    private Date shiptime;

    /**
     * 付款条件
     */
    private String paycondition;

    /**
     * 索赔
     */
    private String claimant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConnumber() {
        return connumber;
    }

    public void setConnumber(String connumber) {
        this.connumber = connumber == null ? null : connumber.trim();
    }

    public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing == null ? null : packing.trim();
    }

    public String getPlapro() {
        return plapro;
    }

    public void setPlapro(String plapro) {
        this.plapro = plapro == null ? null : plapro.trim();
    }

    public Date getShiptime() {
        return shiptime;
    }

    public void setShiptime(Date shiptime) {
        this.shiptime = shiptime;
    }

    public String getPaycondition() {
        return paycondition;
    }

    public void setPaycondition(String paycondition) {
        this.paycondition = paycondition == null ? null : paycondition.trim();
    }

    public String getClaimant() {
        return claimant;
    }

    public void setClaimant(String claimant) {
        this.claimant = claimant == null ? null : claimant.trim();
    }
}