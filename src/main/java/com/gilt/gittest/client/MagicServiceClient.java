package com.gilt.gittest.client;

import com.gilt.gittest.MagicService;

public class MagicServiceClient implements MagicService {

	private final MagicService service;
	public MagicServiceClient(MagicService service) {
		this.service = service;
	}
	
	@Override
	public String doMagic() {
		return service.doMagic();
	}

}
