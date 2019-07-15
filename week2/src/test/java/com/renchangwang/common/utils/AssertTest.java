package com.renchangwang.common.utils;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class AssertTest {
	
	//断言为真，如果为假则刨除自定义异常，异常消息为第二个参数默认消息
	@Test
	public void isTrue(){
		try {
			AssertUtil.isTrue(false,"断言为真");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	//方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void isFalse(){
		try {
			AssertUtil.isFalse(true,"断言为假");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	//方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void notNull(){
		try {
			AssertUtil.notNull("asd","断言对象不为空");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	//方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void isNull(){
		try {
			AssertUtil.isNull("","断言必须为空");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void notEmpty(){
		try {
			List list = (List) new AssertTest();
			System.out.println(list.size());
			AssertUtil.notEmpty(list,"断言集合不为空，对象不能空，以及必须包含1个元素");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void notEmpty2(){
		try {
			HashMap map = new HashMap();
			map.put(1, "");
			AssertUtil.notEmpty2(map,"断言Map集合不为空，对象不能空，以及必须包含1个元素");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void hasText(){
		try {
			AssertUtil.hasText("asd dsa","断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void greaterThanZero(){
		try {
			AssertUtil.greaterThanZero(-2,"断言值必须大于0，如果小于或等于0，则抛出自定义异常");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
