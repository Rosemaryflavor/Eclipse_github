package memberMng;

public class MemberController {

	Memberservice Memberservice = new Memberservice();
	
	public static void main(String[] args) {
		
		Memberservice memberService = new Memberservice();
		
		memberService.startProgram();

	}

}
