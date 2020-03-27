# Spring-CQ-Kotlin-Demo
## 简单文档
- 这是一个简单的Demo
- 详细文档暂时没写，如果用的人多就写（星星多）
- 看`HelloPlugin`和`application.yml`自己猜测如何使用
- 参考资料：https://github.com/lz1998/spring-cq
- 参考资料：https://cqhttp.cc/docs/


## CQHTTP配置内容
- 推荐直接点击[这里](http://cq.lz1998.xin/CQA.zip)下载已经配置好 cqhttp 的 酷Q，或者自己按照以下步骤配置
- 下载：[酷Q](https://cqp.cc/t/23253)
- 下载：[CQHTTP](https://github.com/richardchien/coolq-http-api/releases)
- 把cqhttp放在`酷Q Air\app`
- 配置文件：`酷Q Air\data\app\io.github.richardchien.coolqhttpapi\config.ini`
    ```ini
    [general]
    use_http=false
    use_ws_reverse=true
    ws_reverse_url=ws://127.0.0.1:8081/ws/cq/
    ws_reverse_use_universal_client=true
    enable_heartbeat=true
    heartbeat_interval=60000
    ```