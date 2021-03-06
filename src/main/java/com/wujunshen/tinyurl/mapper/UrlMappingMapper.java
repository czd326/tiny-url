package com.wujunshen.tinyurl.mapper;

import com.wujunshen.tinyurl.entity.UrlMapping;
import com.wujunshen.tinyurl.provider.UrlMappingProvider;

import org.apache.ibatis.annotations.SelectProvider;

public interface UrlMappingMapper {
  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tb_url_mapping
   *
   * @mbg.generated Fri May 01 16:18:13 CST 2020
   */
  int deleteByPrimaryKey(Long urlId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tb_url_mapping
   *
   * @mbg.generated Fri May 01 16:18:13 CST 2020
   */
  int insert(UrlMapping record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tb_url_mapping
   *
   * @mbg.generated Fri May 01 16:18:13 CST 2020
   */
  int insertSelective(UrlMapping record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tb_url_mapping
   *
   * @mbg.generated Fri May 01 16:18:13 CST 2020
   */
  UrlMapping selectByPrimaryKey(Long urlId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tb_url_mapping
   *
   * @mbg.generated Fri May 01 16:18:13 CST 2020
   */
  int updateByPrimaryKeySelective(UrlMapping record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tb_url_mapping
   *
   * @mbg.generated Fri May 01 16:18:13 CST 2020
   */
  int updateByPrimaryKey(UrlMapping record);

  /**
   * 通过 短链后缀 获取
   *
   * @param tinyUrl
   * @return
   */
  @SelectProvider(type = UrlMappingProvider.class, method = "findByTinyUrl")
  UrlMapping findByTinyUrl(String tinyUrl);

  /**
   * 通过 长地址 获取
   *
   * @param originUrl
   * @return
   */
  @SelectProvider(type = UrlMappingProvider.class, method = "findByOriginalUrlMd5")
  UrlMapping findByOriginalUrlMd5(String originUrl);
}
