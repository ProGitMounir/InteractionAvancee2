package com.example.mcp_server;

import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.mcp_server.tools.StockTools;

@SpringBootApplication
public class McpServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpServerApplication.class, args);
	}

	@Bean
	public MethodToolCallbackProvider getMethodToolCallbackProvider() {
		return MethodToolCallbackProvider.builder()
				.toolObjects(new StockTools())
				.build();
	}

}
