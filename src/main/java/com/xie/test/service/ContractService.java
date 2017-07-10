package com.xie.test.service;

import java.util.List;

import com.xie.test.vo.Contract;

public interface ContractService {

	List<Contract> selectByPrimaryKey(int id);
	 void deleteByPrimaryKey(int id);
}
