package com.wunai.service;

import com.wunai.bo.Panel;
import com.wunai.bo.PanelContent;
import com.wunai.bo.Product;

import java.util.List;

public interface IPanelService {

    /**
     * 查询菜单
     * */
    public  List<PanelContent> getNavList();

    public List<Panel> getHome();

    public Product getProduct(Long id);

    public List<Panel> getRecommendGoods();
}
