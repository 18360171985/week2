package com.bw.spp;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	
	
	public static void isTrue(boolean exp,String message){
		if(!exp){
			throw new CRuntimeExcption(message);
		}
	}
	
	public static void isFalse(boolean exp,String message){
		if(exp){
			throw new CRuntimeExcption(message);
		}
	}
	
	public static void isNotNull(String exp,String message){
		if(exp == null || exp.length()==0){
			throw new CRuntimeExcption(message);
		}
	}
	
	public static void isNull(Object exp,String message){
		if(exp != null){
			throw new CRuntimeExcption(message);
		}
	}
	
	
	public static void collectionNotNull(Collection<?> col,String message){
		if(col == null || col.size()==0){
			throw new CRuntimeExcption(message);
		}
	}
	
	public static void mapNotNull(Map<?,?> map,String message){
		if(map == null || map.size()==0){
			throw new CRuntimeExcption(message);
		}
	}
	
	public static void isLengthNull(String exp,String message){
		if(!(exp.trim().length()>0)){
			throw new CRuntimeExcption(message);
		}
	}
	
	
	public static void absInt(int exp,String message){
		if(exp <= 0){
			throw new CRuntimeExcption(message);
		}
	}
	
	
	
}
