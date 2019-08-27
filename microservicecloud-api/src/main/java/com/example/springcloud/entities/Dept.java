package com.example.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor          // 生成无参构造方法
@Data                       // 生成getter和setter方法
@Accessors(chain = true)    // dept.setDeptno(101L).setDname("研发部").setDb_source("mysql");
public class Dept implements Serializable {

    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;
    // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(101L).setDname("研发部").setDb_source("mysql");
        System.out.println(dept);
    }
}
