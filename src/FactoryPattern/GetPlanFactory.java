package FactoryPattern;

public class GetPlanFactory {
	public PlanAbstarct getPlan(String planType) {
		
		if(planType == null) {
			return null;	
		}
		if(planType.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("Commercialplan")){
			return new CommercialPlan();
		}else if(planType.equalsIgnoreCase("InstitutionalPlan")) {
			return new InstitutionalPlan();
		}
		return null;
		
	}

}
