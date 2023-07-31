
package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.Tips;

public interface TipsService {

    /**
     * 获取公告
     *
     * @return
     */
    Tips select();

    /**
     * 新增或更新公告内容
     *
     * @param content
     * @return
     */
    Boolean createOrUpdate(String content);

}
