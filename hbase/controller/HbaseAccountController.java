/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package bigdataserver.hbase.controller;


import bigdataserver.hbase.domain.UserInfo;
import bigdataserver.hbase.service.HbaseAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: hbase_query
 * @description:
 * @author: jiangyun
 * @create: 2018-06-07 19:41
 **/
@Controller
public class HbaseAccountController {

    private final static String TABLE_NAME = "golden_compass:appLogIqj_test";

    private final static String FAMILY_INFO = "CF";

    @Autowired
    private HbaseAccountInfoService hbaseAccountInfoServiceImpl;
    @RequestMapping(value = "/bigdata/find")
    public String findUserInfoByName(String name, ModelMap modelMap) {
        UserInfo userInfo = hbaseAccountInfoServiceImpl.findUserInfoByEntity(TABLE_NAME, FAMILY_INFO,
                "1", new UserInfo());

        modelMap.addAttribute("userInfo", userInfo);

        return "hbase/hbasetest";

        /*List<UserInfo> list = hbaseAccountInfoServiceImpl.findAll(TABLE_NAME, FAMILY_INFO);*/

    }
}

