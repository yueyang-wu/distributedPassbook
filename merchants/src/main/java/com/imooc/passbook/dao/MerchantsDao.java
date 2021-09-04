package com.imooc.passbook.dao;

import com.imooc.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MerchantsDao extends JpaRepository<Merchants, Integer> {

    /**
     * find merchants by id
     * @param id merchants id
     * @return {@link Merchants}
     */
    Optional<Merchants> findById(Integer id);

    /**
     * find merchants by name
     * @param name merchants name
     * @return {@link Merchants}
     */
    Merchants findByName(String name);
}
