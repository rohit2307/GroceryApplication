package com.grocery.app.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingListControllerTest {
	
	@InjectMocks
	ShoppingListController shoppingListController;

	@Test
	public void testHello() {
		assertEquals("Hello World", shoppingListController.hello());;
	}
}
