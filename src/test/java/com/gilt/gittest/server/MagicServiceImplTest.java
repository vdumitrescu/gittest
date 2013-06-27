package com.gilt.gittest.server;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gilt.gittest.MagicService;

public class MagicServiceImplTest {

	private final MagicService service = new MagicServiceImpl();
	
	@Test
	public void test() {
		assertEquals("Magic", service.doMagic());
	}

}
