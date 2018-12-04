package com.hzl.web.repository.es;

import com.hzl.web.bean.es.GoodsInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * GoodsRepository
 *
 * @Author hzl
 * @Date 2018-12-04
 **/
@Component
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo, Long> {

}
