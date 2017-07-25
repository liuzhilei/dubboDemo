package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhilei on 2017/7/25.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getUserList(Long id) {
        List<String> list = new ArrayList<String>();
        list.add("刘志磊");
        list.add("金晶晶");
        return list;
    }
}
