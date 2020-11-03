package cn.qianfeng.demo01;

public class SQlServer {
    public SQlServer(String sqlName){
        System.out.println(sqlName+"执行SQL驱动");
    }
    public void executeSQL(String sql){
        System.out.println(sql);
    }
}
