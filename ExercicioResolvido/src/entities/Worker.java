package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	// Método que calcula a renda total de um funcionário em um determinado mês e ano
	public double income(int year, int month) {
	    // Inicializa a soma com o salário base do funcionário
	    double sum = baseSalary;
	    
	    // Cria uma instância do Calendar para manipular datas
	    Calendar cal = Calendar.getInstance();
	    
	    // Itera sobre todos os contratos associados ao funcionário
	    for (HourContract c : contracts) {
	        // Define no Calendar a data do contrato atual
	        cal.setTime(c.getDate());
	        
	        // Obtém o ano da data do contrato
	        int c_year = cal.get(Calendar.YEAR);
	        
	        // Obtém o mês da data do contrato (adiciona 1 porque janeiro é 0 no Calendar)
	        int c_month = 1 + cal.get(Calendar.MONTH);
	        
	        // Verifica se o contrato pertence ao ano e mês especificados
	        if (year == c_year && month == c_month) {
	            // Soma o valor total do contrato à variável de soma
	            sum += c.totalValue();
	        }
	    }
	    
	    // Retorna a soma total: salário base + valores dos contratos do mês/ano especificados
	    return sum;
	}
}