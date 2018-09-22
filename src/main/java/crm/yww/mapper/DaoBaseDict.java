package crm.yww.mapper;

import java.util.List;

import crm.yww.pojo.BaseDict;

public interface DaoBaseDict {

	/**
	 * 根据id查询客户信息
	 * @param id
	 * @return
	 */
	List<BaseDict> selectBaseDictById(String id);
}
