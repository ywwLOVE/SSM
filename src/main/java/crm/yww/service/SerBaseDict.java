package crm.yww.service;

import java.util.List;

import crm.yww.pojo.BaseDict;

public interface SerBaseDict {
	/**
	 * 根据id查询客户信息
	 * @param id
	 * @return
	 */
	List<BaseDict> selectBaseDictByIdSer(String id);
}
