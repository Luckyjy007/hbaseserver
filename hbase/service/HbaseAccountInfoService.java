/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package bigdataserver.hbase.service;


import bigdataserver.hbase.domain.UserInfo;

import java.util.List;

/**
 * @program: hbase_query
 * @description:
 * @author: jiangyun
 * @create: 2018-06-07 19:41
 **/
public interface HbaseAccountInfoService {

    UserInfo findUserInfoByEntity(String table, String family, String rowKey, UserInfo userInfo);

    List<UserInfo> findAll(String tablename, String family);

}