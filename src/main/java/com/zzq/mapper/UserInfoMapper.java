package com.zzq.mapper;

import com.zzq.po.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper  extends JpaRepository<UserInfo , String>{

    List<UserInfo> findByusername(String username);

}
