package com.hdu.bagunigame;
//오답풍선클래스
public class Balloon {

    int x,y;
    int speed;

    Balloon(int x,int y, int speed){
        this.x=x;
        this.y=y;
        this.speed=speed;


    }
    public void move(){//풍선의 속도값에 따라서 화면 아래쪽으로 움직이도록 speed가 빠를수록 더빨리떨어짐
        y+=speed;

    }

}
