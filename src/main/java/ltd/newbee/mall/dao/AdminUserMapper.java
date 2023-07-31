
package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.AdminUser;
import org.apache.ibatis.annotations.Param;
//微信 egvh56ufy7hh ，QQ：821898835

public interface AdminUserMapper {
    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    /**
     * 登陆方法
     *
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    AdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}