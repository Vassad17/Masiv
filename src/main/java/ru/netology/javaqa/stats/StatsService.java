package ru.netology.javaqa.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (long x : sales) {
            sumSales += x;
        }
        return sumSales;
    }


    public long avgSales(long[] sales) {
        long avgSales = 0;
        for (long x : sales) {
            avgSales += x;
        }
        avgSales = avgSales / sales.length;

        return avgSales;
    }

    public int monthMaxAvg(long[] sales) {
        int monthMaxAvg = 0;
        long avgSalesMonth = avgSales(sales);
        for (long x : sales) {
            if (x > avgSalesMonth) {
                monthMaxAvg++;
            }
        }
        return monthMaxAvg;
    }

    public int monthMinAvg(long[] sales) {
        int monthMinAvg = 0;
        long avgSalesMonth = avgSales(sales);
        for (long x : sales) {
            if (x < avgSalesMonth) {
                monthMinAvg++;
            }
        }
        return monthMinAvg;
    }
}


