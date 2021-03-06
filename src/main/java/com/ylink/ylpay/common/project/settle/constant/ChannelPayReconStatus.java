/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangDM(Mingly)
 * @date 2013-1-4
 * @description：渠道系统与支付系统对账状态
 */
public enum ChannelPayReconStatus {
	
	BALANCE("0", "平帐"),
	UNBALANCE("1", "不平帐"),
	CANCEL("2", "取消对账"),
	ADJUST_BALANCE("3", "调平帐"),
	;

	private String value;
	private final String displayName;

	private static Map<String, ChannelPayReconStatus> valueMap = new HashMap<String, ChannelPayReconStatus>();

	static {
		for ( ChannelPayReconStatus _enum : ChannelPayReconStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	ChannelPayReconStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static ChannelPayReconStatus parseOf( String value ) {
		for ( ChannelPayReconStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "渠道系统与支付系统对账状态[" + value + "]不匹配!" );
	}

}