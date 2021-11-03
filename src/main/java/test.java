/**
 * Project name(项目名称)：作业_可变参数
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/3
 * Time(创建时间)： 10:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.print("张强", "李成", "王勇");    // 传入3个值
        student.print("马丽", "陈玲");
    }
}
