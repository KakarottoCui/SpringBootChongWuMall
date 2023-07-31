package ltd.newbee.mall.entity;
//微信 egvh56ufy7hh ，QQ：821898835
public class CountHotGoods {
    private String goodId;
    private String goodName;
    private Integer count;

    @Override
    public String toString() {
        return "CountHotGoods{" +
                "goodId='" + goodId + '\'' +
                ", goodName='" + goodName + '\'' +
                ", count=" + count +
                '}';
    }

    public String getGoodId() {
        return goodId;
    }

    public CountHotGoods setGoodId(String goodId) {
        this.goodId = goodId;
        return this;
    }

    public String getGoodName() {
        return goodName;
    }

    public CountHotGoods setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public CountHotGoods setCount(Integer count) {
        this.count = count;
        return this;
    }
}
