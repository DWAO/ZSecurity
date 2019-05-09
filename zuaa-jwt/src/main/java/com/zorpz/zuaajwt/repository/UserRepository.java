package com.zorpz.zuaajwt.repository;

import com.zorpz.zuaajwt.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SysUser, Long> {

    SysUser findSysUserByUsername(String username);
}
