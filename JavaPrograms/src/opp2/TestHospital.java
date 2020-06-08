package opp2;

public class TestHospital {

	public static void main(String[] args) {

		ApolloHospital ap=new ApolloHospital();
		
		ap.emergency();
		ap.polioDrops();
		ap.bloodTest();
		ap.dentalTest();
		
		ap.physioServices();
		ap.inPatient();
		ap.outPatient();
		System.out.println(IndiaHealthCare.min_fee);
		System.out.println(USHealthCare.min_fee_us);
		
		//Up top casting 
		IndiaHealthCare ih=new ApolloHospital();
		ih.emergency();
		ih.polioDrops();
		ih.bloodTest();
		ih.dentalTest();
		
		
	}

}
