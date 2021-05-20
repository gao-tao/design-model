package com.design.pattern.proxy.use;

import org.springframework.cglib.core.DebuggingClassWriter;

public class Test {
    public static void main(String[] args) throws Exception {

//        Medium medium = new Medium();
//        IPerson instance = medium.getInstance(new Zhangsan());
//        instance.findWork();

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "d://cglib_proxy_class");

        CglibMedium cglibMedium = new CglibMedium();
        Lisi lisi = (Lisi) cglibMedium.getInstance(Lisi.class);
        lisi.findWork();





//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
//        FileOutputStream os = new FileOutputStream("D://Program Files/$Proxy0.class");
//        os.write(bytes);
//        os.close();

    }
}
