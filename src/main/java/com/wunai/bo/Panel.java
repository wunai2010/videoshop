package com.wunai.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Panel implements Serializable {
    private long id;
    private String name;
    private Integer type;
    private Integer sortOrder;
    private Integer position;
    private Integer limitNum;
    private Integer status;
    private String remark;
}
