package com.hanjiawei.codeploy.service;

import cn.hutool.extra.ssh.JschUtil;
import com.jcraft.jsch.Session;

import java.nio.charset.StandardCharsets;

public class NginxDeployService {


    public void deploy(){
        Session session = JschUtil.getSession("server.banip.top", 22, "root", "123");
        // 由项目自己配置
        String packageCmd = "npm ";
        String exec = JschUtil.exec(session, packageCmd, StandardCharsets.UTF_8, System.err);
        System.out.println(exec);
    }
}
