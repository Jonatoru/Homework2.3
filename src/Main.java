public class Main {
    public static void main(String[] args) {
        var boxerWeightOne = 78.2;
        System.out.println("Вес первого боксера " + boxerWeightOne + "кг.");
        var boxerWeightTwo = 82.7;
        System.out.println("Вес второго боксера " + boxerWeightTwo + "кг.");
        var totalWeight = boxerWeightOne + boxerWeightTwo;
        System.out.println("Общий вес двух боксеров " + totalWeight + "кг.");
        var weightDifference = boxerWeightOne - boxerWeightTwo;
        System.out.println("Разница в весе составляет " + weightDifference + "кг.");

        var weightDifferenceTwo = boxerWeightTwo - boxerWeightOne;
        System.out.println("Разница в весе (из большего - меньшее) сотавляет " + weightDifferenceTwo + "кг.");
        var weightDifferenceThree = boxerWeightTwo % boxerWeightOne;
        System.out.println("Разница в весе (остаток от деления) составляет " + weightDifferenceThree + "кг.");


    }
}