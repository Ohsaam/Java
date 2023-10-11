package com.baseballgame;

public class BaseBallLifeCycle {
    private static BaseBallLifeCycle instance = new BaseBallLifeCycle();

    private BaseBallInterface baseball;

    private BaseBallLifeCycle() {
        // baseball 인스턴스 초기화
        baseball = new BaseBallGameLogic();
    }

    public static BaseBallLifeCycle getUniqueInstance() {
        return instance;
    }

    public BaseBallInterface getBaseball() {
        return baseball;
    }
