package Game;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//放所有选择的List
public class ChoiceList {
    public List choose;
    public ChoiceList(){
       this.choose = new ArrayList();
    }

    //添加选项
    public void add1() {
        Choice c0 = new Choice("1", "找你吃饭");
        choose.add(c0);
        Choice c1 = new Choice("2", "被上级派来给你打掩护");
        choose.add(c1);
        Choice c2 = new Choice("3", "让你还钱");
        choose.add(c2);
    }
    //遍历并输出
        public void s1 () {
            int size = choose.size();
            for (int i = 0; i < size; i++) {
                Choice e =(Choice) choose.get(i);
                System.out.println(e.id+"、"+e.in);
            }
    }

  //更改三个选项的内容，并再次遍历输出
    public void set(){
        choose.set(0,new Choice("1","爱情故事"));
        choose.set(1,new Choice("2","高科技产品"));
        choose.set(2,new Choice("3","娱乐新闻"));

    }
    //使用迭代器遍历输出
    public void i(){
        Iterator it = choose.iterator();
        while(it.hasNext()){
            Choice e = (Choice)it.next();
            System.out.println(e.id+"、"+e.in);
        }
    }
}
