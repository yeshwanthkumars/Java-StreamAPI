package com.java.stream.revision.terminaloperations.collect;

import com.java.stream.revision.terminaloperations.Employee;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumAvgSummarizingIntExample {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee(1,"Yeshwanth",30000, "Dev"),
                new Employee(2,"Gokul",40000, "Dev"),
                new Employee(3,"Vishal",45000, "Dev")
        );

        //SummingInt/SummingDouble
        double total = emp.stream()
                .collect(Collectors.summingDouble(e ->e.getSalary()));

        System.out.println(total);

        //AveragingDouble/AveragingDouble
        double average = emp.stream()
                .collect(Collectors.averagingDouble(e ->e.getSalary()));

        System.out.println(average);

        //summarizing
        DoubleSummaryStatistics stats =
                emp.stream()
                        .collect(Collectors.summarizingDouble(e ->e.getSalary()));

        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
    }
}
