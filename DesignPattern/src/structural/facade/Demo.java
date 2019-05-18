package structural.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) throws Exception {
        // TODO fill data source
        ReportGeneratorFacade.generateReport(ReportType.HTML, generateDataSource(), null);
        ReportGeneratorFacade.generateReport(ReportType.PDF, generateDataSource(), null);
    }

    private static DataSource generateDataSource() {
        Random random = new Random();
        List<DataSource> data = new ArrayList<DataSource>();
        data.add(new DataSource("Anna Karenina", "", "Leo Tolstoi", "Die Rache ist mein. Ich will vergelten."));
        // TODO add more

        // return a random text
        return data.get(random.nextInt(data.size()));
    }
}
