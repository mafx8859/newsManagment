package com.bluemsun.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * Created by mafx on 2019/6/15.
 */
@Service
public class CommonService {
    @Autowired
    Jedis jedis;

    public void delCache(String key){
       jedis.del(key);
    }
}
