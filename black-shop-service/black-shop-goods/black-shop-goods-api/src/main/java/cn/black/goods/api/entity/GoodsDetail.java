/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.black.goods.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


/**
 * 商品详情实体
 * @author zibin
 */
@Data
public class GoodsDetail {

	/**
	 * 商品详情id
	 */
	@TableId(value = "goods_detail_id", type = IdType.AUTO)
	private Long goodsDetailId;

	/**
	 * 商品id
	 */
	private Long goodsId;

	/**
	 * 商品详情信息
	 */
	private String productContent;
}