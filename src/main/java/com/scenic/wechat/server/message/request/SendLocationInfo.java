package com.scenic.wechat.server.message.request;

import lombok.Data;

import java.io.Serializable;

/**
 * Author: jonny
 * Time: 2017-08-25 22:52.
 * <p>
 * <SendLocationInfo>
 * <Location_X><![CDATA[23]]></Location_X>
 * <Location_Y><![CDATA[113]]></Location_Y>
 * <Scale><![CDATA[15]]></Scale>
 * <Label><![CDATA[ 广州市海珠区客村艺苑路 106号]]></Label>
 * <Poiname><![CDATA[]]></Poiname>
 * </SendLocationInfo>
 */
@Data
public class SendLocationInfo implements Serializable {
    /**
     * X坐标信息
     */
    private String Location_X;
    /**
     * Y坐标信息
     */
    private String Location_Y;
    /**
     * 精度,可理解为精度或者比例尺、越精细的话 scale越高
     */
    private String Scale;
    /**
     * 地理位置的字符串信息
     */
    private String Label;
    /**
     * 朋友圈POI的名字，可能为空
     */
    private String Poiname;
	public String getLocation_X() {
		return Location_X;
	}
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}
	public String getLocation_Y() {
		return Location_Y;
	}
	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	public String getPoiname() {
		return Poiname;
	}
	public void setPoiname(String poiname) {
		Poiname = poiname;
	}
    
}
