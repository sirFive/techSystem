package com.xie.test.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xie.test.service.ContractService;
import com.xie.test.vo.Contract;
import com.xie.test.vo.Report1;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Controller
@RequestMapping(value="contract")
public class ContractController {
	
	@Autowired
	public ContractService contractService;

	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public String report(Model model) {
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");//可以方便地修改日期格式
		// 报表数据源
		List<Contract> contract=contractService.selectByPrimaryKey(2);
		Report1 report1 = new Report1();
		for(int i=0;i<contract.size();i++){
			report1.setConNumber("123");
			report1.setSignDate(dateFormat.format(now));
			report1.setSignAddress("深圳");
			report1.setCusName(contract.get(i).getCustomer().getName());
			report1.setCusTel(contract.get(i).getCustomer().getConstract());
			report1.setCusEmail("9777@qq.com");
			report1.setCusAddress("yulin");
			report1.setGoodsName(contract.get(i).getGoodsname());
			report1.setSpecifications(contract.get(i).getSpecifications());
			report1.setQuantity(contract.get(i).getQuantity());
			report1.setAmount(100);
			report1.setTotalVal(1000);
			report1.setPacking(contract.get(i).getPacking());
			report1.setAddSub(contract.get(i).getClaimant().toString());
			report1.setShipTime(dateFormat.format(contract.get(i).getShiptime()));
			report1.setPayCondition(contract.get(i).getPaycondition());
			report1.setPlaPro(contract.get(i).getPlapro());
		}
		List<Report1> report = new ArrayList<Report1>();
		report.add(report1);
		JRDataSource jrDataSource = new JRBeanCollectionDataSource(report);
		
		// 动态指定报表模板url
		model.addAttribute("url", "/WEB-INF/jasper/report1.jasper");
		model.addAttribute("format", "pdf"); // 报表格式
		model.addAttribute("jrMainDataSource", jrDataSource);
		
		return "reportView"; // 对应jasper-views.xml中的bean id
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView delete(int id) {
		ModelAndView modelAndView=new ModelAndView();
		contractService.deleteByPrimaryKey(id);
		modelAndView.setViewName("showUser");
		return modelAndView; // 对应jasper-views.xml中的bean id
	}
}
