public class Main {
    public static void main(String[] args) {
        var boxerWeightOne = 78.2;
        System.out.println("Вес первого боксера " + boxerWeightOne + "кг.");
        var boxerWeightTwo = 82.7;
        System.out.println("Вес второго боксера " + boxerWeightTwo + "кг.");
        var TotalWeight = boxerWeightOne + boxerWeightTwo;
        System.out.println("Общий вес двух боксеров " + TotalWeight + "кг.");
        var WeightDifference = boxerWeightOne - boxerWeightTwo;
        System.out.println("Разница в весе составляет " + WeightDifference + "кг.");

    }
}