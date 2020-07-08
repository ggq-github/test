package com.ggq.mail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class TestMailApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");

        message.setTo("1254267091@qq.com");
        message.setFrom("18554218043@163.com");

        mailSender.send(message);
    }

    @Test
    public void test02() throws  Exception{
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //邮件设置
        helper.setSubject("通知-今晚有活动");
        helper.setText("<b style='color:red'>今天 7:30 开始</b>   小姐姐晚上约嘛",true);

        helper.setTo("1254267091@qq.com");
        helper.setFrom("18554218043@163.com");

        //上传文件
        helper.addAttachment("1.jpg",new File("D:\\Java tools\\IDEA\\images\\1.jpg"));
        helper.addAttachment("2.jpg",new File("D:\\Java tools\\IDEA\\images\\2.jpg"));

        mailSender.send(mimeMessage);

    }

}
