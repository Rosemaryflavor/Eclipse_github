package customer;

public class Ex_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String customerId;
		String customerName;
		String customerGrade;
		int customerPoint;
		double customerRatio;
		
		public Customer() {
			customerGrade = "SILVER";
			customerRatio = 0.01;
		}
		
		public calcRatio(int price) {
			customerPoint += price * customerRatio;
		}
		
		public String customerInfo() {
			String result = "";
			
			result += "[고객 아이디] : " + customerId + "\n";
			result += "[고객 이름] : " + customerName + "\n";
			result += "[고객 등급] : " + customerGrade + "\n";
			result += "[고객 포인트] : " + customerPoint + "\n";
			result += "[고객 포인트1] : " + customerRatio + "\n";
			return result;
		}
		
	    Customers customerLee = new Customers();
	    customerLee.setCustomerId("mem_lee");
	    customerLee.setCustomerName("Lee");
	    
	    System.out.println(customerLee.customerInfo());
	    System.out.println(customerLee.calcRatio(10000));
		
	}

}
