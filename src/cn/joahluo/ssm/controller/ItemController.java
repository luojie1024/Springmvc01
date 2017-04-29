package cn.joahluo.ssm.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.joahluo.ssm.po.Items;

/**
 * @ClassName: ItemController1
 * @Description: 实现controller接口的处理器
 * @author Jacky 550997728@qq.com
 * @date 2017年4月28日 下午5:11:14
 * 
 */
// 标示它是一个控制器
@Controller
public class ItemController {
	
	// 查询商品列表，将queryItems方法和url进行映射，一个方法对应一个url
	@RequestMapping("/queryItems.action")
	public ModelAndView queryItems()throws Exception{
		// 调用service查找数据库，查询商品列表，
		List<Items> itemsList = new ArrayList<Items>();

		Items items_1 = new Items();
		items_1.setName("笔记本");
		items_1.setPrice(3000f);
		items_1.setDetail("雷神911");

		Items items_2 = new Items();
		items_2.setName("小米");
		items_2.setPrice(2000f);
		items_2.setDetail("高通810");

		itemsList.add(items_1);
		itemsList.add(items_2);

		//返回ModelAndView
		ModelAndView modelAndView =  new ModelAndView();
		//相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);

		// 指定视图
		// http://localhost:8080/springmvc01/queryItems.action
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

		return modelAndView;

	}

}
