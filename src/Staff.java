public abstract class Staff {

        private int ID;
        private String name;
        private int age;
        private String phone;
        private String email;

        public Staff(int ID, String name, int age, String phone, String email) {
            this.ID = ID;
            this.name = name;
            this.age = age;
            this.phone = phone;
            this.email = email;
        }

        public int getID() {
            return ID;
        }

        public void setId(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + ID +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", phoneNumber=" + phone +
                    ", email='" + email + '\'' +
                    '}';
        }

        public abstract double getSalary();
}