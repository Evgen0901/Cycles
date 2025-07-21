package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelanceServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Months.csv")
    public void test(int income, int expenses, int threshold, int numberOfMonths){
        FreelanceService service = new FreelanceService();


        int TotalMonthsOfRest = service.calcMonths(income,expenses ,threshold );
        Assertions.assertEquals(numberOfMonths, TotalMonthsOfRest);

    }
}
