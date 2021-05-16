package com.design.model.abstractFactory;

public class ChineseCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new ChineseNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new ChineseVideo();
    }
}
