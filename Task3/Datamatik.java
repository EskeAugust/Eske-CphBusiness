class Datamatik
{
	public static void main(String[] args)
	{
		Teacher teacher1 = new Teacher("Hugo", 52, "Male");
		Student student1 = new Student("Eske", 25, "Male", 6);
		Student student2 = new Student("Mads", 50, "Male", 6);

		System.out.println(teacher1.name);
		System.out.println(student1.name + " is in group "+student1.datamatikerTeam);
		System.out.println(student2.name + " is in group "+student2.datamatikerTeam);
		
	}
}