package com.imooc.passbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Object of Merchants
 * corresponded to merchants.sql
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {

    // merchants id, primary key
    @Id //primary key
    @GeneratedValue // auto generate value
    @Column(name = "id", nullable = false)
    private Integer id;

    // merchants name, unique
    @Basic
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    // merchants logo
    @Basic
    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    // merchants business license
    @Basic
    @Column(name = "business_license_url", nullable = false)
    private String businessLicense;

    // merchants phone
    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    // merchants address
    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    // merchants validated
    @Basic
    @Column(name = "is_audit", nullable = false)
    private boolean isAudit = false;
}
