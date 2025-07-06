package com.example.mcp_client.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcp_client.agents.AIAgent;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AiWebAPIController {
    private AIAgent agent;

    public AiWebAPIController(AIAgent agent) {
        this.agent = agent;
    }
    @GetMapping("/chat")
    public String askAgent(String query) {
        return agent.askLLM(query);
    }
}
