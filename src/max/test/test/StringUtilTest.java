package max.test.test;

import org.testng.Assert;
import org.testng.annotations.Test;

//测试类：junit单元测试框架，对业务中的业务方法进行测试
public class StringUtilTest {
    //测试方法：必须是公开的public，无参，无返回值
    //必须添加@Test注解
    @Test
    public void testPrintNumber(){
        StringUtil.printNumber("张三");
        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex(){
        int i1 = StringUtil.getMaxIndex("张三");
        int i2 = StringUtil.getMaxIndex("");
        int i3 = StringUtil.getMaxIndex(null);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        //断言：判断结果是否符合预期
        Assert.assertEquals(i1,1);
        Assert.assertEquals(i2,-1);
        Assert.assertEquals(i3,-1);
        ;
    }
}
