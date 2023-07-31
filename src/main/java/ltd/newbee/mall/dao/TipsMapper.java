
package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.Tips;

public interface TipsMapper {
    int insert(Tips record);

    Tips select();

    int updateByPrimaryKey(Tips record);
}