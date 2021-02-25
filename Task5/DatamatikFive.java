class DatamatikFive
{
	public static void main(String[] args)

	{
		StudentFive[] theStudents = new StudentFive[10];
		theStudents[0] = new StudentFive("Mads", 50, "Male", 6);
		theStudents[1] = new StudentFive("Eske", 25, "Male", 6);
		theStudents[2] = new StudentFive("Rabee", 50, "Male", 6);
		theStudents[3] = new StudentFive("Victoria", 20, "Female", 6);
		theStudents[4] = new StudentFive("Mads2", 50, "Male", 6);
		theStudents[5] = new StudentFive("Eske2", 25, "Male", 6);
		theStudents[6] = new StudentFive("Rabee2", 50, "Male", 6);
		theStudents[7] = new StudentFive("Victoria2", 20, "Female", 6);
		theStudents[8] = new StudentFive("Mads3", 50, "Male", 6);
		theStudents[9] = new StudentFive("Eske3", 25, "Male", 6);

		System.out.println(theStudents[8].name);
		System.out.println("The student with index: "+studentIndex("Mads2", theStudents)+" has the entered name");
		
	}

	public static int studentIndex(String name, StudentFive[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].name == name)
			{
				return i;
			}
		}	

		return -1;
	}
}