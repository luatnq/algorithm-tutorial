import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {

  private static List<String> numberStr = Arrays.asList("một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mốt");
  private static List<String> spaceValues = Arrays.asList("triệu", "nghìn", "trăm", "mươi", "mười", "lẻ");
  private static String SPACE = " ";


  public static void main(String[] args){
    //
//    System.out.println(splitNumber(23490));
//    System.out.println(7%6);

    List<Integer> numberArr = splitNumber(20000000);
    System.out.println(handleNumber(numberArr));
  }

  public static String handleNumber(List<Integer> numberArr){
    Integer numberSize = numberArr.size();
    if (numberSize > 9) return "Chua ho tro";

    String numberResult = "";
    while (numberSize >= 0){

      if (numberSize >= 7){
        numberResult = handleEachDigit(numberArr, numberSize, 7);

        System.out.println(numberSize);
      }
      return numberResult;
    }

    return "";
  }


  public static String handleEachDigit(List<Integer> numberArr, Integer numberSize, int numberType){
    String numberResult = "";

    int a = numberSize % numberType;
    int numberHandling = numberArr.get(numberSize - 1);

    //so hang trieu
    if (a == 0){
      numberResult += getNumberStr(numberHandling) + SPACE + getSpaceValue(numberType);
      numberSize--;

    } else if( a == 1 ){
      //xu ly hang chuc trieu
      int numberHandlingSecond = numberArr.get(numberSize - 2);

      //hàng chục triệu là 1, đơn vị tiếp theo của hàng triệu là 0
      if (numberHandling == 1 && numberHandlingSecond == 0){

        numberResult += getSpaceValue(2) + SPACE + getSpaceValue(numberType);

      }else if( numberHandling != 1 && numberHandlingSecond == 0){
        //hàng chục triệu khác 1, đơn vị tiếp theo của hàng triệu là 0

        numberResult += getNumberStr(numberHandling) + SPACE + getSpaceValue(0) + SPACE + getSpaceValue(numberType);

      }else if(numberHandling == 1){
        //hàng chục triệu là 1
        numberResult += getSpaceValue(2) + SPACE + getNumberStr(numberHandlingSecond) + SPACE + getSpaceValue(numberType);

      } else if( numberHandling != 1 && numberHandlingSecond == 1){
        //hàng chục triệu khác 1, đơn vị tiếp theo của hàng triệu là 1

        numberResult += getNumberStr(numberHandling) + SPACE + getSpaceValue(0) + SPACE + getNumberStr(0) + SPACE + getSpaceValue(numberType);

      }else {
        //các trường hợp còn lại
        numberResult += getNumberStr(numberHandling) + SPACE + getNumberStr(numberHandlingSecond) + SPACE + getSpaceValue(numberType);
      }

      numberSize = numberSize - 2;
    }

    System.out.println(numberSize);

    return numberResult;
  }
  public static String getNumberStr(int number){
    switch (number){
      case 1:
        return numberStr.get(0);
      case 2:
        return numberStr.get(1);
      case 3:
        return numberStr.get(2);
      case 4:
        return numberStr.get(3);
      case 5:
        return numberStr.get(4);
      case 6:
        return numberStr.get(5);
      case 7:
        return numberStr.get(6);
      case 8:
        return numberStr.get(7);
      case 9:
        return numberStr.get(8);
      case 0:
        return numberStr.get(9);
    }
    return "";
  }

  public static String getSpaceValue(int number){
    switch (number){
      case 7:
        //trieu
        return spaceValues.get(0);
      case 4:
        //nghin
        return spaceValues.get(1);
      case 3:
        //tram
        return spaceValues.get(2);
      case 2:
        //muoi
        return spaceValues.get(4);
      case 1:
        //le
        return spaceValues.get(5);
      default:
        return spaceValues.get(3);
    }
  }

  public static List<Integer> splitNumber(int number){
    List<Integer> numberArr = new ArrayList<>();
    int divisor = 10;
    while (number > 0){
      int n = number%10;
      numberArr.add(n);
      number = number /10;
    }
    return numberArr;
  }
}
