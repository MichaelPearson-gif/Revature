package eg1;

public class Employee {
		
		private int id;
		private String name;
		private long contact;
		private int age;
		private char gender;

		public Employee() {
			// TODO Auto-generated constructor stub
		}
		
		public Employee(String name, long contact, int age, char gender) {
			super();
			this.name = name;
			this.contact = contact;
			this.age = age;
			this.gender = gender;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getContact() {
			return contact;
		}

		public void setContact(long contact) {
			this.contact = contact;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		@Override //Annotation
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", age=" + age + ", gender=" + gender
					+ "]";
		}


}
