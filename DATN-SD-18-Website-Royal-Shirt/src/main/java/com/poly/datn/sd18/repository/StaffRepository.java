package com.poly.datn.sd18.repository;

import com.poly.datn.sd18.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
    @Query(value = "SELECT [id]\n" +
            "      ,[name]\n" +
            "      ,[email]\n" +
            "      ,[phone]\n" +
            "      ,[avatar]\n" +
            "      ,[address]\n" +
            "      ,[password]\n" +
            "      ,[status]\n" +
            "      ,[created_date]\n" +
            "      ,[updated_date]\n" +
            "      ,[role_id]\n" +
            "  FROM [dbo].[staffs]\n" +
            "  WHERE [status] = 0",nativeQuery = true)
    List<Staff> getAllActive();
}
