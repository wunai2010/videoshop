package com.wunai.front.controller;

import com.wunai.bo.Panel;
import com.wunai.bo.PanelContent;
import com.wunai.bo.Product;
import com.wunai.result.Result;
import com.wunai.service.IPanelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private IPanelService panelService;


    @RequestMapping(value = "/goods/navList",method = RequestMethod.GET)
    @ApiOperation(value = "获取导航栏")
    public Result<List<PanelContent>> getNavList(){
        List<PanelContent> list=panelService.getNavList();
        return new Result<List<PanelContent>>(list);
    }

    @RequestMapping(value = "/goods/home",method = RequestMethod.GET)
    @ApiOperation(value = "首页内容展示")
    public Result<List<Panel>> getProductHome(){

        List<Panel> list=panelService.getHome();
        return new Result<List<Panel>>(list);
    }

    @RequestMapping(value = "/goods/productDet",method = RequestMethod.GET)
    @ApiOperation(value = "商品详情")
    public Result<Product> getProductDet(Long productId){

        Product product=panelService.getProduct(productId);
        return new Result<Product>(product);
    }

    @RequestMapping(value = "/goods/allGoods",method = RequestMethod.GET)
    @ApiOperation(value = "所有商品")
    public Result<Product> getAllProduct(@RequestParam(defaultValue = "1") int page,
                                                @RequestParam(defaultValue = "20") int size,
                                                @RequestParam(defaultValue = "") String sort,
                                                @RequestParam(defaultValue = "") Long cid,
                                                @RequestParam(defaultValue = "-1") int priceGt,
                                                @RequestParam(defaultValue = "-1") int priceLte){

        //AllGoodsResult allGoodsResult=contentService.getAllProduct(page,size,sort,cid,priceGt,priceLte);
        return new Result<Product>(null);
    }

//    @RequestMapping(value = "/goods/search",method = RequestMethod.GET)
//    @ApiOperation(value = "搜索商品ES")
//    public Result<SearchResult> searchProduct(@RequestParam(defaultValue = "") String key,
//                                              @RequestParam(defaultValue = "1") int page,
//                                              @RequestParam(defaultValue = "20") int size,
//                                              @RequestParam(defaultValue = "") String sort,
//                                              @RequestParam(defaultValue = "-1") int priceGt,
//                                              @RequestParam(defaultValue = "-1") int priceLte){
//
//        SearchResult searchResult=searchService.search(key,page,size,sort,priceGt,priceLte);
//        return new ResultUtil<SearchResult>().setData(searchResult);
//    }

    @RequestMapping(value = "/goods/recommend",method = RequestMethod.GET)
    @ApiOperation(value = "商品推荐板块")
    public Result<List<Panel>> getRecommendGoods(){

        List<Panel> list=panelService.getRecommendGoods();
        return new Result<List<Panel>>(list);
    }

//    @RequestMapping(value = "/goods/thank",method = RequestMethod.GET)
//    @ApiOperation(value = "我要捐赠板块")
//    public Result<List<Panel>> getThankGoods(){
//        List<Panel> list=panelService.getThankGoods();
//        return new ResultUtil<List<TbPanel>>().setData(list);
//    }
//
//    @RequestMapping(value = "/goods/quickSearch",produces= "text/plain;charset=UTF-8",method = RequestMethod.GET)
//    @ApiOperation(value = "快速搜索")
//    public String getQuickSearch(@RequestParam(defaultValue = "") String key){
//
//        return searchService.quickSearch(key);
//    }
}
