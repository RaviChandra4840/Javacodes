//client , traceroutecmdo
/*import java.io.*;
import java.net.*;
public class example{
    public static void run(String command){
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s;
            while((s=in.readLine())!=null){
                System.out.println(s);
            }
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception{
        String s = "www.drranurekha.com";
        run("tracert "+s);
    }
}*/
/* 
import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Perfect Password!");
        } else {
            System.out.println("Not a Perfect Password.");
        }
    }

    private static boolean isValidPassword(String password) {
        // Check length
        if (password.length() != 9) {
            return false;
        }

        // Check for at least one small letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check for at least one capital letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check for at least one number
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Check for at least one special character (except space)
        if (!password.matches(".*[^a-zA-Z\\d\\s].*")) {
            return false;
        }

        return true;
    }
}*/
/* 
import java.util.Scanner;
public class example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int row=sc.nextInt(); 
		for(int i=row;i>0;i--)
		{
		 for(int j=1;j<=row-i;j++)
		  System.out.print(" ");
		 if(i==1 || i==row)
		 for(int j=1;j<=i*2-1;j++)
		  System.out.print("*");
		else
		 for(int j=1;j<=i*2-1;j++)
		if(j==1 || j==i*2-1)
		  System.out.print("*");
		else
		  System.out.print(" ");
		System.out.println();
     }
  }
}
import java.util.*;
public class example {

    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                if(i==0){
                    System.out.print("* ");
                }
                else if{

                }
            }
            System.out.println(" ");
        }
    }
}
import java.util.*;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println(d1+d2+((c1+c2)/100));
        System.out.println((c1+c2)%100);
    }
}
import java.util.*;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int val = sc.nextInt();
        while(i<5){
            int temp = val,rev = 0;
            while(temp!=0){
                int rem = temp%10;
                rev = rev*10+rem;
                temp = temp/10;
            }
            String str = Integer.toString(rev+val);
            int p=0,q=str.length()-1;
            boolean pal = true;
            while(p<q){
                if(str.charAt(p)!=str.charAt(q)){
                    pal=false;
                    break;
                }
                p++;
                q--;
            }
            if(pal){
                System.out.println(str);
                break;
            }else{
                val = val+rev;
            }
            if(i==5){
                System.out.println(-1);
            }
            i++;
        }
    }
}*/
/*
import java.util.*;
public class example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_inputs = sc.nextInt();
        double count=0;
        while(no_of_inputs!=0){
            int val = sc.nextInt();
            if(val%2!=0){
                count++;
            }
            else{
                count = count-0.5;
            }
            no_of_inputs--;
        }
        System.out.println(count);
    }
}*/
/* 
import java.util.*;
public class example {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int len = sc.nextInt();
        int small = Integer.MAX_VALUE;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
            if(small>arr[i]){
                small = arr[i];
            } 
        }
        System.out.println(small);
    }
}*/
/*import java.util.*;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int max = Integer.MIN_VALUE, s_max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
            int val = arr[i];
            if(val>max){
                s_max = max;
                max = val;
            }else if(val<max && val>s_max){
                s_max= val;
            }
        }
        if(s_max == Integer.MIN_VALUE){
            System.out.println("Can't find the second maximum value");
        }else{
            System.out.println("smax"+s_max);
            System.out.println("max"+max);
        }
        sc.close();
    }
}*/
/*
import java.util.*;
public class example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ran = sc.nextInt();
        int temp = Integer.MIN_VALUE;
        int arr[] = new int[ran];
        int sum=0,totalsum=0;;
        for(int i=0;i<ran;i++){
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
            totalsum = totalsum+i+1;
        }
        System.out.println(totalsum-sum);
    }
}*/
/*import java.util.*;
public class example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int num: pendulum(size, arr)){
            System.out.println(num);
        }
    }
    public static int[] pendulum(int n, int data[]){
        Arrays.sort(data);
        int pen[] = new int[n];
        int leftIndex = 0;
        int rightIndex = data.length - 1;

        for (int i = n-1; i >=0; i--) {
            if (i % 2 == 0) {
                pen[rightIndex--] = data[i];
            } else {
                pen[leftIndex++] = data[i];
            }
        }
        return pen;
    }
}*/
/* 
import java.util.*;

public class example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] name1 = str.toCharArray();
        char temp;
        for(int i=0;i<str.length()-1;i=i+2){
            temp = name1[i];
            name1[i] = name1[i+1];
            name1[i+1] = temp;
        }
        for(char ch: name1){
            System.out.print(ch);
        }
    }
}*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(isStrongNumber(number)){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }

    private static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int factorialSum = 0;

        while (number > 0) {
            int digit = number % 10;
            factorialSum += getFactorial(digit);
            number /= 10;
        }

        return originalNumber == factorialSum;
    }

    private static int getFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}*/
