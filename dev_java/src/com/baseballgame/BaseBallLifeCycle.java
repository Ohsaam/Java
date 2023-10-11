package com.baseballgame;

public class BaseBallLifeCycle {
    private static BaseBallLifeCycle instance = new BaseBallLifeCycle();
    private BaseBallGameUI baseBallGameUI;

    private BaseBallLifeCycle() {
        // private 생성자
    }

    public static BaseBallLifeCycle getInstance() {
        return instance;
    }

    public void setBaseBallGameUI(BaseBallGameUI baseBallGameUI) {
        this.baseBallGameUI = baseBallGameUI;
    }

    public BaseBallGameUI getBaseBallGameUI() {
        return baseBallGameUI;
    }
}
    
    /*
     * 1. 싱글톤 코드로 구현하려고 한다. 
     * - BaseBallUI -> BaseBallLogic
     * 						  -> BaseBallGameEvent 로 나뉜다.
     * 
     * 나는 UI가 생성하는 객체를 싱글톤으로 관리하려고 한다.
     * 나의 궁금점-> 그렇게 되면 this로 
     * 
     * 
     * 2. 뭐가 문제인거지?
     * - 
     */
    