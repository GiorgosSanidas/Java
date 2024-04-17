package erg4;

import java.util.ArrayList;
import java.util.Scanner;

public class University {

	public static ArrayList<Department> departments = new ArrayList<Department>();
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static ArrayList<Professor> professors = new ArrayList<Professor>();
	public static ArrayList<Student> students = new ArrayList<Student>();
	public static ArrayList<Graduate> graduates = new ArrayList<Graduate>();

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		showMenu();
		int choice = scanner.nextInt();
		scanner.nextLine();

		while (choice != 0) {

			switch (choice) {
				case 1:
					Department department = insertDepartment(null);
					System.out.printf("Inserted Department:\n\t%s\n", department);
					// showDepartments();
					break;

				case 2:
					Professor professor = insertProfessor(null, null);
					System.out.printf("Inserted Professor:\n\t%s\n", professor);
					break;

				case 3:
					Employee employee = insertEmployee();
					System.out.printf("Inserted Employee:\n\t%s\n", employee);
					// showEmployees();
					break;

				case 4:
					Student student = insertStudent();
					System.out.printf("Inserted Student:\n\t%s\n", student);
					// showStudents();
					break;

				case 5:
					Graduate graduate = insertGraduate();
					System.out.printf("Inserted Graduate Student:\n\t%s\n", graduate);
					break;

				case 6:
					showDepartments();
					break;

				case 7:
					showProfessors();
					break;

				case 8:
					showEmployees();
					break;

				case 9:
					showStudents();
					break;

				case 10:
					showGraduates();
					break;
				default:
					System.out.println("Invalid choice!");
					break;
			}
			showMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
		}

	}

	public static void showMenu() {
		System.out.println("-------- Menu Options ----------------");
		System.out.println("\t 0. Quit");
		System.out.println("\t 1. Add Department");
		System.out.println("\t 2. Add Professor");
		System.out.println("\t 3. Add Employee");
		System.out.println("\t 4. Add Student");
		System.out.println("\t 5. Add Graduated Student");
		System.out.println("\t 6. Show Departments");
		System.out.println("\t 7. Show Professors");
		System.out.println("\t 8. Show Employees");
		System.out.println("\t 9. Show Students");
		System.out.println("\t 10. Show Graduated Students");
		// continue with options ...
		System.out.print("Enter an number-option: ");
	}

	public static Department insertDepartment(String name) {
		System.out.println("--------------------------------------");
		System.out.println("Adding Department");

		if (name == null) {
			System.out.print("Dwse onoma : ");
			name = scanner.nextLine();
		}

		System.out.print("Dwse dieuthinsi : ");
		String address = scanner.nextLine();

		System.out.print("Dwse thlefono : ");
		long thl = scanner.nextLong();
		scanner.nextLine();

		System.out.print("Dwse arithmo fititon : ");
		int arithmosFititon = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse arithmo ergazomenon : ");
		int arithmosErgazomenon = scanner.nextInt();
		scanner.nextLine();
		System.out.println("--------------------------------------");

		Department department = new Department(name, address, thl, arithmosFititon, arithmosErgazomenon);
		departments.add(department);

		return department;
	}

	public static void showDepartments() {
		System.out.println("------------ Departments --------------");
		for (Department department : departments) {
			System.out.println(department);
		}
		System.out.println("--------------------------------------");

	}

	public static Employee insertEmployee() {
		System.out.println("--------------------------------------");
		System.out.println("Adding Employee");

		System.out.print("Dwse onoma: ");
		String name = scanner.nextLine();

		System.out.print("Dwse epitheto: ");
		String surname = scanner.nextLine();

		System.out.print("Dwse Hlikia: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse Dieuthinsi: ");
		String address = scanner.nextLine();

		System.out.print("Dwse afm : ");
		long afm = scanner.nextLong();

		System.out.print("Dwse mistho : ");
		float salary = scanner.nextFloat();
		scanner.nextLine();

		System.out.print("Dwse xronia proyphresias : ");
		int xroniaProyphresias = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse tmhma poy aniki : ");
		String departmentName = scanner.nextLine();

		Department department = searchDepartmentOrInsert(departmentName);

		System.out.println("--------------------------------------");

		Employee employee = new Employee(name, surname, age, address, afm, salary, xroniaProyphresias, department);

		employees.add(employee);
		return employee;
	}

	public static void showEmployees() {
		System.out.println("-------------- Employees ------------");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("--------------------------------------");

	}

	public static void showProfessors() {
		System.out.println("-------------- Professors ------------");
		for (Professor professor : professors) {
			System.out.println(professor);
		}
		System.out.println("--------------------------------------");

	}

	public static Student insertStudent() {
		System.out.println("--------------------------------------");
		System.out.println("Adding Student");

		System.out.print("Dwse onoma: ");
		String name = scanner.nextLine();

		System.out.print("Dwse epitheto: ");
		String surname = scanner.nextLine();

		System.out.print("Dwse Hlikia: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse Dieuthinsi: ");
		String address = scanner.nextLine();

		System.out.print("Dwse AM : ");
		int a_m = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse tmhma pou anhkei : ");
		String departmentName = scanner.nextLine();
		Department department = searchDepartmentOrInsert(departmentName);

		System.out.print("Dwse etos eisagoghs : ");
		int etosEisagoghs = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse bathmo sto proto mathima : ");
		double grade1 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Dwse bathmo sto deftero mathima : ");
		double grade2 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Dwse bathmo sto trito mathima : ");
		double grade3 = scanner.nextDouble();
		scanner.nextLine();

		double me_o = (grade1 + grade2 + grade3) / 3.0;

		System.out.print("O mesos oros ton mathimaton einai : " + me_o);

		System.out.println("--------------------------------------");

		Student student = new Student(name, surname, age, address, a_m, department, etosEisagoghs, grade1, grade2,
				grade3, me_o);

		students.add(student);
		return student;
	}

	public static void showStudents() {
		System.out.println("------------ Students ----------------");

		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("--------------------------------------");

	}

	public static Graduate insertGraduate() {
		System.out.println("--------------------------------------");
		System.out.println("Adding Graduate Student");

		System.out.print("Dwse onoma: ");
		String name = scanner.nextLine();

		System.out.print("Dwse epitheto: ");
		String surname = scanner.nextLine();

		System.out.print("Dwse Hlikia: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse Dieuthinsi: ");
		String address = scanner.nextLine();

		System.out.print("Dwse AM : ");
		int a_m = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse tmhma pou anhkei : ");
		String departmentName = scanner.nextLine();
		Department department = searchDepartmentOrInsert(departmentName);

		System.out.print("Dwse etos eisagoghs : ");
		int etosEisagoghs = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse bathmo sto proto mathima : ");
		double grade1 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Dwse bathmo sto deftero mathima : ");
		double grade2 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Dwse bathmo sto trito mathima : ");
		double grade3 = scanner.nextDouble();
		scanner.nextLine();

		double me_o = (grade1 + grade2 + grade3) / 3.0;

		System.out.println("O mesos oros ton mathimaton einai : " + me_o);

		System.out.print("Dwse titlo ptixiou : ");
		String titloPtixiou = scanner.nextLine();

		System.out.print("Dwse bathmo ptixiou : ");
		int bathmoPtixiou = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse Onoma epivleponta kathigiti : ");
		String epivlepontaKathigitiName = scanner.nextLine();

		System.out.print("Dwse Epitheto epivleponta kathigiti : ");
		String epivlepontaKathigitiSurname = scanner.nextLine();

		Professor epivlepontaKathigiti = searchProfessorOrInsert(epivlepontaKathigitiName, epivlepontaKathigitiSurname);

		System.out.print("Dwse titlo ergasias : ");
		String titloErgasias = scanner.nextLine();
		System.out.println("--------------------------------------");

		Graduate gr = new Graduate(name, surname, age, address, a_m, department, etosEisagoghs, grade1, grade2, grade3,
				me_o, titloPtixiou, bathmoPtixiou, epivlepontaKathigiti, titloErgasias);

		graduates.add(gr);
		return gr;
	}

	public static void showGraduates() {
		System.out.println("------------- Graduates --------------");

		for (Graduate graduate : graduates) {
			System.out.println(graduate);
		}
		System.out.println("--------------------------------------");

	}

	public static Department searchDepartmentOrInsert(String departmentName) {
		for (Department d : departments) {
			if (departmentName.compareTo(d.getName()) == 0) {
				return d;
			}
		}

		System.out.print(
				"Department with this name is not found. Do you want to insert a new one with full details? y/n ");
		String choice = scanner.nextLine();

		if (choice.compareTo("y") == 0 || choice.compareTo("Y") == 0) {
			return insertDepartment(departmentName);
		} else {
			Department department = new Department();
			department.setName(departmentName);
			departments.add(department);
			return department;
		}
	}

	public static Professor searchProfessorOrInsert(String professorName, String professorSurname) {
		for (Professor p : professors) {
			if (professorName.compareTo(p.getName()) == 0 && professorSurname.compareTo(p.getSurname()) == 0) {
				return p;
			}
		}

		System.out.print(
				"Professor with this name is not found. Do you want to insert a new Professor with full information? y/n ");
		String choice = scanner.nextLine();

		if (choice.compareTo("y") == 0 || choice.compareTo("Y") == 0) {
			return insertProfessor(professorName, professorSurname);
		} else {
			Professor pr = new Professor();
			pr.setName(professorName);
			pr.setSurname(professorSurname);
			professors.add(pr);

			return pr;
		}
	}

	public static Professor insertProfessor(String professorName, String professorSurname) {

		if (professorName == null) {
			System.out.print("Dwse onoma: ");
			professorName = scanner.nextLine();
		}

		if (professorSurname == null) {
			System.out.print("Dwse epitheto: ");
			professorSurname = scanner.nextLine();
		}

		System.out.print("Dwse Hlikia: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse Dieuthinsi: ");
		String address = scanner.nextLine();

		System.out.print("Dwse afm : ");
		long afm = scanner.nextLong();

		System.out.print("Dwse mistho : ");
		float salary = scanner.nextFloat();

		System.out.print("Dwse xronia proyphresias : ");
		int xroniaProyphresias = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse tmhma poy aniki : ");
		String departmentName = scanner.nextLine();
		Department department = searchDepartmentOrInsert(departmentName);

		System.out.print("Dwse bathmida : ");
		String bathmida = scanner.nextLine();

		System.out.print("Dwse xrono didaktorikou : ");
		int xronosDidaktorikou = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse arithmos dimosieusewn : ");
		int arithmosDimososieyseon = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse plhyhos metaptixiakwn pou epivlepi : ");
		int metaptixiakaEpivlepi = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Dwse onoma mathimatos pou didaskei xwrismena me kommata: ");
		String mathimataStr = scanner.nextLine();
		String[] mathimata = mathimataStr.split(",");

		System.out.println("--------------------------------------");

		Professor professor = new Professor(professorName, professorSurname, age, address, afm, salary,
				xroniaProyphresias, department, bathmida, xronosDidaktorikou, arithmosDimososieyseon,
				metaptixiakaEpivlepi, mathimata);

		professors.add(professor);
		return professor;
	}
}
