package com.xie.test.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xie.test.dao.IContractDao;
import com.xie.test.service.ContractService;
import com.xie.test.vo.Contract;

@Service
public class ContractServiceImpl implements ContractService{

	@Autowired
	public IContractDao contractDao;
	
	public List<Contract> selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		return contractDao.selectByPrimaryKey(id);
	}

	public void deleteByPrimaryKey(int id){
		contractDao.deleteByPrimaryKey(id);
	}
}
