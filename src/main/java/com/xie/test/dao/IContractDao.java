package com.xie.test.dao;

import java.util.List;

import com.xie.test.vo.Contract;

public interface IContractDao {

	List<Contract> selectByPrimaryKey(int id);
	void deleteByPrimaryKey(int id);
}
