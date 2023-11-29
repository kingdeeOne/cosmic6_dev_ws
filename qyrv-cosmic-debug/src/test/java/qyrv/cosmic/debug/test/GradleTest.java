package qyrv.cosmic.debug.test;

import java.util.Map;

import org.junit.jupiter.api.Test;

import cn.hutool.core.lang.Console;

/**
 * 
 * @author liebin.zheng
 * @date 2023/08/23
 */
public class GradleTest {
	
	@Test
	public void testSystemEvn() {
		
		Map<String, String> sysEnv = System.getenv();
		
		Console.log(sysEnv);
	}
	
	@Test
	public void testSystemProperties() {
		
		Map<Object, Object> properties = System.getProperties();
		
		Console.log(properties);
	}

}
