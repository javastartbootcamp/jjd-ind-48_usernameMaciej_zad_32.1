package pl.javastart.streamstask;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ExampleTest {
    private final StreamsTask streamsTask = new StreamsTask();



    @Test
    public void shouldReturnTwoWomen() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Alicja", 20));
        users.add(new User(3L, "Patrycja", 25));

        //when
        Collection<User> women = streamsTask.findWomen(users);

        //then
        Assertions.assertEquals(users, women);

    }

    @Test
    public void shouldReturnAverageMenAge() {
        //given
        List<User> users = new ArrayList<>();

        users.add(new User(1L, "Alicja", 20));
        users.add(new User(2L, "Dominik", 15));
        users.add(new User(3L, "Patrycja", 25));
        users.add(new User(4L, "Marcin", 30));
        users.add(new User(5L, "Tomek", 18));
        users.add(new User(6L, "Damian", 26));

        //when
        Double averageMenAge = streamsTask.averageMenAge(users);

        //then
        Assertions.assertEquals(22.25, averageMenAge);
    }

    @Test
    public void shouldReturnGroupExpensesByUserId() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Alicja", 20));
        users.add(new User(2L, "Dominik", 15));

        List<Expense> expenses = new ArrayList<>();
        expenses.add(new Expense(1L, "Buty", new BigDecimal("149.99"), ExpenseType.WEAR));
        expenses.add(new Expense(1L, "Sałatka", new BigDecimal("14.99"), ExpenseType.FOOD));
        expenses.add(new Expense(2L, "Bluza", new BigDecimal("100"), ExpenseType.WEAR));
        expenses.add(new Expense(2L, "Skarpetki", new BigDecimal("39"), ExpenseType.WEAR));
        expenses.add(new Expense(2L, "Pizza", new BigDecimal("25"), ExpenseType.FOOD));

        //when
        Map<Long, List<Expense>> expensesByUserId = streamsTask.groupExpensesByUserId(users, expenses);

        //then
//        Assertions.assertEquals(users, expensesByUserId);

    }

    @Test
    public void shouldReturnGroupExpensesByUser() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Alicja", 20));
        users.add(new User(2L, "Dominik", 15));
        users.add(new User(3L, "Patrycja", 25));
        users.add(new User(4L, "Marcin", 30));
        users.add(new User(5L, "Tomek", 18));
        users.add(new User(6L, "Damian", 26));

        List<Expense> expenses = new ArrayList<>();
        expenses.add(new Expense(1L, "Buty", new BigDecimal("149.99"), ExpenseType.WEAR));
        expenses.add(new Expense(1L, "Sałatka", new BigDecimal("14.99"), ExpenseType.FOOD));
        expenses.add(new Expense(2L, "Bluza", new BigDecimal("100"), ExpenseType.WEAR));
        expenses.add(new Expense(2L, "Skarpetki", new BigDecimal("39"), ExpenseType.WEAR));
        expenses.add(new Expense(2L, "Pizza", new BigDecimal("25"), ExpenseType.FOOD));

        //when

        //then

    }
}
