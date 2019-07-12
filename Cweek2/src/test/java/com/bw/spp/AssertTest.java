package com.bw.spp;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.bw.spp.AssertUtil;
import com.bw.spp.CRuntimeExcption;

public class AssertTest {

	@Test
	public void fun1Test(){
		try {
			AssertUtil.isTrue(true, "这不是一个true");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun1Test2(){
		try {
			AssertUtil.isFalse(true, "这不是一个false");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2Test(){
		try {
			AssertUtil.isNotNull("asdasd", "这是一个字符串");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2Test2(){
		try {
			AssertUtil.isNull("", "这不是一个字符串");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			AssertUtil.collectionNotNull(arrayList,"这不是一个集合或集合为空");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test2(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(55);
			AssertUtil.collectionNotNull(arrayList,"这是一个集合或集合为空");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun4Test(){
		try {
			HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
			AssertUtil.mapNotNull(hashMap,"这不是一个map集合或map集合为空");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun4Test2(){
		try {
			HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
			hashMap.put(44,"1703C");
			AssertUtil.mapNotNull(hashMap,"这是一个map集合或map集合不为空");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun5Test(){
		try {
			AssertUtil.isLengthNull("","这不是一个字符串");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun5Test2(){
		try {
			AssertUtil.isLengthNull(" ","这不是一个字符串");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun5Test3(){
		try {
			AssertUtil.isLengthNull("asd dsa sad sda","这不是一个字符串");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun6Test(){
		try {
			AssertUtil.absInt(-5,"这不是一个整数");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun6Test2(){
		try {
			AssertUtil.absInt(5,"这是一个整数");
		} catch (CRuntimeExcption e) {
			e.printStackTrace();
		}
	}
	
	
}
