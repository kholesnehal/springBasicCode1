package com.springcore.aop;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ShopService implements Shop{
    private static final Logger logger = LogManager.getLogger(ShopService.class);
    @Override
    public void service() {
        logger.info("good service provided");
    }
}
