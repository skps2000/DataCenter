package com.data.center.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	private static final Logger log = LogManager.getLogger(MainController.class);

	@ResponseBody
	@RequestMapping(value="/centerMain")
	public void centerMain(@RequestParam(value="i",defaultValue="0") int i, Model model, HttpServletRequest req, HttpServletResponse res) throws IOException{
		log.info("start main");
		
		PrintWriter out = res.getWriter();
		out.print(i);
		
	}
	
	
	
	
	
	
}
