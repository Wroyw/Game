package Game;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//这个类是操作引导
public class Game {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void state0(){
        System.out.println("既然点开了这个无聊的界面，相信你现在也很无聊。");
        System.out.println("让咱们做一个模拟特工的小游戏吧！");
    }

    public  void state1(){
        System.out.println("接下来，你的每个选择都将去到不同的方向哦");
        System.out.println("很通俗易懂对不对？哈，那就开始吧。");
        System.out.println("首先，请输入你想要的名字哦");
    }

    public  void state2(){
        System.out.println("假定你是一名正在考核期的特工，现在你在情人节接到了Boss的一个寻找古董画的任务，并且需要你男扮女装去迷惑对方");
        System.out.println("请选择接受或者拒绝？");
    }

    public  void  state3(){
        System.out.println("就在你化妆的时候，你的女神R突然敲门了，请问她是来干什么的呢？");
    }

    public void state4(){
        System.out.println("选择去还是不去呢？");
    }
    public void state5(){
        System.out.println("R觉得你很有责任心，决定和你一起去掩护你");
    }
    public void state6(){
        System.out.println("发现目标X，你想和他谈点什么呢？");
    }
    public void state7(){
        System.out.println("友谊的小船进化成巨轮，x邀请你去参观他的房子，你最想去什么地方？");
        System.out.println("1、地下室；2、卧室");
    }

    public void  state8(){
        System.out.println("X发现你的身份，去地下室的R解救了你，完成任务");
    }
    public void  state9(){
        System.out.println("X非常欣赏你并决定高薪聘请你做技术人员的头头，请选择去或不去");
    }
    public void  state10(){
        System.out.println("不小心说到了X的idol，友谊小船翻，任务失败");
    }
    public void  state11(){
        System.out.println("因为了躲债跑掉了，任务失败");
    }

    public void states() {
        System.out.println("任务失败");
    }
    public  void statec(){
        System.out.println("任务成功");
    }






}
