import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class EmployeeVo {
	int empid;
	String empname;
	int annualincome;
	double incometax;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(int annualincome) {
		this.annualincome = annualincome;
	}

	public double getIncometax() {
		return incometax;
	}

	public void setIncometax(double incomeTax) {
		this.incometax = incomeTax;
	}

	@Override
	public String toString() {
		return "EmployeeVo [empid=" + empid + ", empname=" + empname + ", annualincome=" + annualincome + ", incometax="
				+ incometax + "]";
	}

	public EmployeeVo(int empid, String empname, int annualincome, double incometax) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.annualincome = annualincome;
		this.incometax = incometax;
	}
	
	

}

class EmployeeBo {
	public void calinncomeTax(EmployeeVo evo) {
		evo.incometax = evo.annualincome* .10;
	}
}

class EmployeeSort implements Comparator<EmployeeVo> {

	// @Override
	// public int compare(Object o1, Object o2) {
	// EmployeeVo evo1=(EmployeeVo)o1;
	// EmployeeVo evo2=(EmployeeVo)o2;
	// int r=0;
	// if(evo1.getIncometax()<evo2.getIncometax())
	// r=1;
	// else if (evo1.getIncometax()>evo2.getIncometax())
	// r=-1;
	// else
	// r=0;
	// return r;

	// }

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		// TODO Auto-generated method stub
		EmployeeVo evo1 = (EmployeeVo) o1;
		EmployeeVo evo2 = (EmployeeVo) o2;
		int r = 0;
		if (evo1.getIncometax() < evo2.getIncometax())
			r = 1;
		else if (evo1.getIncometax() > evo2.getIncometax())
			r = -1;
		else
			r = 0;
		return r;
	}
}

public class EmployeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int empid;
		String empname;
		int annualIncome;
		double incomeTax = 0.0;
		System.out.println("please enter the limit");
		int x1 = Integer.parseInt(br.readLine());
		ArrayList<EmployeeVo> al = new ArrayList<EmployeeVo>(x1);
		for (int i = 0; i < x1; i++) {
			System.out.println("please enter the empid");
			empid = Integer.parseInt(br.readLine());
			System.out.println("please enter the empname");
			empname = br.readLine();
			System.out.println("please enter the annualincome");
			annualIncome = Integer.parseInt(br.readLine());
		
			al.add(new EmployeeVo(empid, empname, annualIncome, incomeTax));
			EmployeeBo eb = new EmployeeBo();
			eb.calinncomeTax(al.get(i));
			
		

		}
	
		System.out.println("after sorting ");

		Collections.sort(al, new EmployeeSort());
		System.out.println(al);

	}

}
