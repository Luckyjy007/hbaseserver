/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package bigdataserver.hbase.service.impl;


import bigdataserver.hbase.domain.UserInfo;
import bigdataserver.hbase.mapper.HbaseAccountInfoMapper;
import bigdataserver.hbase.service.HbaseAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: hbase_query
 * @description:
 * @author: jiangyun
 * @create: 2018-06-07 19:41
 **/
@Service("hbaseAccountInfoServiceImpl")
public class HbaseAccountInfoServiceImpl implements HbaseAccountInfoService {

    @Autowired
    HbaseAccountInfoMapper hbaseAccountInfoMapper;
    @Override
    public UserInfo findUserInfoByEntity(String table, String family, String rowKey, UserInfo userInfo) {
        return hbaseAccountInfoMapper.findUserInfoByEntity(table,family,rowKey,userInfo);
    }

    @Override
    public List<UserInfo> findAll(String tablename,String family) {
        return hbaseAccountInfoMapper.findAll(tablename,family);
    }
}

