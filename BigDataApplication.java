/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package bigdataserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: hbase_query
 * @description:
 * @author: jiangyun
 * @create: 2018-06-07 19:41
 **/
@SpringBootApplication
@EnableDiscoveryClient
@ImportResource(locations = {"classpath:/config/hbase-spring.xml"})
public class BigDataApplication {

    public static void main(String[] args) {
        //System.setProperty("hadoop.home.dir", "");
        SpringApplication.run(BigDataApplication.class, args);
    }
}

