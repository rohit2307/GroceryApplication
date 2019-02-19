package com.grocery.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.app.model.ShoppingList;

@RestController
public class ShoppingListController {
	
	private List<ShoppingList> shoppingList = Arrays.asList(
			new ShoppingList("dmart"),
			new ShoppingList("more")
			);
	
	
	@RequestMapping(value="/addShoppingList",method= RequestMethod.POST)
	public ShoppingList addShoppingList(@RequestBody ShoppingList shoppingList) {
		  
		
		return shoppingList;
	}
	
	@RequestMapping("/getShoppingList/{title}")
	public ShoppingList getShoppingList(@PathVariable String title) {
		return new ShoppingList(title);
	}
	
	@RequestMapping("/getShoppingLists")
	public ShoppingList getShoppingLists() {
		ShoppingList shoppingList = new ShoppingList();
		shoppingList.setTitle("dmart");
		return shoppingList;
	}
	
	@RequestMapping("getShoppingListsArray")
	public List<ShoppingList> getShopingListsArray() {
		/*List<ShoppingList> list=new ArrayList<ShoppingList>();
		ShoppingList shoppingList = new ShoppingList();
		shoppingList.setTitle("dmart");
		ShoppingList shoppingList1 = new ShoppingList();
		shoppingList1.setTitle("More");
		list.add(shoppingList);
		list.add(shoppingList1);*/
		return shoppingList;
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
}
