package com.sathish.am.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sathish.am.dao.AssetDAO;
import com.sathish.am.pojo.AssetPojo;

@Controller
public class DelController {
	@Autowired
	private AssetDAO dao;
	@RequestMapping("deleteRec")
	public ModelAndView doPost(AssetPojo pojo,HttpServletRequest req) {
		/*String verified=(String)req.getSession().getAttribute("verified");
		if(verified==null||!verified.trim().equals("true"))
		{ 
			return new ModelAndView("Login","pojo",new UserPojo());
		}
		else{*/
		dao.delRecord(pojo);
		List<AssetPojo> list=dao.getAllRec();
		return new ModelAndView("Listall","list",list);
		
		}
}
