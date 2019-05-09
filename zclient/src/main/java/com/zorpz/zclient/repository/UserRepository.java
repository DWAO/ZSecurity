package com.zorpz.zclient.repository;

import com.zorpz.zclient.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SysUser, Long> {

    SysUser findSysUserByUsername(String username);
}
