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

        var totalOperatingHours = 640.0;
        var timePerWorker = 8;
        System.out.println("Общее рабочее время " + totalOperatingHours + " часов, а рабочее время одного работника " + timePerWorker + " часов.");
        var amountOfWorkers = totalOperatingHours / timePerWorker;
        System.out.println("Всего работников в компании – " + amountOfWorkers + " человек.");
        var amountOfWorkersTwo = amountOfWorkers + 94;
        var timePerWorkerTwo = 8;
        var totalOperatingHoursTwo = amountOfWorkersTwo * timePerWorkerTwo;
        System.out.println("Если в компании работает " + amountOfWorkersTwo + " человека, то всего " + totalOperatingHoursTwo + " часа работы может быть поделено между сотрудниками.");
        System.out.println("Либо второе решение:");
        var timePerWorkerThree = totalOperatingHours / amountOfWorkersTwo;
        var minutes = 60.0;
        var minutesResult = timePerWorkerThree - 3.0;
        var hourResult = timePerWorkerThree - 0.68;
        String hourResultOne = String.format("%.0f",hourResult);
        var interestPerMinute = minutesResult * minutes;
        String interestPerMinuteOne = String.format("%.0f",interestPerMinute);
        System.out.println("Если в компании работает " + amountOfWorkersTwo + " человека, то всего "  + hourResultOne + ":" + interestPerMinuteOne + " часа работы может быть поделено между сотрудниками.");



    }
}