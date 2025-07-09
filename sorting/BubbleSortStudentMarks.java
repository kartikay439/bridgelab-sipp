
public class BubbleSortStudentMarks {

	public static void main(String[] args) {
		try {
			StudentM[] marks = {new StudentM(100, 5), new StudentM(101, 9), new StudentM(102, 8), new StudentM(103, 8) };
			bubbleSort(marks);
			for(StudentM i:marks) {
				System.out.println("Roll No : "+i.rollNo+" Marks : "+i.marks);
			}
		} catch (Exception e) {
			System.out.print(e);
		}
		
	}
	
	static void bubbleSort(StudentM[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			boolean replace = false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j].marks > arr[j+1].marks) {
					StudentM temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					replace = true;
				}
			}
			if(!replace) {
				break;
			}
			
		}
	}

}
class StudentM {
	int rollNo;
	int marks;

	public StudentM(int rollNo, int marks) throws Exception {
		this.rollNo = rollNo;
		if (marks > 10 || marks < 0)
			throw new Exception("Enter Marks Within Range");
		this.marks = marks;
	}
}

