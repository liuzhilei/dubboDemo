package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhilei on 2017/7/25.
 */
public class DemoService1Impl implements DemoService {
    @Override
    public List<String> getUserList(Long id) {
        List<String> list = new ArrayList<String>();
        list.add("刘志磊，这是分组B");
        list.add("金晶晶，这是分组B");
        return list;
    }
}
