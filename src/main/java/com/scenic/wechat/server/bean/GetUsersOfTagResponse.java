package com.scenic.wechat.server.bean;

/**
 * author:980463316@qq.com <br/>
 * Created on 2016-08-29 21:17.
 */
public class GetUsersOfTagResponse extends BaseBean {

    /**
     * 这次获取的粉丝数量
     */
    private long count;

    /**
     * 粉丝列表
     */
    private UserOpenIdList data;

    /**
     * 拉取列表最后一个用户的openid
     */
    private String next_openid;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public UserOpenIdList getData() {
        return data;
    }

    public void setData(UserOpenIdList data) {
        this.data = data;
    }

    public String getNext_openid() {
        return next_openid;
    }

    public void setNext_openid(String next_openid) {
        this.next_openid = next_openid;
    }
}
