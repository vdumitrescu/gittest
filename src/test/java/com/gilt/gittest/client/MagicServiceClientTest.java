package com.gilt.gittest.client;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gilt.gittest.MagicService;

public class MagicServiceClientTest {

	private static final String MAGIC = "Magic!";
	
	private MagicService service;
	
	@Before
	public void setUp() throws Exception {
		service = EasyMock.createMock(MagicService.class);
		EasyMock.expect(service.doMagic()).andReturn(MAGIC);
		EasyMock.replay(service);
	}

	@After
	public void tearDown() throws Exception {
		EasyMock.verify(service);
	}
	
	@Test
	public void testClient() {
		MagicServiceClient client = new MagicServiceClient(service);
		assertEquals(MAGIC, client.doMagic());
	}

}
