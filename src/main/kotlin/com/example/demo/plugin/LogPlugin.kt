package com.example.demo.plugin

import net.lz1998.cq.event.message.CQPrivateMessageEvent
import net.lz1998.cq.robot.CQPlugin
import net.lz1998.cq.robot.CoolQ
import org.springframework.stereotype.Component

@Component
class LogPlugin : CQPlugin() {
    override fun onPrivateMessage(cq: CoolQ, event: CQPrivateMessageEvent): Int {
        println("收到私聊消息：" + event.message)
        return MESSAGE_IGNORE
    }
}