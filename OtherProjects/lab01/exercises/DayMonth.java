package exercises;
import java.util.Scanner;
public class DayMonth {
	public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        
        System.out.print("Nhập tháng (tên đầy đủ, viết tắt 3 chữ cái hoặc số): ");
        String monthInput = scanner.nextLine().trim();
        System.out.print("Nhập năm : ");
        int year = scanner.nextInt();

        // Kiểm tra năm nhập vào có hợp lệ không
        if (year < 0) {
            System.out.println("Năm không hợp lệ! Hãy nhập một năm không âm.");
            return;
        }

        // Xử lý tháng nhập vào và chuyển đổi thành số từ 1 đến 12
        int month = convertMonthToNumber(monthInput);
        if (month == -1) {
            System.out.println("Tháng không hợp lệ!");
            return;
        }

        // Kiểm tra năm có phải là năm nhuận không
        boolean isLeapYear = checkLeapYear(year);

        // Xác định số ngày trong tháng dựa trên tháng và năm
        int days = getDaysInMonth(month, isLeapYear);

        // In ra số ngày của tháng đã nhập
        System.out.println("Số ngày trong tháng " + monthInput + " năm " + year + " là: " + days);
        }
    }

    // Chuyển đổi tháng từ chuỗi thành số
    public static int convertMonthToNumber(String month) {
        switch (month.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "may.":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sep.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1;  // Tháng không hợp lệ
        }
    }

    // Kiểm tra năm có phải là năm nhuận hay không
    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Xác định số ngày trong tháng dựa trên tháng và năm nhuận
    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return -1;  // Trường hợp lỗi, không bao giờ xảy ra với dữ liệu hợp lệ
}
}
}
