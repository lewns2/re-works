package com.lewns2.worksserver.works.resource.repository;

import com.lewns2.worksserver.works.resource.entity.QResource;
import com.lewns2.worksserver.works.resource.entity.Resource;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;


@Repository
public class ResourceRepository {

    private final JPAQueryFactory query;
    private static final QResource r = QResource.resource;

    public ResourceRepository(JPAQueryFactory jpaQueryFactory) {
        this.query = jpaQueryFactory;
    }

    public List<Resource> findAllResource(String type, String ofb, String loc, String search) {

        List<Resource> findList = query.selectFrom(r)
                .where(
                        eqType(type),
                        eqOfb(ofb),
                        eqLoc(loc),
                        containSearch(search)
                )
                .fetch();

        return findList;
    }

    /* BooleanExpressions */
    private BooleanExpression containSearch(String search) {
        if(!StringUtils.hasText(search)) {
            return null;
        }

        return r.res_nm.contains(search);
    }
    private BooleanExpression eqType(String type) {
        if(Objects.equals(type, "")) {
            return null;
        }
        return r.comn_rst.eq(type);
    }

    private BooleanExpression eqOfb(String ofb) {
        if(Objects.equals(ofb, "")) {
            return null;
        }
        return r.comn_ofb.eq(ofb);
    }

    private BooleanExpression eqLoc(String loc) {
        if(Objects.equals(loc, "")) {
            return null;
        }
        return r.comn_loc.eq(loc);
    }
}

