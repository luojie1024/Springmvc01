package cn.joahluo.ssm.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.joahluo.ssm.po.Items;

/**
 * @ClassName: ItemController1
 * @Description: ʵ��controller�ӿڵĴ�����
 * @author Jacky 550997728@qq.com
 * @date 2017��4��28�� ����5:11:14
 * 
 */
// ��ʾ����һ��������
@Controller
public class ItemController {
	
	// ��ѯ��Ʒ�б���queryItems������url����ӳ�䣬һ��������Ӧһ��url
	@RequestMapping("/queryItems.action")
	public ModelAndView queryItems()throws Exception{
		// ����service�������ݿ⣬��ѯ��Ʒ�б�
		List<Items> itemsList = new ArrayList<Items>();

		Items items_1 = new Items();
		items_1.setName("�ʼǱ�");
		items_1.setPrice(3000f);
		items_1.setDetail("����911");

		Items items_2 = new Items();
		items_2.setName("С��");
		items_2.setPrice(2000f);
		items_2.setDetail("��ͨ810");

		itemsList.add(items_1);
		itemsList.add(items_2);

		//����ModelAndView
		ModelAndView modelAndView =  new ModelAndView();
		//�൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
		modelAndView.addObject("itemsList", itemsList);

		// ָ����ͼ
		// http://localhost:8080/springmvc01/queryItems.action
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

		return modelAndView;

	}

}
