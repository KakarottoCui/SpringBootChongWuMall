package ltd.newbee.mall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Tips {
    private String id;

    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastModifyTime;

    @Override
    public String toString() {
        return "Tips{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public Tips setId(String id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Tips setContent(String content) {
        this.content = content;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Tips setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public Tips setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
}
