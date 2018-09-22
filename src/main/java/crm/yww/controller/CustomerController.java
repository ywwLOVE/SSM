package crm.yww.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import crm.yww.pojo.BaseDict;
import crm.yww.service.SerBaseDict;


/**
 * 定义控制层，用户显示客户标签
 * @author administered
 *
 */
@Controller

public class CustomerController {
	//显示客户列表清单,自动配置属性
	@Autowired 
	private SerBaseDict  serBaseDict;
	
	
	@RequestMapping("/show")
	//方法中使用参数，定义model，可以给跳转界面传递参数
	public String listCustomerSelectById(Model model) {
		System.out.println(1111111);
		//客户来源
		List<BaseDict> fromType = serBaseDict.selectBaseDictByIdSer("002");
		//所属行业
		List<BaseDict> industryType = serBaseDict.selectBaseDictByIdSer("001");
		//客户级别
		List<BaseDict> levelType = serBaseDict.selectBaseDictByIdSer("006");
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		System.out.println(model+"mmm");
		return "customer";
	}
}
