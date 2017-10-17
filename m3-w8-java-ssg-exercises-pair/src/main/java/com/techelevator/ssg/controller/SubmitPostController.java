package com.techelevator.ssg.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.JOptCommandLinePropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class SubmitPostController {
	@Autowired
	ForumDao dao;
	
	@RequestMapping(path="/submitPostInput", method=RequestMethod.GET)
	public String showSubmitPostInputForm() {
		
		return "submitPostInput";
	}
	@RequestMapping(path="/submitPostInput", method=RequestMethod.POST)
	public String processNotificationSignupSubmission(@ModelAttribute ForumPost userPost) throws FileNotFoundException, IOException {
		dao.save(userPost);
		return "redirect:/submitPostResults";
	}
	
	@RequestMapping(path="/submitPostResults", method=RequestMethod.GET)
	public String showNotificationSignupResult(ModelMap modelHolder) {
		List<ForumPost> allPosts=new ArrayList<>();
		allPosts=dao.getAllPosts();
		modelHolder.put("allPosts", allPosts);
		return "submitPostResults";
	}
	
	
}


