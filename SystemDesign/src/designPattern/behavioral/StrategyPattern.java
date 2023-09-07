package designPattern.behavioral;

public class StrategyPattern {
	public static void main(String[] args) {
		Problem problem=new Problem("finding smallest distance between two points");
		//problem.solve(new Algo1());
		problem.solve(new Algo2());
		
	}

}
interface SolutionStrategy{
	public void solve();
}
class Algo1 implements SolutionStrategy{

	@Override
	public void solve() {
		// TODO Auto-generated method stub
		System.out.println("solving the problem in n time complexity");
		
	}
	
	
}
class Algo2 implements SolutionStrategy{
	public void solve() {
		System.out.println("solving the problem in logn time complexity");
	}
}
class Problem{
	String problemStatement;

	public Problem(String problemStatement) {
		
		this.problemStatement = problemStatement;
	}

	public String getProblemStatement() {
		return problemStatement;
	}

	public void setProblemStatement(String problemStatement) {
		this.problemStatement = problemStatement;
	}
	public void solve(SolutionStrategy solution) {
		solution.solve();
	}
}
