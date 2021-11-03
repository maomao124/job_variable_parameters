/**
 * Project name(项目名称)：作业_可变参数
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/3
 * Time(创建时间)： 10:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */


/**
 * 定义输出考试学生的人数及姓名的方法，方法名为 print，传参的类型为String，无返回值。
 */
public class Student
{
    public void print(String... s)
    {
        System.out.println("本次参加考试的有" + s.length + "人，名单如下：");
        for (String s1 : s)
        {
            System.out.println(s1);
        }
    }
}
