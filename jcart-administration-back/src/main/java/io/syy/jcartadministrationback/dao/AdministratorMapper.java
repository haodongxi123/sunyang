package io.syy.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.syy.jcartadministrationback.po.Administrator;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

    //自己写
    Administrator selectByUsername(@Param("username") String username);
    //批删
    int batchDelete(@Param("administratorIds")List<Integer> administratorIds);

    Page<Administrator> selectList();

    Administrator selectByEmail(@Param("email") String email);
}