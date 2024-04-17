package polymorphism.example1;

public class Student extends Person {

	private int aem;

	// O default ������� ��� Student ����� ����� �� default
	// ��� ���������� ������� �� �� �������� super()
	public Student() { aem=19; }

	public Student(int aem) {
		// �������� ���� ��� �� ���� � default �������
		// super("Nick");    
		this.aem = aem;
	}

	public Student(int aem, String name) {
		// � default ������� �������� ��� 
		// ������������ �� �������� ������
		super(name);  
		this.aem = aem;
	}

	public int getAem() {
		return aem;
	}

	public void setAem(int aem) {
		this.aem = aem;
	}
	// @Override - ��� ����� ���������� �� ������� �� annotation
	
/*
 *  // Error. ���� ������ override ���� ������� ������ � ����� ���������� �� ����� � �����
	public int print() {
		System.out.println("Aem="+aem);
		return 1;
	}
*/	
	// ��������� override (����������)
	public void print() {
		// ��� ������� �� ��������� ��� ��� print ��� �������� ������
		super.print(); 
		System.out.println("Aem="+aem+"\n");
	}
	
	// ��������� overloading (�����������)
	public void print(int a) {
		System.out.println("Aem="+aem+"\n");
	}

}
