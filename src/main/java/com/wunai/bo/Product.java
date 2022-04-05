package com.wunai.bo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Product implements Serializable {
     private long id;
     private String name;//产品名称
     private String remark;//产品描述
     private BigDecimal  price;//产品价格
     private BigDecimal  amount;//数量
     private String mainPic;//产品主图
     private String extraPic1;//附加图片1
     private String extraPic2;//附加图片2
     private int  type;//产品类型
}
