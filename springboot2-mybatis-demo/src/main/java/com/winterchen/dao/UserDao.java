package com.winterchen.dao;


import com.winterchen.model.UserDomain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/*
 * 
     * @ClassName: UserDao
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年7月2日
     *
 */
@Mapper
public interface UserDao {

	/*
	 * 新增
	 */
    int insert(UserDomain record);

    /*
     * 查询
     */

    List<UserDomain> selectUsers();
    /*
     *跟新 
     */
    void updateUser( UserDomain userDomain);
    /*
     * 删除
     */
    void delUser(Integer userId);

    /*
     * 查询
     */
    UserDomain selectUser(Integer userId);
    
}