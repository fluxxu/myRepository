package com.brandslink.cloud.logistics.service.impl;

import com.brandslink.cloud.logistics.entity.Attribute;
import com.brandslink.cloud.logistics.mapper.AttributeMapper;
import com.brandslink.cloud.logistics.remote.RemoteTestService;
import com.brandslink.cloud.logistics.service.IAttributeService;
import com.brandslink.cloud.common.service.impl.BaseServiceImpl;
import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl extends BaseServiceImpl<Attribute> implements IAttributeService {

    @Autowired
    AttributeMapper attributeMapper;
    @Autowired
    private RemoteTestService remoteTestService;

    @Override
    @TxTransaction(isStart = true)
    public Object updateAttribute(Attribute attribute) {

         int result = attributeMapper.update(attribute);
         Object o = remoteTestService.updateTest(attribute);
        int a = 1/0;
        return o;
    }
}