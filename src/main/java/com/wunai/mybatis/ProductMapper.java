package com.wunai.mybatis;

import java.util.List;

import com.wunai.bo.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

	List<Product> query(Product product);

	Product find(String id);

	void insert(Product product);

	void update(Product product);

	void delete(Product product);

}
