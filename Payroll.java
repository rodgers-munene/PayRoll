import java.util.Scanner;

public class Payroll {
     public static void main(String[] args){
          int basicPay, employeeNo, daysWorked, payRate, pF;
          float profTax;
          String employeeName, workType, genDate;
          Scanner number = new Scanner(System.in);
          Scanner name = new Scanner(System.in);
          Scanner designation = new Scanner(System.in);
          Scanner days = new Scanner(System.in);
          Scanner pay = new Scanner(System.in);
          Scanner date = new Scanner(System.in);
          System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
          employeeNo = number.nextInt();
          System.out.print("ENTER THE EMPLOYEE NAME: ");
          employeeName = number.next();
          System.out.print("ENTER THE DESIGNATION: ");
          workType = number.next();
          System.out.print("ENTER THE NUMBER OF DAYS WORKED: ");
          daysWorked = days.nextInt();
          System.out.print("ENTER THE PAY RATE: ");
          payRate = pay.nextInt();
          System.out.print("ENTER THE DATE OF GENERATION: ");
          genDate = date.next();
          basicPay = payRate * daysWorked;
          profTax = 0.2f * basicPay;
          pF = basicPay/10;
          System.out.println("                      SHREE KRISHNA CHEMIST AND DRUGGIST");
          System.out.println("                               SALARY MONTH 9 2023");
          System.out.println("\n");
          System.out.println("        EMP. NO.: "+ employeeNo+"          EMP.NAME: "+ employeeName + "        DESIGNATION: " +workType);
          System.out.println("        DAYS WORKED: "+ daysWorked + "     PAY RATE: "+ payRate+"               GEN.DATE:"+ genDate);
          System.out.println("___________________________________________________________________________________");
          System.out.println("        EARNINGS         AMOUNT(RS.)            DEDUCTIONS           AMOUNT(RS.) ");
          System.out.println("        BASIC PAY:      "+basicPay+"                   P.F                 "+pF);
          System.out.println("                                                PROF.TAX            "+profTax);
          System.out.println("\n");
          System.out.println("___________________________________________________________________________________");
          System.out.println("        GROSS EARN."+ basicPay+"                        TOTAL DEDUCT.       " + (profTax+pF));
          System.out.println("                                                NET PAY             " + (basicPay - (profTax + pF)));
          System.out.println("___________________________________________________________________________________");

          
     }
}

