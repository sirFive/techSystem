package com.xie.test.vo;

import java.util.List;

public class Customer {
    private Integer id;

    private String cusnumber;

    private String name;

    /**
     * 联系方式
     */
    private String constract;

    /**
     * 客户等级
     */
    private String grade;

    /**
     * 合同信息
     */
    private List<Contract> contract;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusnumber() {
        return cusnumber;
    }

    public void setCusnumber(String cusnumber) {
        this.cusnumber = cusnumber == null ? null : cusnumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getConstract() {
        return constract;
    }

    public void setConstract(String constract) {
        this.constract = constract == null ? null : constract.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

	public List<Contract> getContract() {
		return contract;
	}

	public void setContract(List<Contract> contract) {
		this.contract = contract;
	}

}