package chap13.textbook.exercise.p03;

public class Container<N, A, J> {
	private N name;
	private A age;
	private J job;
	
	public N getKey() { return this.name; }
	public A getValue1() { return this.age; }
	public J getValue2() { return this.job; }
	
	public void setKey(N name) { this.name = name; }
	public void setValue1(A age) { this.age = age; }
	public void setValue2(J job) { this.job = job; }
}
