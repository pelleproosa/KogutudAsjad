package objektfailijatagasi2;

import java.io.Serializable;
/*
 * 
 * 			Lihtne objektivorm, kus igal objektil on �ks String ja �ks integer v��rtus... v�imalik omistada ja v�lja lugeda neid vastavalt  set  v�i  get variandiga  
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

