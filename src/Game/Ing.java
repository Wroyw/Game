package Game;

import java.util.Scanner;

public class Ing {
    public static void main(String[] args) {
        Game game = new Game();
        game.state0();
        game.setName("Chioce");
        System.out.println("这个游戏叫做"+game.getName());
        game.state1();
        Scanner input = new Scanner(System.in);
        String id = input.next();

        Player<String> player = new Player();
        ending end = new ending();
        ChoiceList cl = new ChoiceList();
        player.setName(id);
        System.out.println("Hello，"+player.getName());
        System.out.println("Welcom!");
        game.state2();
        String choice1= input.next();
            switch (choice1) {

                case "拒绝":
                    end.e1();
                    break;

                case "接受":
                    game.state3();
                    cl.add1();
                    cl.s1();
                    int p = input.nextInt();

                    //R来干嘛
                    switch(p){
                        case 1:       //请吃饭
                            game.state4();
                            String q = input.next();
                           //去不去陪女神R
                            switch(q){
                                case "去":
                                    game.states();
                                    end.ec();
                                    return;
                                case "不去":
                                    game.state5();
                            }


                        case 2:             //作掩护
                            game.state6();
                            cl.set();
                            cl.i();
                            int t = input.nextInt();
                            //想和X聊点啥
                            switch(t){
                                case 2:
                                    //高科技
                                    game.state9();

                                    //高薪去不去

                                    String q1 = input.next();
                                    switch (q1){
                                        case "去":
                                            game.states();
                                            end.ec();
                                            return;
                                        case "不去":
                                    }
                                //爱情故事
                                    case 1:
                                    game.state7();
                                //去哪里
                                    int w = input.nextInt();
                                    switch (w){
                                        case 1:
                                            game.statec();
                                            end.es();
                                            return;
                                        case 2:
                                            game.state8();
                                            end.ea();
                                            return;

                        }
                               //娱乐新闻
                                case 3:
                                    game.state10();
                                    end.eb();
                                    return;

                    }
                    //找你还钱
                        case 3:
                            game.state11();
                            end.ec();
                    }
            }




















































































    }
}
