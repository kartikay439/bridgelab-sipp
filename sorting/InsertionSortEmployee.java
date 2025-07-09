
public class InsertionSortEmployee {

	public static void main(String[] args) {
		try {
			Employee[] employees = {new Employee(150), new Employee(101), new Employee(100), new Employee(173) };
			insertionSort(employees);
			for(Employee i:employees) {
				System.out.println("Employee Id : " + i.employeeId);
			}
		} catch (Exception e) {
			System.out.print(e);
		}
		
	}
	
	static void insertionSort(Employee[] arr) {
		int n = arr.length;
		for(int i=1;i<n;++i) {
		int key  = i;
		Employee keyValue = arr[i];
		int j = i-1;
			while(j >= 0 && (keyValue.employeeId < arr[j].employeeId)){
				//here key changes
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = keyValue;	
		}
	}
	


}
class Employee {
	int employeeId;
	public Employee(int employeeId){
		this.employeeId = employeeId;
	}
}

