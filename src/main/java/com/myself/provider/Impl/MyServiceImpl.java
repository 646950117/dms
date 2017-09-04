package com.myself.provider.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.alibaba.dubbo.config.annotation.Service;
import com.myself.provider.MyService;

@Service(protocol="rest")
@Path("/restService")
@Consumes("application/json")
@Produces("application/json")
public class MyServiceImpl implements MyService {
	
	@GET
	@Path("sayHello")
	public String sayHello(String name) {
		return "hello" + name + "!";
	}

	public List<String> getUsers() {
		List<String> list = new ArrayList<String>();
		list.add("郑伯宇");
		list.add("胡芳");
		return list;
	}

}
