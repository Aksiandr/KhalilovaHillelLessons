import streamsHomeWork.Computer;
import streamsHomeWork.ComputerCollection;

import java.util.*;
import java.util.stream.Collectors;

public class WindowsCollection {

    public static void main(String[] args) {

        List<Computer> computers = ComputerCollection.computersList();

        // Task #1
        System.out.println("---------------------------------------------- \n\t TASK #1");
        Set<Computer> windowsOsComputers = computers.stream()
                .filter(comp -> comp.getOS().equals("Windows"))
                .collect(Collectors.toSet());
        System.out.println("The collection of computers with Windows OS: ");
        windowsOsComputers.forEach(System.out::println);

        // Task #2
        System.out.println("---------------------------------------------- \n\t TASK #2");
        List<Computer> ssdStorageCollection = computers.stream()
                .filter(computer -> computer.getStorage().getStorageType().equals("SSD"))
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("The collection of computers with Storage Type SSD: ");
        ssdStorageCollection.forEach(System.out::println);

        // Task #3
        System.out.println("---------------------------------------------- \n\t TASK #3");
        List<Double> priceCollection = computers.stream()
                .map(computer -> computer.getPrice())
                .collect(Collectors.toList());
        System.out.println("The collection of prices: ");
        priceCollection.forEach(System.out::println);

        // Task #4
        System.out.println("---------------------------------------------- \n\t TASK #4");
        Optional<Double> sortedComputersByPrice = computers.stream()
                .map(computer -> computer.getPrice())
                .sorted()
                .skip(computers.size() - 3)
                .findFirst();

        System.out.println("The collection of prices: " + sortedComputersByPrice);

        // Task #5
        System.out.println("---------------------------------------------- \n\t TASK #5");
        Map<Integer, Computer> computersToMap = computers.stream()
                .collect(Collectors.toMap(Computer::getId, v -> v));

        System.out.println("The map of computers: ");
        computersToMap.forEach((k, v) -> System.out.println(k + "______" + v.toString()));

        // Task #6
        System.out.println("---------------------------------------------- \n\t TASK #6");
        boolean isNotDosComputer = computers.stream()
                .noneMatch(comp -> comp.getOS().equals("DOS"));

        System.out.println("A computer with DOS OS isn't present: " + isNotDosComputer);

        // Task #7
        System.out.println("---------------------------------------------- \n\t TASK #7");
        boolean isAnyMacOsComputer = computers.stream()
                .anyMatch(comp -> comp.getOS().equals("MacOS"));

        System.out.println("A computer with MacOS OS exists: " + isAnyMacOsComputer);
    }
}
