public class Employee;
public static void main{
EmployeeDetails//creating properties of Employee class
{
public String getfirstName(){
    return name;
}
public String getlastName(){
    return name;
}
public String depertmentName(){
    "tech","admin","hr","legal";
}
}
emailTextBx.click();
Employee employeeGenerator = new Employee();
name Depertmentname = DepertmentGenerator;
emailTextBx.sendKeys("employeename"+ depertmentname +"@gmail.com")

System.out.println"employeename";
System.out.println"email";
}
[0:01 pm, 13/03/2022] Soumyadip Jana: import java.util.Random;
 public class Tester{ 
    public static void main(String[] args) {    
   System.out.println(generatePassword(8));    
 }    private static char[] generatePassword(int length) {    
   String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";    
   String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";    
   String specialCharacters = "!@#$";    
   String numbers = "1234567890";      
 String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;   
     Random random = new Random();  
     char[] password = new char[length];
[0:02 pm, 13/03/2022] Soumyadip Jana: password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));  
     password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));     
   password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));   
     password[3] = numbers.charAt(random.nextInt(numbers.length()));      
     for(int i = 4; i< length ; i++) {       
    password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));  
     }       return password;    } }
