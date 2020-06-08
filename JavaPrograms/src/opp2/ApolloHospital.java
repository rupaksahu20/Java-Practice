package opp2;

public class ApolloHospital  implements IndiaHealthCare,USHealthCare{

	//IndiaHealthCare
	@Override
	public void emergency() {
		System.out.println("apollo -- emergency");
		
	}

	@Override
	public void polioDrops() {
		System.out.println("apollo -- polioDrops");
	}

	@Override
	public void bloodTest() {
		System.out.println("apollo -- bloodTest");
		
	}
	
	@Override
	public void dentalTest() {
		System.out.println("apollo -- dentalTest");
		
	}
    //USHealthCare
	@Override
	public void physioServices() {
		System.out.println("apollo -- physioServices");
	}

	@Override
	public void outPatient() {
		System.out.println("apollo -- outPatient");
		
	}

	@Override
	public void inPatient() {
		System.out.println("apollo -- inPatient");
		
	}
	
	//ApolloHospital
	public void ambulanceServices() {
		System.out.println("apollo -- ambulanceServices");
	}
	
	public void cancerTreatment() {
		System.out.println("apollo -- cancerTreatment");
	}

	

	

}
