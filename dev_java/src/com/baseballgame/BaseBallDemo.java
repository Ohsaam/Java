package com.baseballgame;

public class BaseBallDemo {
	public static void main(String[] args) {
        BaseBallLifeCycle lifeCycle = BaseBallLifeCycle.getInstance();
        lifeCycle.initialize();
        lifeCycle.startGame();
	}

}
