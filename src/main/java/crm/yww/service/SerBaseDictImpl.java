package crm.yww.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crm.yww.mapper.DaoBaseDict;
import crm.yww.pojo.BaseDict;

@Service
public class SerBaseDictImpl  implements SerBaseDict{
	//自动配置属性
	@Autowired
	private DaoBaseDict dictSelectId;
	
	@Override
	/**
	 * 根据id查询用户显示信息
	 */
	public List<BaseDict> selectBaseDictByIdSer(String sid) {
		List<BaseDict> selectDictByIdList = dictSelectId.selectBaseDictById(sid);
		System.out.println(selectDictByIdList);
		return selectDictByIdList;
	}

}
