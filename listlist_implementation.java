package practice;

public class LL {
	node head;
	private int size=0;
	class node{
		String data;
		node next;
		node(String data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void addatfirst(String data) {
		node node1=new node(data);
		if(head==null) {
			head=node1;
			return;
		}else {
			node1.next=head;
			head=node1;
			
			
		}
		size++;
	}
	public void addatlast(String data) {
		node node2=new node(data);
		node current=head;
		if(head==null) {
			head=node2;
		}
		while(current.next!=null) {
			current=current.next;
		}
		current.next=node2;
		size++;
	}
	public void addatmiddle(int pos,String data) {
		node addnode=new node(data);
		node current=head;
		node nextcurrent=head.next;
		if(pos<=1) {
			System.out.println("Enter the correct middle numer position");
			
		}
		for(int j=1;j<pos-1;j++) {
			current=current.next;
			nextcurrent=nextcurrent.next;
		}
		current.next=addnode;
		addnode.next=nextcurrent;
		size++;
	}
	public void print() {
		node current1=head;
		while(current1!=null) {
			System.out.print(current1.data+" ");
			current1=current1.next;
		}
	}
	public void deleteatfirst() {
		if(head==null) {
			System.out.println("this linkedlist is empty");
			
		}else {
			node current=head;
			head=current.next;
		}
		size--;
	}
	public void deleteatlast() {
		node currentlast=head.next;
		node currentlastbefore=head;
		while(currentlast.next!=null) {
			currentlast=currentlast.next;
			currentlastbefore=currentlastbefore.next;
		}
		currentlastbefore.next=null;
		size--;
	}
	public void deleteatmiddle(int pos) {
		node current=head;
		node currentnext=head.next;
		if(pos==1) {
			head=head.next;
		}
		for(int i=1;i<pos-1;i++) {
			current=current.next;
			currentnext=currentnext.next;
		}
		current.next=currentnext.next;
		size--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list=new LL();
		list.addatfirst("this");
		list.addatfirst("is");;
		list.addatfirst("a");
		list.addatfirst("linkedlist");
		list.addatlast("hi");
		list.print();
		list.deleteatfirst();
		list.print();
		list.deleteatlast();
		list.print();
		System.out.println();
		list.addatmiddle(3,"hlo");
		list.print();
		list.addatmiddle(2, "murali");
		System.out.println();
		list.print();
		System.out.println();
		list.deleteatmiddle(1);
		list.print();

	}

}
