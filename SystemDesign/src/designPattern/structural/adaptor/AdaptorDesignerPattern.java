package designPattern.structural.adaptor;

public class AdaptorDesignerPattern {

		
		
	public static void run() {
		// we have a marker pen and we don't have a pen
				MarkerPen marker=new MarkerPen();
				//using PenAdaptor we conver marker to pen
				Pen pen=new PenAdaptor(marker);
				AssignmentWork aw=new AssignmentWork(pen);
				aw.doAssignment("hey im feeling lazy today and can't do work today");
	}

}

//we have a markerPen;
class MarkerPen{
	public void mark(String str) {
		System.out.println(str);
	}
}
interface Pen{
	public void write(String str);
}
class PenAdaptor implements Pen{
	MarkerPen mpen;
	

	public PenAdaptor(MarkerPen mpen) {
		super();
		this.mpen = mpen;
	}


	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		mpen.mark(str);
		
	}
	
}
class AssignmentWork{
	Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
	public AssignmentWork(Pen pen){
		this.pen=pen;
		
	}
	public void doAssignment(String str) {
		pen.write(str);
	}
	
}
