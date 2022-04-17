package com.wunai.service.impl;

import com.wunai.bo.Panel;
import com.wunai.bo.PanelContent;
import com.wunai.bo.Product;
import com.wunai.service.IPanelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanelServiceImpl implements IPanelService {
    public List<PanelContent> getNavList(){
        return null;
    }

    public List<Panel> getHome(){
        return null;
    }

    public Product getProduct(Long id){
        return null;
    }

    public List<Panel> getRecommendGoods(){
        return null;
    }
}
