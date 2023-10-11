package com.baseballgame;

public class BaseBallLifeCycle {
    private static BaseBallLifeCycle instance = new BaseBallLifeCycle();
    private BaseBallGameUI baseBallGameUI;
    private BaseBallLogic baseBallLogic;
    private BaseBallGameEvent baseBallGameEvent;

    private BaseBallLifeCycle() {
        // private 생성자
    }

    public static BaseBallLifeCycle getInstance() {
        return instance;
    }

    public void initialize() {
        baseBallGameUI = new BaseBallGameUI();
        baseBallLogic = new BaseBallLogic(baseBallGameUI);
        baseBallGameEvent = new BaseBallGameEvent(baseBallGameUI,baseBallGameUI.gameLogic);

        baseBallGameUI.setGameEvent(baseBallGameEvent);
        baseBallGameUI.gameEvent = baseBallGameEvent;
    }

    public BaseBallGameUI getBaseBallGameUI() {
        return baseBallGameUI;
    }

    public BaseBallGameEvent getBaseBallGameEvent() {
        return baseBallGameEvent;
    }

    public BaseBallLogic getBaseBallLogic() {
        return baseBallLogic;
    }

    public void startGame() {
        baseBallGameUI.initDisplay();
    }
}