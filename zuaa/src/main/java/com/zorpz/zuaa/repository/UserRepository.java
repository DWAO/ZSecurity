package com.zorpz.zuaa.repository;

import com.zorpz.zuaa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SysUser, Long> {

    SysUser findSysUserByUsername(String username);
}
