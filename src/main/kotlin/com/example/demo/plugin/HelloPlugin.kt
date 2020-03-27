package com.example.demo.plugin

import net.lz1998.cq.event.message.CQPrivateMessageEvent
import net.lz1998.cq.robot.CQPlugin
import net.lz1998.cq.robot.CoolQ
import org.springframework.stereotype.Component

// 必须有 @Component，必须继承 CQPlugin
@Component
class HelloPlugin : CQPlugin() {
    // 按 Ctrl+O 选择需要处理的消息类型
    // 比如
    // onPrivateMessage是私聊
    // onGroupMessage是群聊
    // onGroupIncreaseNotice是群人数增加
    // 其他参考 https://cqhttp.cc/docs/
    override fun onPrivateMessage(cq: CoolQ, event: CQPrivateMessageEvent): Int {
        val userId = event.userId
        println("不管收到什么私聊消息，都回复 Hello World!")
        cq.sendPrivateMsg(userId, "Hello World!", false);

        if (event.message == "hello") {
            println("消息内容是hello，拦截不继续处理")
            return MESSAGE_BLOCK
        } else {
            println("消息内容不是hello，如果后面有其他功能继续处理")
            return MESSAGE_IGNORE
        }
    }
}