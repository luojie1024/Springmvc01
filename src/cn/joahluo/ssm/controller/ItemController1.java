/**   
* @Title: ItemController1.java 
* @Package cn.joahluo.ssm.controller 
* @Description: TODO
* @author Jacky 550997728@qq.com   
* @date 2017��4��28�� ����5:11:14 
* @version V1.0   
*/
package cn.joahluo.ssm.controller;


import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.portlet.mvc.Controller;

import cn.joahluo.ssm.po.Items;

/** 
 * @ClassName: ItemController1 
 * @Description: ʵ��controller�ӿڵĴ�����
 * @author Jacky 550997728@qq.com 
 * @date 2017��4��28�� ����5:11:14 
 *  
 */
public class ItemController1 implements org.springframework.web.servlet.mvc.Controller {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public org.springframework.web.servlet.ModelAndView handleRequest(
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// ����service�������ݿ⣬��ѯ��Ʒ�б�
		List<Items> itemsList=new ArrayList<Items>();

		Items items_1=new Items();
		items_1.setName("�ʼǱ�");
		items_1.setPrice(3000f);
		items_1.setDetail("����911");
		
		Items items_2=new Items();
		items_2.setName("С��");
		items_2.setPrice(2000f);
		items_2.setDetail("��ͨ810");

		itemsList.add(items_1);
		itemsList.add(items_2);
		
		
		//����ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		//�൱��reqiest��setAttribut,��jspҳ����ͨ��itemsListȡ����
		modelAndView.addObject("itemsList",itemsList);
		
		//ָ����ͼ
		//  http://localhost:8080/springmvc01/queryItems.action
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		
		return modelAndView;
	}



}
