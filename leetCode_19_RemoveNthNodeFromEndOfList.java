package com.wyw.leetCode11_20;

public class LeetCode_19_RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		int[] num = {1,2};
		int n = 1;
		ListNode head = parseArrayToLinkList(num);
		ListNode result = removeNthFromEnd(head, n);
		if(result != null){
			System.out.println(result.val);
		}
		else{
			System.out.println("null point.");
		}
	}

	public static ListNode parseArrayToLinkList(int[] num){
		ListNode head = null;
		ListNode tmp = null;
		for(int i : num){
			ListNode node = new ListNode(i);
			if(head == null){
				head = node;
			}
			else{
				tmp.next = node;
			}
			tmp = node;
		}
		return head;
	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	int i = 0;
    	int length = 0;
    	ListNode node = head;
    	while(node != null){
    		length++;
    		node = node.next;
    	}
    	if(n > length){
    		return null;
    	}
    	if(n == length){
    		head = head.next;
    		return head;
    	}

    	node = head;
    	while(node != null){
    		if(i == length - n - 1){
    			break;
    		}
    		node = node.next;
    		i++;
    	}
    	ListNode tmp = node.next;
    	node.next = node.next.next;
    	tmp.next = null;
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
