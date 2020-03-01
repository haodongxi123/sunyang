package io.syy.jcartadministrationback.service;

import io.syy.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);

}
