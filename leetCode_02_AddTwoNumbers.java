package com.wyw.leetCode01_10;

import java.util.List;

public class LeetCode_02_AddTwoNumbers {
	public static void main(String[] args){

		int num1 = 5;
		int num2 = 5;
		ListNode head1 = parseNUmToLinkList(num1);
		ListNode head2 = parseNUmToLinkList(num2);
		
		ListNode result = addTwoNumbers(head1, head2);
		while(result != null){
			System.out.println(result.val);
			result = result.next;
		}
	}
	
	 static ListNode addTwoNumbers(ListNode l1, ListNode l2){

		 ListNode head = null;
		 ListNode tmp = null;
		 int flag = 0;
		 while(l1 != null || l2 != null){
			 if(l1 != null && l2 != null){
				 int val = l1.val + l2.val + flag;
				 flag = 0;
				 if(val >= 10){
					 flag = 1;
					 val = val % 10;
				 }
				 ListNode node = new ListNode(val);
				 head = insert(head, node);
				 l1 = l1.next;
				 l2 = l2.next;
			 }
			 else if(l1 == null){
				 int val = l2.val + flag;
				 flag = 0;
				 if(val >= 10){
					 flag = 1;
					 val = val % 10;
				 }
				 ListNode node = new ListNode(val);
				 head = insert(head, node);
				 l2 = l2.next;
			 }
			 else if(l2 == null){
				 int val = l1.val + flag;
				 flag = 0;
				 if(val >= 10){
					 flag = 1;
					 val = val % 10;
				 }
				 ListNode node = new ListNode(val);
				 head = insert(head, node);
				 l1 = l1.next;
			 }
		 }
		 if(flag == 1){
			 int val = flag;
			 flag = 0;
			 ListNode node = new ListNode(val);
			 head = insert(head, node);
		 }
		 return head;
	 }
		 
	public static ListNode insert(ListNode head, ListNode node){
		ListNode tmp = head;
		if(head == null){
			head = node;
			tmp = head;
		}
		else{
			while(tmp.next != null){
				tmp = tmp.next;
			}
			tmp.next = node;
		}
		return head;
	}
	 
	 public static ListNode parseNUmToLinkList(int num){

		 if(num <= 0){
			 return null;
		 }
		 ListNode head = null;
		 ListNode tmp = null;
		 
		 while(num != 0){
			 ListNode node = new ListNode(num % 10);
			 if(head == null){
				 head = node;
				 head.next = null;
				 tmp = head;
			 }
			 else{
				 tmp.next = node;
				 tmp = tmp.next;
			 }
			 num = num / 10;
		 }
		 return head;
	 }
	 
	 public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
			 val = x;
			 next = null;
		 }
	}
}
