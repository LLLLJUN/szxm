package com.ws.dao;

import java.util.List;
import java.util.Map;

import com.ws.model.Condition;
import com.ws.model.Page;
import com.ws.model.Users;


/**
 * @author lujun
 * @date 2018年6月29日
 */
public interface UsersDao {
	//登录
	Map<String,Object> selectLogin(Users users);
	//shiro认证，根据userCode查询对应的用户信息
	Users selectByUsersCode(String userCode);
	//新增用户
	int insertUser(Users users);
	//修改用户信息
	int updateUsers(Users users);
	//删除用户
	int deleteUsers(String userCode);
	//用户列表
	List<Map<String, Object>> selectUserList(Page page);
	//指定条件下的用户总数
	int selectCount(Condition condition);
}
