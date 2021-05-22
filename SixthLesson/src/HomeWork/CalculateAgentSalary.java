package HomeWork;

public class CalculateAgentSalary {


    public static void main(String[] args) {

        SalesAgentSalary agent = new SalesAgentSalary(180, 15, 2, 16, 16000);
        SalesAgentSalary agentProbation = new SalesAgentSalary(160, 10);

        System.out.println("Salary for the agent on probation: " + agentProbation.getSalary());
        System.out.println("Salary for the agent: " + agent.getSalary());

    }


}
