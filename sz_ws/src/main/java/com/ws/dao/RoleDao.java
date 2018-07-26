package com.ws.dao;

import java.util.List;
import java.util.Map;

/**
 * @author lujun
 * @date 2018年7月12日
 */
public interface RoleDao {
	 //查询所有角色
    List<String> selectAllRole();
    //根据用户编码查询角色
    List<String> selectByUserCodeRole(String userCode);
    //查询全部角色信息
   List<Map<String, Object>> selectAllRoleInfo();
}
