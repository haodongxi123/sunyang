package io.syy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.syy.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.syy.jcartadministrationback.po.Return;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);
}
