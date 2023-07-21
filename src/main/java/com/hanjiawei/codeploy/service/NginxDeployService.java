package com.hanjiawei.codeploy.service;

import cn.hutool.extra.ssh.JschUtil;
import com.jcraft.jsch.Session;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class NginxDeployService {


    public void deploy() {
        String projectName = "codeploy";
        String gitUrl = "";
        String branch = "main";
        String port = "8080";
        String containerPort = "8080";
        // tag格式 当前日期+时间戳
        String tag = LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
//        String dockerImageName = String.format("%s:%s", projectName, tag);
        String dockerBuildCmd = String.format("docker build -t %s:%s -f ./Dockerfile .", projectName, tag);

        String dockerRunCmd = String.format("docker run -d -p %s:%s --name %s %s:%s", port, containerPort, projectName, projectName, tag);

        Session session = JschUtil.getSession("server.banip.top", 22, "root", "123");
        // 由项目自己配置
        String packageCmd = "npm ";
        String exec = JschUtil.exec(session, packageCmd, StandardCharsets.UTF_8, System.err);
        System.out.println(exec);
    }
}
