//package application;
//
//import java.time.LocalDate;
//import java.time.YearMonth;
//
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//
//public class CalenderButton {
//	private TextField tfy;
//	private TextField tfm;
//	public TextField getTfy() {
//		return tfy;
//	}
//	public void setTfy(TextField tfy) {
//		this.tfy = tfy;
//	}
//	public TextField getTfm() {
//		return tfm;
//	}
//	public void setTfm(TextField tfm) {
//		this.tfm = tfm;
//	}
//	public Label getL() {
//		return l;
//	}
//	public void setL(Label l) {
//		this.l = l;
//	}
//	private Label l;
//	
//	CalenderButton(TextField tfY, TextField tfM, Label lb){
//		tfy = tfY;
//		tfm= tfM;
//		l = lb;
//	}
//	void setCalender(TextField tfYear, TextField tfMonth, Label label) {
//		int y = Integer.parseInt(tfYear.getText());
//		int m = Integer.parseInt(tfMonth.getText());
//		   
//		   YearMonth yearNmonth = YearMonth.of(y, m);
//		   int counter = 1;
//		   
//		   // gets according first day of week for given year and month and
//		   // stores it as an int variable
//		   int firstDay = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
//		   
//		   if (firstDay != 7) 
//		   for (int i = 0; i < firstDay; i++, counter++) {
//			   
//				   String format = String.format("%-6s", " ");
//			       label.setText(label.getText() + format);
//			   }
//		   
//		   
//		   for (int i = 1; i <= yearNmonth.getMonth().length(yearNmonth.isLeapYear()); i++, counter++) {
//			   String format1 = String.format("%-4d", i);
//			   	label.setText(label.getText()+ format1);
//
//			   // New line if the value of the counter is multiple of 7(a week)
//			   if (counter % 7 == 0) {
//				   	label.setText(label.getText() + "\n");   
//
//			   }
//		   }
//	}
//	   
//}
