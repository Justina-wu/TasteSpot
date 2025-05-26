package com.hmdp.utils;

/**
 * ClassName: ILock
 * Package: com.hmdp.utils
 * Description:
 *
 * @Author JIAYI WU
 * @Create 2025/5/16 15:53
 * @Version 1.0
 */
public interface ILock {

    // 尝试获取锁
    // timeoutSec 所持有的超时时间，过期自动释放
    boolean tryLock(long timeoutSec);

    // 释放锁
    void unlock();

}
