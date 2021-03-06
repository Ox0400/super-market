package com.soft1841.sm.service;
import com.soft1841.sm.entity.Vip;
import com.soft1841.sm.utils.ServiceFactory;
import org.junit.Test;
import java.sql.SQLException;
import java.util.List;


public class VipServiceTest {
private VipService vipService = ServiceFactory.getVipServiceInstance();

    @Test
    public void getAllVips()throws SQLException {
        List<Vip> vipList = vipService.getAllVips();
        vipList.forEach(entity -> System.out.println(entity));
    }

    @Test
    public void deleteVip() {
        vipService.deleteVip(1);
    }

    @Test
    public void addVip() {
        Vip vip = new Vip();
        vip.setName("测试会员名字");
        vip.setYear("2");
        vip.setPicture("http://www.gx8899.com/uploads/allimg/160804/3-160P4111639.jpg");
        vip.setJifen("会员积分");
        vip.setMobile("会员手机号码");
        vip.setAddress(" 会员的地址");
        System.out.println(vipService.addVip(vip));
    }

    @Test
    public void getVip() {
        System.out.println(vipService.getVip(1));
    }
}
