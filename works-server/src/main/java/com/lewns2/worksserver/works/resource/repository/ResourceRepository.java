package com.lewns2.worksserver.works.resource.repository;

import com.lewns2.worksserver.works.resource.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public interface ResourceRepository extends JpaRepository<Resource, String> {

    @Query(value =
            "SELECT r " +
            "FROM resource r " +
            "WHERE 1=1 " +
            "AND r.comn_rst = :type " + // case : if type not null
            "AND r.comn_ofb = :ofb " +  // case : if ofb not null
            "AND r.comn_loc = :loc " + // case : if loc not null
            "AND r.res_nm LIKE %:search%")
    List<Resource> findAllResource(String type, String ofb, String loc, String search);

//    <if test="COMN_RST != ''">
//    AND comn_rst = #{COMN_RST}
//        </if>
//        <if test="COMN_OFB != ''">
//    AND comn_ofb = #{COMN_OFB}
//        </if>
//        <if test="COMN_LOC != ''">
//    AND comn_loc = #{COMN_LOC}
//        </if>
//    AND res_nm LIKE '%'||#{KEYWORD}||'%'
//    ORDER BY reg_dt DESC;


}
