package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.util.StringUtils;

import com.ws.util.RedisUtil;

/**
 * @author lujun
 * @date 2018年7月6日
 */
public class Test {
	//测试
    public static  void main(String[] args) {
    	
        //构造一个list
        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();  
        HashMap<String, String> map = new HashMap<String, String>();  
        map.put("number", "王小二");  
        map.put("name", "王二");  
        list.add(map);  
        HashMap<String, String> map2 = new HashMap<String, String>();  
        map2.put("number", "张三");  
        map2.put("name", "张小三");  
        list.add(map2);
        
        //将对象序列化为字符串
        String serStr = RedisUtil.objectSerialiable(list);
        //System.out.println(serStr);
        
        //将序列化之后的字符串保存在redis中
        RedisUtil.getJedis().set("list", serStr);
        
        
        //从redis中取中字符串
        String deSerStr = RedisUtil.getJedis().get("list");
        if(!StringUtils.isEmpty(deSerStr)){
            //将取出的字符串反序列化为对象
            List<HashMap<String, String>> deList = (List<HashMap<String, String>>) RedisUtil.objectDeserialization(deSerStr);
            if(deList!=null && deList.size()>0){
            	System.out.println(deList);
                /*for(Map m : deList){
                	//System.out.println(map);
                    System.out.println(m.get("number")+"   "+m.get("name"));
                }*/
            }
        }
    	
    }
}
