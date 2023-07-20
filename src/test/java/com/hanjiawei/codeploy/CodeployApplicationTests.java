package com.hanjiawei.codeploy;

import com.hanjiawei.codeploy.service.NginxDeployService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class CodeployApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void testSSH(){
		NginxDeployService nginxDeployService = new NginxDeployService();
		nginxDeployService.deploy();
	}
}
