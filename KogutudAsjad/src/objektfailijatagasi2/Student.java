package objektfailijatagasi2;

import java.io.Serializable;
/*
 * 
 * 			Lihtne objektivorm, kus igal objektil on üks String ja üks integer väärtus... võimalik omistada ja välja lugeda neid vastavalt  set  või  get variandiga  
 * 
 */

	@SuppressWarnings("serial")
	public class Student implements Serializable {
        private String name;
        private int age;
 
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
}

