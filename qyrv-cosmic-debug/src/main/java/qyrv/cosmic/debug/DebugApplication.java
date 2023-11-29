/**
 * This is a kingdee cosmic template project that is automatically generated by the Kingdee cosmic development assistant plugin. 
 * If there are any issues during the use process, you can provide feedback to the kingdee developer community website.
 * Website: https://developer.kingdee.com/developer?productLineId=29
 * Author: liebin.zheng
 * Generate Date: 2023-11-27 16:04:06
 */
package qyrv.cosmic.debug;
/**
 * 启动本地应用程序(微服务节点)
 */
public class DebugApplication {
    public static void main(String[] args) {
//    	Thread.currentThread().setContextClassLoader(new KDSecurityClassLoader(Thread.currentThread().getContextClassLoader()));
        Launcher cosmic = new Launcher(false);
        cosmic.setClusterNumber("cosmic");
        cosmic.setTenantNumber("ierp");
        cosmic.setConfigUrl("139.159.194.35:2181?user=zookeeper&password=Cosmic@6255");
        //cosmic.setConfigUrl("139.159.194.35:2181");
//        cosmic.setMcServerUrl("http://127.0.0.1:8090");
        cosmic.setMcServerUrl("http://139.159.194.35:8090/mc/");
        cosmic.setWebResPath("D:/cosmic6/home/static-file-service");
//        cosmic.setFsServerUrl("127.0.0.1", 8100);
//        cosmic.setImageServerUrl("127.0.0.1", 8100);
        //自定义本地苍穹调试服务的端口
        cosmic.setCosmicWepPort(8881);
        cosmic.start();
    }
}