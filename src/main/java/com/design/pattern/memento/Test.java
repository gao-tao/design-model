package com.design.pattern.memento;

import org.springframework.binding.message.StateManageableMessageContext;

public class Test {

    public static void main(String[] args) {

        String title = "spring mvc";
        String context = "Spring MVC属于SpringFrameWork的后续产品，已经融合在Spring Web Flow里面。Spring 框架提供了构建 Web 应用程序的全功能 MVC 模块。使用 Spring 可插入的 MVC 架构";
        String img = "watermark,image_d2F0ZXIvYmFpa2U4MA==,g_7,xp_5,yp_5/format,f_auto";

        Editor editor = new Editor(title, context, img);

        DraftsBox draftsBox = new DraftsBox();

        ArticleMemento articleMemento = editor.saveMemento();
        draftsBox.addMemento(articleMemento);

        System.out.println("标题：" + editor.getTitle() + "\n" +
                "内容：" + editor.getContent() + "\n" +
                "图片：" + editor.getImg() + "\n 暂存成功");

        System.out.println("完整的信息" + editor);


        System.out.println("========首次修改===============");
        editor.setTitle("spring boot");
        editor.setContent("Spring Boot是由Pivotal团队提供的全新框架，其设计目的是用来简化新Spring应用的初始搭建以及开发过程");
        System.out.println("完整的信息" + editor);
        System.out.println("========首次修改完成===============");


        articleMemento = editor.saveMemento();
        draftsBox.addMemento(articleMemento);

        System.out.println("==========保存到草稿箱===================");

        System.out.println("========第二次修改===============");
        editor.setTitle("spring boot11");
        editor.setContent("Spring Boot是由Pivotal团队提供的全新框架，");
        System.out.println("完整的信息" + editor);
        System.out.println("========第二次修改完成===============");

//        ArticleMemento memento = draftsBox.getMemento();
//        System.out.println(memento);


        System.out.println("========第一次撤销===============");
        articleMemento = draftsBox.getMemento();
        editor.undoFormMemento(articleMemento);
        System.out.println("完整的信息" + editor);
        System.out.println("========第一次撤销完成===============");


        System.out.println("========第二次撤销===============");
        articleMemento = draftsBox.getMemento();
        editor.undoFormMemento(articleMemento);
        System.out.println("完整的信息" + editor);
        System.out.println("========第二次撤销完成===============");
    }


}
