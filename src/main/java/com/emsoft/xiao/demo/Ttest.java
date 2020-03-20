package com.emsoft.xiao.demo;

import com.alibaba.fastjson.JSON;
import net.sf.cglib.beans.*;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.BeanClassLoaderAware;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: xhf
 * @Date: 2020-03-19 15:38
 * @Description:
 */
public class Ttest {
    public static void main(String[] args) throws Exception {
        User user=new User();
        HashMap addMap=new HashMap<>();
        HashMap addValMap=new HashMap();
        addMap.put("name",Class.forName("java.lang.String"));
        addMap.put("sex",Class.forName("java.lang.String"));
        addValMap.put("name","张高超");
        addValMap.put("sex","woman");
        Object obj2= new ClassUtil().dynamicClass(user,addMap,addValMap);
        System.out.println(JSON.toJSONString(obj2));
        System.out.println("make money");


    }
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass)
        throws Exception {
        if (map == null) {
        return null;

        }
        Object obj = beanClass.newInstance();
        org.apache.commons.beanutils.BeanUtils.populate(obj, map);
        return obj;
    }
}