/* 
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int val = sc.nextInt();
    int temp = val;
    int rem=0;
    int result=0,fact=1;
    while(temp!=0){
      rem = temp%10;
      for(int i=1;i<=rem;i++){
        fact = fact*i;
      }
      result = result + fact;
      rem=0;
      temp = temp/10;
    }
    //System.out.println(result);
    if(val == result){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
*/
/* 
public class example {
    Node head = null;
    Node tail = head;
    static int size=0;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    void insert_last(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next=node;
            tail = tail.next;
        }
        size++;
    }
    void insert_first(int val){
        Node node = new Node(val);
        if(head==null){
            node.next=head;
            head=node;
            tail = head;
        }
        else {
            node.next=head;
            head=node;
        }
        size++;
    }
    void insert_mid(int val,int index){
        if(index==0){
            insert_first(val);
        }
        else if(index >=size){
            insert_last(val);
        }else{
            Node node = new Node(val);
            Node t_node = head;
            int i=1;
            while(i<index && t_node!=null){
                i++;
                t_node = t_node.next;
            }
            node.next = t_node.next;
            t_node.next = node;
            size++;
        }
    }
    void display(){
        Node t_node = head;
        while(t_node!=null){
            System.out.print(t_node.val+" -> ");
            t_node = t_node.next;
        }
        System.out.println(t_node);
    }
    int delete_first(){
        if(head == null){
            return -1;
        }
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }
    int delete_last(){
        if(size <= 1){
            return delete_first();
        }
        Node t_node = head;
        while(t_node.next!=null && t_node.next.next!=null){
            t_node=t_node.next;
        }
        int val=t_node.next.val;
        t_node.next=null;
        size--;
        return val;
    }
    int delete_mid(int index){
        if(index==0){
            return delete_first();
        }
        else if(index == size-1){
            return delete_last();
        }
        else{
            int i=1;
            Node t_Node = head;
            while(i<index && t_Node != null){
                i++;
                t_Node = t_Node.next;
            }
            if(t_Node == null) return -1;
            int del = t_Node.next.val;
            t_Node.next = t_Node.next.next;
            size--;
            return del;
        }
    }
    int delete_all(int val){
        int i=0;
        Node t_node=head;
        while(t_node!=null){
            if(t_node.val==val){
                delete_mid(i);
            }
            else{
                i++;
            }
            t_node = t_node.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        example ll = new example();
        ll.insert_first(40);
        ll.insert_first(30);
        ll.insert_first(20);
        ll.display();
        ll.insert_mid(50, 3);
        ll.display();
        ll.insert_last(60);
        ll.display();
        ll.delete_mid(2);
        ll.display();
        ll.delete_first();
        ll.display();
        ll.delete_last();
        ll.display();
    }
}
*/
/*
import java.util.*;
public class example{
    Node head = null;
    Node tail = head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    void insert_end(int val){
        Node node = new Node(val);
        if(head == null){
            node.next=head;
            head = node;
            tail = node;
        }else{
            tail.next=node;
            tail = tail.next;
        }
    }
    void check(int val){
        Node t_node = head;
        while(t_node!=null){
            if(t_node.val==val){
                return;
            }
            t_node=t_node.next;
        }
        insert_end(val);
    }
    void display(){
        Node t_node=head;
        while(t_node!=null){
            System.out.print(t_node.val+" ");
            t_node = t_node.next;
        }
    }
    int indexOf(int val){
        Node t_node = head;
        int i=0;
        while(t_node!=null){
            if(t_node.val==val){
                return i;
            }
            i++;
            t_node = t_node.next;
        }
        return -1;
    }
    int valueOf(int index){
        Node t_node = head;
        int i=0;
        while(t_node!=null){
            if(i==index){
                return t_node.val;
            }
            i++;
            t_node = t_node.next;
        }
        return -1;
    }

    void reverse(Node t_node){
        if(t_node == null){
            return;
        }
        reverse(t_node.next);
        System.out.print(t_node.val + " -> ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        example ll = new example();

        ll.insert_end(10);
        ll.insert_end(20);
        ll.insert_end(30);
        ll.insert_end(40);
        ll.insert_end(50);

        ll.reverse(ll.head);
        System.out.println("null");

    }
}*/
/* 
import java.util.*;
class example
{
    Node head =null;
    Node tail=null;
    static int size=0;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
            this.next=null;
        }
    }
    void insert_last(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next=node;
            tail = tail.next;
        }
        size++;
    }
    void display(){
        Node t_node=head;
        while(t_node!=null){
            System.out.print(t_node.val+" ");
            t_node = t_node.next;
        }
    }
    int delete(Node t_node){
        if(t_node==null){
            return -1;
        }
        int index = size/2;
        int i=1;
        while(i<index && t_node!=null ){
            i++;
            t_node = t_node.next;
        }
        int del = t_node.next.val;
        t_node.next = t_node.next.next;
        size--;
        return del;
    }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    example ll = new example();
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        int val = sc.nextInt();
        ll.insert_last(val);
    }
    System.out.println("Before deleting: ");
    ll.display();
    ll.delete(ll.head);
    System.out.println("\nAfter deleting: ");
    ll.display();
  }
}
*/
/* 
public class example {
    static int size=5;
    static int[] st = new int[size];
    static int top=0;
    boolean isFull(){
        return top==size;
    }
    void push(int val){
        if (isFull()){
            System.out.println("stack is full");
        }
        else{
            st[top] = val;
            top++;
        } 
    }
    boolean isEmpty(){
        return top==0;
    }
    int pop(){
        int val = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top--;
            val = st[top];
            st[top] = 0;
        }
        return val;
    }
    int peek(){
         int val = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            val = st[top-1];
        }
        return val;
    }
    void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            for(int i=top-1;i>=0;i--){
                System.out.println(st[i]);
            }
        }
    }
    public static void main(String[] args) {
        example s = new example();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.display();
        System.out.println("popped: "+s.pop());
        s.display();   
        System.out.println("peek is "+s.peek());
    }
}*/
/*
public class example {
    Node top = null;
    static int size = 0;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    void push(int val){
        Node node = new Node(val);
        if(top==null){
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
        size++;
    }
    boolean isEmpty(){
        return top == null;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = top.val;
        top = top.next;
        size--;
        return val;
    }
    
    public static void main(String[] args) {
        
    }
}*/

