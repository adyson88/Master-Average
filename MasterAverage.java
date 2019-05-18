
public class MasterAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Weighted Average of test scores and their respective weights
		System.out.println ("Weighed Average of Test Scores: " +  ((75*0.10) + (95*0.20) + (85*0.25) + (55*0.25) + (65*0.10) + (70*0.10)/6));
				
		// Weighted average of assignments and their respective weights
		System.out.println ("Weighed Average of Test Scores: " +  ((55*0.05) + (65*0.10) + (65*0.15) + (60*0.25) + (55*0.25) + (50*0.10)/6));

		
		
		// Master average between both weighted averages
		System.out.println ("Master Average between previously weighted averages: " + ((69.16666666666667 + 48.583333333333336)/2));
		
	}

}
