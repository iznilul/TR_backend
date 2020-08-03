package slg.trbackend.admin.mapper;

import slg.trbackend.admin.dto.Attraction;
import slg.trbackend.admin.entity.QueryIndustry;

import java.util.List;

public interface AttractionMapper {

    /**
     * 通过推荐值查询景点
     * @param queryIndustry
     * @return
     */
    List<Attraction> queryAttracionListByRecommends(QueryIndustry queryIndustry);
}