/* 
public class example {
    static int front = 0, rear=0,size=5;
    static int[] queue = new int[size];
    private boolean isFull(){
        return rear == size;
    }
    void add(int val){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            queue[rear] = val;
            rear++;
        }
    }
    boolean isEmpty(){
        return rear == 0;
    }
    int remove(){
        int val=-1;
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            val = queue[0];
            for(int i=0;i<rear-1;i++){
                queue[i] = queue[i+1];
            }
            size--;
            rear--;
        }
        return val;
    }
    void display(){
        for(int i=0;i<rear;i++){
            System.out.print(queue[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       example que = new example();
       que.add(10);
       que.add(20);
       que.add(30); 
       que.add(40);
       que.add(50);
       que.add(60);
       que.display();
       System.out.println("popped: "+que.remove());
       System.out.println("popped: "+que.remove());
       System.out.println("popped: "+que.remove());
       System.out.println("popped: "+que.remove());
       System.out.println("popped: "+que.remove());
       System.out.println("popped: "+que.remove());
        que.display();
    }
}*/
/* 
public class example {
    Node front = null, rear = null;
    static int size;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    void add(int val){
        Node node = new Node(val);
        if(front == null){
            front = node;
            rear = node;
        }
        else{
            rear.next = node;
            rear = rear.next;
        }
        size++;
    }
    boolean isEmpty(){
        return front ==null;
    }
    int remove(){
        int val = -1;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            val=front.val;
            front = front.next;
            size--;
        }
        return val;
    }
    void display(){
        Node t_Node = front;
        while(t_Node!=null){
            System.out.print(t_Node.val + " ");
            t_Node= t_Node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        example q = new example();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(50);
        q.display();
        System.out.println("removed val: " + q.remove());
        q.display();
    }
}
*/
/*
import java.util.*;

public class example {

    // static int size=10;
    // static char[] st = new char[size];
    // static int top=0;
    // // boolean isFull(){
    //     return top==size;
    // }
    // void push(char val){
    //     if (isFull()){
    //         System.out.println("stack is full");
    //     }
    //     else if(isEmpty()){
    //         st[top] = val;
    //         top++;
    //     } 
    //     else{
    //         if(st[0]=='(' && val == ')'){
    //             pop();
    //         }
    //     }
    // }
    // boolean isEmpty(){
    //     return top==0;
    // }
    // int pop(){
    //     int val = -1;
    //     if(isEmpty()){
    //         System.out.println("Stack is empty");
    //     }else{
    //         top--;
    //         val = st[top];
    //         st[top] = 0;
    //     }
    //     return val;
    // }
    public boolean is_valid(String word){
        Stack<Character> st = new Stack<>();
        if(word.length()%2!=0){
            return false;
        }
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == '('){
                st.push('(');
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        example obj = new example();
        String  word = "))(()()())";
        System.out.println(obj.is_valid(word));
    }
}
*/
/* 
import java.util.*;
public class example {
    treeNode root = null;
    class treeNode{
        int val;
        treeNode left, right;
        treeNode(int val){
            this.val = val;
        }
    }
    void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root val: ");
        int val = sc.nextInt();
        treeNode tree_node = new treeNode(val);
        root = tree_node;
        insert(root);
    }
    void insert(treeNode curr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add in the left of : "+curr.val);
        String op = sc.next();
        if(op.equals("yes")){
            int val = sc.nextInt();
            treeNode tree_node = new treeNode(val);
            curr.left = tree_node;
            insert(curr.left);
        }
        System.out.println("Do you want to add in the right of : "+curr.val);
        op = sc.next();
        if(op.equals("yes")){
            int val = sc.nextInt();
            treeNode tree_node = new treeNode(val);
            curr.right = tree_node;
            insert(curr.right);
        }
    }
    void pre_order(){
        if(root==null) return;
        pre_order(root);
    }
    void pre_order(treeNode curr){
        if(curr == null) return;
        System.out.print(curr.val+" "); // pre-order
        pre_order(curr.left);
        //System.out.print(curr.val+" "); // in-order
        pre_order(curr.right);
        //System.out.print(curr.val+" "); // post-order
    }

    boolean contains(int val){
        return contains(val,root);
    }
    boolean contains(int val,treeNode curr){
        if(curr == null){
            return false;
        }
        if(curr.val == val){
            return true;
        }
        if(contains(val,curr.left)||contains(val,curr.right)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        example tree = new example();
        tree.insert();
        //tree.pre_order();
        System.out.println(tree.contains(60));
    }
}*/
/*
import java.util.*;
public class example {
    static treeNode root = null;
    class treeNode{
        int val;
        treeNode left, right;
        treeNode(int val){
            this.val= val; 
        }
    }
    void insert(int val){
        root=insert(val,root);
    }
    treeNode insert(int val,treeNode curr){
        if(curr==null){
            treeNode tree_node = new treeNode(val);
            return tree_node;
        }
        if(curr.val >= val){
            curr.left=insert(val,curr.left);
        }
        else{
            curr.right = insert(val,curr.right);
        }
        return curr;
    }
    void pre_order(treeNode curr){
        if(curr == null) return ;
        System.out.print(curr.val+ " ");
        pre_order(curr.left);
        pre_order(curr.right);
    }
    boolean search(int key){
        return search(key,root);
    }
    boolean search(int key, treeNode curr){
        if(curr == null){
            return false;
        }
        else if(key == curr.val){
            return true;
        }
        else if(key<curr.val){
            return search(key,curr.left);
        }
        else{
            return search(key,curr.left);
        }
    }
    public static void main(String[] args) {
        example bst = new example();
        bst.insert(30);
        bst.insert(20);
        bst.insert(10);
        bst.insert(40);
        bst.insert(25);
        bst.pre_order(root);
        System.out.println(bst.search(90));
    }
}
*/
/*
import java.util.*;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                if(temp.length()>0 && temp.charAt(temp.length()-1)=='s'){
                    System.out.println(temp);
                }
                temp ="";
            }
            else{
                temp = temp + str.charAt(i);
            }
        }
        if(temp.length() > 0 && temp.charAt(temp.length()-1) == 's'){
            System.out.println(temp);
        }
        //String arr[] = str.split(" ");
        // for(int i=0;i<arr.length;i++){
        //     String word = arr[i];
        //     if((word.charAt(word.length()-1)=='s') || (word.charAt(word.length()-1)=='S')){
        //         System.out.println(word);
        //     }
        //     //lasts(arr[i]);
        //    // System.out.println(arr[i]);
        // }

        sc.close();
    }
}*/
/* 
import java.util.*;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = (int)(a+b+c)/2;
        int area = (int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle: "+area);
        String str = Integer.toString(area);
        int p=0,q=str.length()-1;
        boolean pal = true;
        while(p<q){
            if(str.charAt(p)!=str.charAt(q)){
                pal=false;
                break;
            }
            p++;
            q--;
        }
        if(pal){
            System.out.println("area is palindraome");
            
        }else{
           System.out.println("area is not palindrome");
        }
    }
}
*/
/*
import java.util.*;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        //System.out.println(str);
        int[] freq = new int[26];
        int max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            freq[(int)str.charAt(i)-97]++;
            if(max<freq[(int)str.charAt(i)-97]){
                max = freq[(int)str.charAt(i)-97];
            }
        }
        for(int i=0;i<26;i++){
            if(max == freq[i]){
                System.out.println("The maximum occuring character "+(char)(i+97) +" is " + max);
            }
        }
       
    }
}*/
/* 
import java.util.*;
public class example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch =str.toCharArray();
        int n = sc.nextInt();
        if(n<=0) return;
        char c = str.charAt(n-1);
        for(int i=0;i<str.length();i++){
            ch[i] = c;
        }
        str = new String(ch);
        System.out.println(str);
    }
}*/
/*
import java.util.*;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[26];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            freq[(int)str.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i] !=0){
                System.out.print((char)(i+97)+""+freq[i]);
            }
        }
       
    }
}*/
import java.util.*;
public class example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the location where you wish to delete an element");
        int pos = sc.nextInt();
        System.out.println("Array after deletion is: ");
        for(int i=0;i<n;i++){
            if(pos-1>n || pos-1<0 || pos-1==i){
                continue;
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}