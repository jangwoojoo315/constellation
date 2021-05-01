package com.jang.constellation.goods.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class GoodsVO {
	private int gdsNum;
	private String gdsName;
	private String cateCode;
	private int gdsPrice;
	private int gdsStock;
	private String gdsDes;
	private String gdsImg;
	private Date gdsDate;
}
