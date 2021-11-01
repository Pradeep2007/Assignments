package com.HybridInher;

class HybridInheritance {
	public void m1() {
	System.out.println("A");
}
}
class b extends HybridInheritance{
	public void m2() {
	System.out.println("B");
}
}
class c extends HybridInheritance{
	public void m3() {
	System.out.println("C");
}
}
class d extends b{
	public void m4() {
	System.out.println("D");
}
public static void main (String[] args) {
	d a = new d();
	a.m4();
}

}

