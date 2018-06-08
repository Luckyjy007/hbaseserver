/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package bigdataserver.hbase.mapper;



import bigdataserver.hbase.domain.UserInfo;

import java.util.List;


/**
 * @author cwenao
 * @version $Id HbaseAccountInfoMapper.java, v 0.1 2017-02-16 17:37 cwenao Exp $$
 */
public interface HbaseAccountInfoMapper {

    UserInfo findUserInfoByEntity(String table, String family, String rowKey, UserInfo userInfo);

    List<UserInfo> findAll(String tablename, String family);

}

